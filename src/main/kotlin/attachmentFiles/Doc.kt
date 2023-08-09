class DocAttachment(
    override val type:String="doc",
    override val typeData:Doc,
):Attachment

class Doc(
    val id:Int,//Идентификатор документа.
    val owner_id:Int,//	Идентификатор пользователя, загрузившего документ.
    val title:String,//	Название документа.
    val size:Int,//	Размер документа в байтах.
    val ext:String,// Расширение документа.
    val url:String,//Адрес документа, по которому его можно загрузить.
    val date:Int,//	Дата добавления в формате Unixtime.
    val type:Int,//integer	Тип документа. Возможные значения:
/*1 — текстовые документы;
2 — архивы;
3 — gif;
4 — изображения;
5 — аудио;
6 — видео;
7 — электронные книги;
8 — неизвестно.*/
    val preview: Preview
)