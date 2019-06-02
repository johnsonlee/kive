@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("Vue")

package vuejs

import org.w3c.dom.DocumentFragment
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import kotlin.js.*
import kotlin.reflect.KClass

external interface ArrayLike<out T> {
    val length: Number?
        get() = definedExternally

    operator fun get(index: Number): T
}

external interface PropOption {
    var type: dynamic /* Any | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var required: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var default: Any?
        get() = definedExternally
        set(value) = definedExternally
    var twoWay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val validator: ((value: Any) -> Boolean)?
        get() = definedExternally
    val coerce: ((value: Any) -> Any)?
        get() = definedExternally
}

external interface ComputedOption {
    fun get(): Any
    fun set(value: Any)
}

external interface WatchOption {
    fun handler(`val`: Any, oldVal: Any)
    var deep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var immidiate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DirectiveOption {
    val bind: (() -> Any)?
        get() = definedExternally
    val update: ((newVal: Any? /*= null*/, oldVal: Any? /*= null*/) -> Any)?
        get() = definedExternally
    val unbind: (() -> Any)?
        get() = definedExternally
    var params: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var deep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var twoWay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var acceptStatement: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var terminal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var priority: Number?
        get() = definedExternally
        set(value) = definedExternally

    operator fun get(key: String): Any?
    operator fun set(key: String, value: Any)
}

external interface ModifierMap {
    operator fun get(key: String): Boolean?
    operator fun set(key: String, value: Boolean)
}

external interface Directive {
    var el: HTMLElement
    var vm: Vue
    var expression: String
    var arg: String?
        get() = definedExternally;
        set(value) = definedExternally
    var name: String
    var modifiers: ModifierMap
    var descriptor: Any
    var params: Json?
        get() = definedExternally;
        set(value) = definedExternally
}

