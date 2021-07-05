package com.example.ktdemo1
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDAO {
    @Insert
    suspend  fun addUser(user: User)
    @Query("Select * from user_table")
    suspend fun readAllData() :List<User>
}