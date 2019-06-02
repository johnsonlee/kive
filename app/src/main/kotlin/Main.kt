import vuejs.*
import kotlin.js.*

fun main() {
    val home: Component = jsobject {
        template = """
            <div class="home">
                <span>{{message}}</span>
            </div>
        """.trimIndent()
        data = js("""function() {
            return {
                message: 'Hello, Vue in Kotlin!'
            }
        }""")
    }
    val settings: Component = jsobject {
        template = """
        <div class="settings">
            <span>{{message}}</span>
        </div>
        """.trimIndent()
        data = {
            json("message" to "Welcome to Settings")
        }
    }
    val router = VueRouter(jsobject {
        routes = arrayOf(
                jsobject {
                    path = "/"
                    component = home
                },
                jsobject {
                    path = "/settings"
                    component = settings
                }
        )
    })

    Vue.use(VueRouter::class.js)

    val app = Vue(jsobject {
        template = """
            <div id="app">
                <router-view />
            </div>
        """.trimIndent()
        this.router = router
    }).`$mount`("#app")
}