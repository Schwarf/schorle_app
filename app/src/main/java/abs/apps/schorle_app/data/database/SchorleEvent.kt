package abs.apps.schorle_app.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schorleEvent")
data class SchorleEvent(
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "dateTimestamp")
    var dateTimestamp: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
