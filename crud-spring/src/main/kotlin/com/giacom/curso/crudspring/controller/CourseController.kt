package com.giacom.curso.crudspring.controller

import com.giacom.curso.crudspring.model.Course
import com.giacom.curso.crudspring.repository.CourseRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/courses")
class CourseController(val courseRepository: CourseRepository) {
    @GetMapping
    fun list(): MutableList<Course> {
        return courseRepository.findAll()
    }
}
