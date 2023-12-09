package abs.apps.schorle_app.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "participants",
    foreignKeys = [
        ForeignKey(
        entity = Participants::class,
        parentColumns = ["id"],
        childColumns = ["participantId"],
        onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = SchorleEvent::class,
            parentColumns = ["id"],
            childColumns = ["eventId"],
            onDelete = ForeignKey.CASCADE
        ),
                ],
    indices = [Index(value = ["participantId", "eventId"])]
)
data class EventRecords(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "participantId")
    val participantId: Int,
    @ColumnInfo(name = "eventId")
    val eventId: Int,
)
