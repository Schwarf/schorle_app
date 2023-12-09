package abs.apps.schorle_app.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schorle_event")
data class SchorleEvent(
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "timestamp")
    var dateTimestamp: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
