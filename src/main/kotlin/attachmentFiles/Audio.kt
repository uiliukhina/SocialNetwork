
class Audio(
    val id:Int, //Идентификатор аудиозаписи.
    val owner_id:Int,//Идентификатор владельца аудиозаписи.
    val artist:String,//Исполнитель.
    val title:String,// Название композиции.
    val duration: Int,//Длительность аудиозаписи в секундах.
    val url:String,//Ссылка на mp3.
    val lyricsId:Int,// Идентификатор текста аудиозаписи (если доступно).
    val albumId:Int,// Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genreId:Int,// Идентификатор жанра из списка аудио жанров.
    val date:Int,// Дата добавления.
    val no_search:Boolean,//1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val is_hq:Boolean,//1, если аудио в высоком качестве.
)
class AudioAttachment(
    override val type:String="audio",
    override val typeData: Audio
):Attachment