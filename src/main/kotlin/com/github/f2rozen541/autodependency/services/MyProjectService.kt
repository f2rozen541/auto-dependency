package com.github.f2rozen541.autodependency.services

import com.github.f2rozen541.autodependency.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
