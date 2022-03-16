package com.namepros.idea.xenforo.services

import com.intellij.openapi.project.Project
import com.namepros.idea.xenforo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
