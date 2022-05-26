package com.giacom.curso.crudspring.controller

import com.giacom.curso.crudspring.model.Course
import com.giacom.curso.crudspring.repository.CourseRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/courses")
class CourseController(val courseRepository: CourseRepository) {
    @GetMapping
    fun list(): MutableList<Course> {
        return courseRepository.findAll()
    }
    @PostMapping
    fun save(@RequestBody course:Course): Course {
        course.id = UUID.randomUUID().toString()
        return courseRepository.save(course)
    }
}
