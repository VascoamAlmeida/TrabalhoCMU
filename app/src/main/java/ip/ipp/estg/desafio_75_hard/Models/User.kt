package ip.ipp.estg.desafio_75_hard.Models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    val name: String,
    val email: String,
    val age: Int,
    val profilePicture: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
