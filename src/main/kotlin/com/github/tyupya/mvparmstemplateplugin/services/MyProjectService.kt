package com.github.tyupya.mvparmstemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.tyupya.mvparmstemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
