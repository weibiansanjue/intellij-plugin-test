package com.github.weibiansanjue.intellijplugintest.services

import com.github.weibiansanjue.intellijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
