object Room {
    const val roomVersion = "2.4.3"
    const val room = "androidx.room:room-ktx:$roomVersion"
    const val compiler = "androidx.room:room-compiler:$roomVersion"
}

object RoomTest {
    const val roomTesting = "androidx.room:room-testing:${Room.roomVersion}"
}