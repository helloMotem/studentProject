package com.hellomotem.studentproject.data

data class Student(
    val id: String,
    val firstName: String,
    val secondName: String,
    val middleName: String,
    val school: School,
    val achievement: Achievement,
    val address: Address,
    val selectedSpeciality: Speciality
)
