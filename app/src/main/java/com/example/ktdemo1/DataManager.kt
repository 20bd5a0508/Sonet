package com.example.ktdemo1

class DataManager {
    var courses= HashMap<String,Courseclass>()
    var notes=ArrayList<NoteInfo>()
    init {
        initCourse()
        initNote()
    }

    private fun initCourse(){
        var course= Courseclass("Kotlin_2021","Android Development with Kotlin")
        courses.put(course.courseId,course)
        course= Courseclass("Reactjs_2021","web development with JS")
        courses.put(course.courseId,course)
        course= Courseclass("ML_2021","Machine Learning with Python")
        courses.put(course.courseId,course)
    }
    private fun initNote(){
        var note=NoteInfo(courses["Kotlin_2021"]  as Courseclass,"Activity","Learning Andriod Activity")
        notes.add(note)

        note=NoteInfo(courses["Kotlin_2021"]  as Courseclass,"Intent","Learning Andriod Intent ")
        notes.add(note)


    }
}