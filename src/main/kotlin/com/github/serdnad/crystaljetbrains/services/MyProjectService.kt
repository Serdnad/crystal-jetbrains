package com.github.serdnad.crystaljetbrains.services

import com.intellij.openapi.project.Project
import com.github.serdnad.crystaljetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
