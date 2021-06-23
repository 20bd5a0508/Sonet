package com.example.ktdemo1

class NoteInfo(var course: Courseclass,var title:String,var text:String) {
    override fun toString(): String {
        return "${course.title} -$title"
    }
}