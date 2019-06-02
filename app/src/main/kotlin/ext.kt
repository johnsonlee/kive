@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

fun <T> jsobject(fn: T.() -> Unit) = (js("{}") as T).apply(fn)

fun <T : Any> JsClass<T>.new(vararg args: dynamic): T {
    @Suppress("UNUSED_VARIABLE")
    val ctor = this
    @Suppress("UNUSED_VARIABLE")
    val argsArray = (listOf(null) + args).toTypedArray()
    //language=JavaScript 1.6
    return js("new (Function.prototype.bind.apply(ctor, argsArray))").unsafeCast<T>()
}
