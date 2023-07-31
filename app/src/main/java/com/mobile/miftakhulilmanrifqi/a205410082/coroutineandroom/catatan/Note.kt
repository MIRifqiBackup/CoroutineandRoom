package com.mobile.miftakhulilmanrifqi.a205410082.coroutineandroom.catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    var title: String?,
    var description: String?,
    var notelepon: String?,
    var priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
