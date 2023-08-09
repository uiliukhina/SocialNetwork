data class Preview(
    val photo:PhotoPreview,
    val graffiti:Graffiti,
    val audioMessage:AudioMessage
)

data class AudioMessage(
    val duration:Int,
    val waveform: Array<Int>,
    val linkOgg:String,
    val linkMp3:String
)

data class Graffiti(
    val src:String,
    val width:Int,
    val height:Int
)

data class PhotoPreview(
    val sizes: Array<Sizes>
)