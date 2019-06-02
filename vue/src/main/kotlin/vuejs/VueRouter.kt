@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("vuejs")

package vuejs

import kotlin.js.*
import org.w3c.dom.*

@JsModule("vue-router")
external class VueRouter(options: RouterOptions) {
    var app: Vue?
        get() = definedExternally
        set(value) = definedExternally
    var mode: String?
        get() = definedExternally
        set(value) = definedExternally
    var currentRoute: Route
        get() = definedExternally
        set(value) = definedExternally

    fun beforeEach(to: Route, from: Route, next: Function<*>): dynamic = definedExternally
    fun beforeResolve(to: Route, from: Route, next: Function<*>): dynamic = definedExternally
    fun afterEach(to: Route, from: Route): dynamic = definedExternally
    fun push(location: Location, onComplete: Function<*>? = definedExternally, onAbort: Function<*>? = definedExternally): dynamic = definedExternally
    fun replace(location: Location, onComplete: Function<*>? = definedExternally, onAbort: Function<*>? = definedExternally): dynamic = definedExternally
    fun go(n: Number): dynamic = definedExternally
    fun back(): dynamic = definedExternally
    fun forward(): dynamic = definedExternally
    fun getMatchedComponents(location: Location? = definedExternally): Array<Component> = definedExternally
    fun resolve(location: Location, current: Route? = definedExternally, append: String? = definedExternally): Resolved = definedExternally
    fun addRoutes(routes: Array<RouteConfig>): dynamic = definedExternally
    fun onReady(callback: Function<*>, errorCallback: Function<*>? = definedExternally): dynamic = definedExternally
    fun onError(callback: Function<*>): dynamic = definedExternally

}

external interface Resolved {
    var location: Location?
        get() = definedExternally
        set(value) = definedExternally
    var route: Route?
        get() = definedExternally
        set(value) = definedExternally
    var href: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RouterOptions {
    var routes: Array<RouteConfig>?
        get() = definedExternally
        set(value) = definedExternally
    var mode: String? /* "hash" | "abstract" */
        get() = definedExternally
        set(value) = definedExternally
    var base: String? /* default: "/" */
        get() = definedExternally
        set(value) = definedExternally
    var linkActiveClass: String? /* default: "router-link-active" */
        get() = definedExternally
        set(value) = definedExternally
    var linkExactActiveClass: String? /* default: "router-link-exact-active" */
        get() = definedExternally
        set(value) = definedExternally
    var scrollBehavior: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var parseQuery: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var stringifyQuery: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var fallback: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RouteConfig {
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var component: Component?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var components: Map<String, Component>?
        get() = definedExternally
        set(value) = definedExternally
    var redirect: dynamic /* String | Location | Function */
        get() = definedExternally
        set(value) = definedExternally
    var props: dynamic /* boolean | Object | Function */
        get() = definedExternally
        set(value) = definedExternally
    var alias: dynamic /* String | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<RouteConfig>?
        get() = definedExternally
        set(value) = definedExternally
    var beforeEnter: ((to: Route, from: Route, next: Function<*>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var meta: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var caseSensitive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external class Route {
    val path: String?
        get() = definedExternally
    val params: Json?
        get() = definedExternally
    val query: Json?
        get() = definedExternally
    val hash: String?
        get() = definedExternally
    val fullPath: String?
        get() = definedExternally
    val matched: Array<RouteConfig>?
        get() = definedExternally
    val name: String?
        get() = definedExternally
    val redirectedFrom: String?
        get() = definedExternally
}

