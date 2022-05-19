package com.github.ecfcg.jsonschema2kotlin.services

import com.intellij.openapi.project.Project
import com.github.ecfcg.jsonschema2kotlin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
