package com.github.zenexer.xenforo2phpstorm.services

import com.intellij.openapi.project.Project
import com.github.zenexer.xenforo2phpstorm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
