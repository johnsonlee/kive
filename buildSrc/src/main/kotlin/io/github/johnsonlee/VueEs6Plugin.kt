package io.github.johnsonlee

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File

/**
 * Gradle plugin for Vue module
 */
class VueEs6Plugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.findByName("compileKotlin2Js")?.let { compileKotlin2Js ->
            compileKotlin2Js.doLast {
                it.outputs.files.files.filter(File::isFile).forEach { output ->
                    val module = output.readText()
                    output.writeText(module.replace(Regex("require\\('(vue(-\\w+)?)'\\)"), "require('$1').default"))
                }
            }
        }
    }

}