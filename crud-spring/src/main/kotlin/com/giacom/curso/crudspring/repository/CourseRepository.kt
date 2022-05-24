package com.giacom.curso.crudspring.repository

import com.giacom.curso.crudspring.model.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository : JpaRepository<Course, String> {

}
