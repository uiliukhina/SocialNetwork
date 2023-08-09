class NoteAttachment(
    override val type:String="note",
    override val typeData:Note
):Attachment
class Note (
    val id:Int,// Идентификатор заметки.
    val owner_id:Int,//	Идентификатор владельца заметки.
    val title:String,//	Заголовок заметки.
    val text:String,//	Текст заметки.
    val date:Int,//	Дата создания заметки в формате Unixtime.
    val comments:Int,//	Количество комментариев.
    val read_comments:Int,// Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val view_url:String,// URL страницы для отображения заметки.
    val privacy_view:Array<String>,// Настройки приватности просмотра заметки
    val privacy_comment:Array<String>,//	Настройки приватности комментирования заметки
    val canComment:Boolean=true,//	Есть ли возможность оставлять комментарии
    val text_wiki:String,// Тэги ссылок на wiki
)