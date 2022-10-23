package com.hellomotem.studentproject.data

data class Achievement(
    val diploma: DiplomaType = DiplomaType.DEFAULT,
    val medal: Medal = Medal.NONE
)