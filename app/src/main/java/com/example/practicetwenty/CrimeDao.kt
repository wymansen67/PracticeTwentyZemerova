package com.example.practicetwenty

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}