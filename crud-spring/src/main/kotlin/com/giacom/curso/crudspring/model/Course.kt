package com.giacom.curso.crudspring.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Course(
    @Id
    var id: String,
    var name: String,
    var category: String
)
