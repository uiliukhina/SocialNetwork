
class Photo (
    val id:Int,//	Идентификатор фотографии.
    val album_id:Int,//	Идентификатор альбома, в котором находится фотография.
    val owner_id:Int,//	Идентификатор владельца фотографии.
    val user_id:Int,//	Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text:String,//	Текст описания фотографии.
    val date:Int,//	Дата добавления в формате Unixtime.
    val sizes: Array<Sizes>,
    val width:Int,
    val height:Int
)
class PhotoAttachment(
    override val type:String = "photo",
    override val typeData:Photo
):Attachment