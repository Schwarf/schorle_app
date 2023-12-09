package abs.apps.schorle_app.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event")
data class Event(
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "dateTimestamp")
    var dateTimestamp: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