external interface FilterOption {
    var read: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var write: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TransitionOption {
    var css: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animation: String?
        get() = definedExternally
        set(value) = definedExternally
    var enterClass: String?
        get() = definedExternally
        set(value) = definedExternally
    var leaveClass: String?
        get() = definedExternally
        set(value) = definedExternally
    val beforeEnter: ((el: HTMLElement) -> Unit)? get() = definedExternally
    val enter: ((el: HTMLElement, done: (() -> Unit)? /*= null*/) -> Unit)? get() = definedExternally
    val afterEnter: ((el: HTMLElement) -> Unit)? get() = definedExternally
    val enterCancelled: ((el: HTMLElement) -> Unit)? get() = definedExternally
    val beforeLeave: ((el: HTMLElement) -> Unit)? get() = definedExternally
    val leave: ((el: HTMLElement, done: (() -> Unit)? /*= null*/) -> Unit)? get() = definedExternally
    val afterLeave: ((el: HTMLElement) -> Unit)? get() = definedExternally
    val leaveCancelled: ((el: HTMLElement) -> Unit)? get() = definedExternally
    val stagger: ((index: Number) -> Number)? get() = definedExternally
    val enterStagger: ((index: Number) -> Number)? get() = definedExternally
    val leaveStagger: ((index: Number) -> Number)? get() = definedExternally
    operator fun get(key: String): Any?
    operator fun set(key: String, value: Any)
}

external interface PropOptions {
    operator fun get(key: String): dynamic /* PropOption | Any | Array<Any> */
    operator fun set(key: String, value: PropOption)
    operator fun set(key: String, value: Any)
    operator fun set(key: String, value: Array<Any>)
}

external interface ComputedOptions {
    operator fun get(key: String): dynamic /* Function<*> | ComputedOption */
    operator fun set(key: String, value: Function<*>)
    operator fun set(key: String, value: ComputedOption)
}

external interface Functions {
    operator fun get(key: String): Function<*>?
    operator fun set(key: String, value: Function<*>)
}

external interface WatchOptions {
    operator fun get(key: String): dynamic /* String | (`val`: Any, oldVal: Any) -> Unit | WatchOption */
    operator fun set(key: String, value: String)
    operator fun set(key: String, value: (`val`: Any, oldVal: Any) -> Unit)
    operator fun set(key: String, value: WatchOption)
}

external interface KeyedDirectiveOption {
    operator fun get(key: String): dynamic /* Function<*> | DirectiveOption */
    operator fun set(key: String, value: Function<*>)
    operator fun set(key: String, value: DirectiveOption)
}

external interface `T$6` {
    operator fun get(key: String): dynamic /* Function<*> | FilterOption */
    operator fun set(key: String, value: Function<*>)
    operator fun set(key: String, value: FilterOption)
}

external interface `T$7` {
    operator fun get(key: String): TransitionOption?
    operator fun set(key: String, value: TransitionOption)
}

external interface `T$8` {
    operator fun get(key: String): String?
    operator fun set(key: String, value: String)
}

external interface `T$9` {
    operator fun get(key: String): dynamic /* String | (args: Any) -> dynamic /* Boolean | Unit */ */
    operator fun set(key: String, value: String)
    operator fun set(key: String, value: (args: Any) -> dynamic /* Boolean | Unit */)
}

external class Component {
    var data: dynamic /* Function<*> | Json */ get() = definedExternally; set(value) = definedExternally
    var props: dynamic /* Array<String> | `T$1` */ get() = definedExternally; set(value) = definedExternally
    var computed: ComputedOptions? get() = definedExternally; set(value) = definedExternally
    var methods: Map<String, Function<*>>? get() = definedExternally; set(value) = definedExternally
    var watch: Map<String, dynamic>? get() = definedExternally; set(value) = definedExternally
    var el: dynamic /* String | HTMLElement | () -> HTMLElement */ get() = definedExternally; set(value) = definedExternally
    var template: String? get() = definedExternally; set(value) = definedExternally
    var replace: Boolean? get() = definedExternally; set(value) = definedExternally
    val init: (() -> Unit)? get() = definedExternally
    val created: (() -> Unit)? get() = definedExternally
    val beforeCompile: (() -> Unit)? get() = definedExternally
    val compiled: (() -> Unit)? get() = definedExternally
    val ready: (() -> Unit)? get() = definedExternally
    val attached: (() -> Unit)? get() = definedExternally
    val detached: (() -> Unit)? get() = definedExternally
    val beforeDestroy: (() -> Unit)? get() = definedExternally
    val destroyed: (() -> Unit)? get() = definedExternally
    val activate: (() -> Unit)? get() = definedExternally
    var directives: Map<String, dynamic>? get() = definedExternally; set(value) = definedExternally
    var elementDirectives: Map<String, dynamic>? get() = definedExternally; set(value) = definedExternally
    var filters: Map<String, dynamic>? get() = definedExternally; set(value) = definedExternally
    var components: Json? get() = definedExternally; set(value) = definedExternally
    var transitions: Map<String, TransitionOption>? get() = definedExternally; set(value) = definedExternally
    var partials: Map<String, String>? get() = definedExternally; set(value) = definedExternally
    var parent: Vue? get() = definedExternally; set(value) = definedExternally
    var events: Map<String, dynamic>? get() = definedExternally; set(value) = definedExternally
    var mixins: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var router: VueRouter?
        get() = definedExternally
        set(value) = definedExternally

    operator fun get(key: String): Any?
    operator fun set(key: String, value: Any)
}

@JsName("Vue")
@JsModule("vue")
external class Vue(options: Component) {
    val constructor: Function<*>
    var `$data`: Any
    var `$el`: HTMLElement
    var `$options`: Any
    var `$parent`: Vue
    var `$root`: Vue
    var `$children`: Array<Vue>
    var `$refs`: Any
    var `$els`: Any
    fun `$get`(exp: String, asStatement: Boolean? = definedExternally /* null */): Any
    fun <T> `$set`(key: String, value: T): T
    fun <T> `$set`(key: Number, value: T): T
    fun `$delete`(key: String)
    fun `$eval`(expression: String): String
    fun `$interpolate`(expression: String): String
    fun `$log`(keypath: String? = definedExternally /* null */)
    fun `$watch`(expOrFn: String, callback: String, options: WatchOptions? = definedExternally /* null */): Function<*>
    fun `$watch`(expOrFn: String, callback: (newVal: Any, oldVal: Any? /*= null*/) -> Any, options: WatchOptions? = definedExternally /* null */): Function<*>
    fun `$watch`(expOrFn: Function<*>, callback: String, options: WatchOptions? = definedExternally /* null */): Function<*>
    fun `$watch`(expOrFn: Function<*>, callback: (newVal: Any, oldVal: Any? /*= null*/) -> Any, options: WatchOptions? = definedExternally /* null */): Function<*>
    fun `$nextTick`(callback: Function<*>)
    fun `$appendTo`(target: String, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$appendTo`(target: HTMLElement, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$prependTo`(target: String, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$prependTo`(target: HTMLElement, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$before`(target: String, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$before`(target: HTMLElement, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$after`(target: String, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$after`(target: HTMLElement, callback: Function<*>? = definedExternally /* null */, withTransition: Boolean? = definedExternally /* null */): Vue /* this */
    fun `$remove`(callback: Function<*>? = definedExternally /* null */): Vue /* this */
    fun `$on`(event: String, callback: Function<*>): Vue /* this */
    fun `$once`(event: String, callback: Function<*>): Vue /* this */
    fun `$off`(event: String, callback: Function<*>? = definedExternally /* null */): Vue /* this */
    fun `$emit`(event: String, vararg args: Any): Vue /* this */
    fun `$broadcast`(event: String, vararg args: Any): Vue /* this */
    fun `$dispatch`(event: String, vararg args: Any): Vue /* this */
    fun `$mount`(elementOrSelector: String? = definedExternally /* null */): Vue /* this */
    fun `$mount`(elementOrSelector: HTMLElement? = definedExternally /* null */): Vue /* this */
    fun `$destroy`(remove: Boolean? = definedExternally /* null */)
    fun `$compile`(el: Element, host: Vue? = definedExternally /* null */): Function<*>
    fun `$compile`(el: DocumentFragment, host: Vue? = definedExternally /* null */): Function<*>
    fun _init(options: Component? = definedExternally /* null */)
    fun `$mount`(): Vue /* this */

    companion object {
        var prototype: Vue
        var util: VueUtil
        var config: VueConfig
        fun set(obj: Any, key: String, value: Any)
        fun delete(obj: Any, key: String)
        fun nextTick(callback: Function<*>): Any
        var cid: Number
        fun extend(options: Component? = definedExternally /* null */): Vue.Companion
        fun use(callback: JsClass<*>, option: dynamic = definedExternally): Vue.Companion = definedExternally
        fun use(callback: Function<*>, option: dynamic = definedExternally /* null */): Vue.Companion
        fun use(callback: MiddleWare, option: dynamic = definedExternally /* null */): Vue.Companion
        fun mixin(mixin: Any)
        fun directive(id: String, definition: dynamic): dynamic /* Function<*> | DirectiveOption */
        fun directive(id: String): Any
        fun elementDirective(id: String, definition: dynamic): dynamic /* Function<*> | DirectiveOption */
        fun elementDirective(id: String): Any
        fun filter(id: String, definition: dynamic): dynamic /* Function<*> | FilterOption */
        fun filter(id: String): Any
        fun component(id: String, definition: Component): Any
        fun component(id: String): Any
        fun <T : TransitionOption> transition(id: String, hooks: T): T
        fun transition(id: String): TransitionOption
        fun partial(id: String, partial: String): String
        fun partial(id: String): String
    }
}

external interface VueConfig {
    var debug: Boolean
    var delimiters: dynamic /* JsTuple<String, String> */
    var unsafeDelimiters: dynamic /* JsTuple<String, String> */
    var silent: Boolean
    var async: Boolean
    var devtools: Boolean
}

external interface VueUtil {
    fun set(obj: Any, key: String, value: Any)
    fun del(obj: Any, key: String)
    fun hasOwn(obj: Any, key: String): Boolean
    fun isLiteral(exp: String): Boolean
    fun isReserved(str: String): Boolean
    fun _toString(value: Any): String
    fun <T> toNumber(value: T): dynamic /* Number | T */
    fun <T> toBoolean(value: T): dynamic /* Boolean | T */
    fun stripQuotes(str: String): String
    fun camelize(str: String): String
    fun hyphenate(str: String): String
    fun classify(str: String): String
    fun bind(fn: Function<*>, ctx: Any): Function<*>
    fun <T> toAarray(list: ArrayLike<T>, start: Number? = definedExternally /* null */): Array<T>
    fun <T, F> extend(to: T, from: F): T /* T & F */
    fun isObject(obj: Any): Boolean
    fun isPlainObject(obj: Any): Boolean
    var isArray: Any?
    fun def(obj: Any, key: String, value: Any, enumerable: Boolean? = definedExternally /* null */)
    fun debounce(func: Function<*>, wait: Number): Function<*>
    fun <T> indexOf(arr: Array<T>, obj: T): Number
    fun cancellable(fn: Function<*>): Function<*>
    fun looseEqual(a: Any, b: Any): Boolean
    var hasProto: Boolean
    var inBrowser: Boolean
    var isIE9: Boolean
    var isAndroid: Boolean
    var transitionProp: String
    var transitionEndEvent: String
    var animationProp: String
    var animationEndEvent: String
    fun nextTick(cb: Function<*>, ctx: Any? = definedExternally /* null */)
    fun query(el: String): Element
    fun query(el: Element): Element
    fun inDoc(node: Node): Boolean
    fun getAttr(node: Node, _attr: String): String
    fun getBindAttr(node: Node, name: String): String
    fun before(el: Element, target: Element)
    fun after(el: Element, target: Element)
    fun remove(el: Element)
    fun prepend(el: Element, target: Element)
    fun replace(target: Element, el: Element)
    fun on(el: Element, event: String, cb: Function<*>)
    fun off(el: Element, event: String, cb: Function<*>)
    fun addClass(el: Element, cls: String)
    fun removeClass(el: Element, cls: String)
    fun extractContent(el: Element, asFragment: Boolean): dynamic /* DocumentFragment | HTMLDivElement */
    fun trimNode(node: Node)
    fun isTemplate(el: Element): Boolean
    fun createAnchor(content: String, persist: Boolean): dynamic /* Comment | Text */
    fun findRef(node: Element): String
    fun mapNodeRange(node: Node, end: Node, op: Function<*>)
    fun removeNodeRange(start: Node, end: Node, vm: Any, frag: DocumentFragment, cb: Function<*>)
    fun <P, C> mergeOptions(parent: P, child: C, vm: Any? = definedExternally /* null */): P /* P & C */
    fun resolveAsset(options: Any, type: String, id: String): dynamic /* Any | Function<*> */
    fun assertAsset(`val`: Any, type: String, id: String)
    var commonTagRE: RegExp
    fun checkComponentAttr(el: Element, options: Any? = definedExternally /* null */): Any
    fun initProp(vm: Vue, prop: Any, value: Any)
    fun assertProp(prop: Any, value: Any): Boolean
    fun warn(msg: String, e: Error? = definedExternally /* null */)
    fun defineReactive(obj: Any, key: String, `val`: Any)
}

external interface MiddleWare {
    var install: Function<*>
    operator fun get(key: String): Any?
    operator fun set(key: String, value: Any)
}
