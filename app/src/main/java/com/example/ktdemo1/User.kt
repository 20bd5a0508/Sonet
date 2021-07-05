package com.example.ktdemo1
import androidx.room.Entity

import androidx.room.PrimaryKey


@Entity(tableName = "User_Table")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var firstName:String,
    var lastName:String,
    var age:Int
)