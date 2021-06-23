package com.example.ktdemo1

class DataManager {
    var courses= HashMap<String,Courseclass>()
    var notes=ArrayList<NoteInfo>()
    init {
        initCourse()
    }

    private fun initCourse(){
        var course= Courseclass("Kotlin_2021","Android Development with Kotlin")
        courses.put(course.courseId,course)
        course= Courseclass("Reactjs_2021","web development with JS")
        courses.put(course.courseId,course)
        course= Courseclass("ML_2021","Machine Learning with Python")
        courses.put(course.courseId,course)
    }
}