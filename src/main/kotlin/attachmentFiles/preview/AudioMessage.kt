data class AudioMessage(
    val duration:Int,
    val waveform: Array<Int>,
    val linkOgg:String,
    val linkMp3:String
)