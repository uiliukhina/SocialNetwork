class VideoAttachment(
    override val type:String="video" ,
    override val typeData:Video
):Attachment  
class Video (
    val id:Int,// Идентификатор фотографии.
    val album_id:Int,//	Идентификатор альбома, в котором находится фотография.
    val owner_id:Int,//	Идентификатор владельца фотографии.
    val user_id:Int,// Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе).
    // Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text:String,// Текст описания фотографии.
    val dateAdd:Int,//	Дата добавления в формате Unixtime.
    val image:Array<Image>,
    val firstFrame: Array<FirstFrame>,
    val dateCreated:Int,//Дата создания видеозаписи в формате Unixtime.
    val adding_date:Int,// Дата добавления видеозаписи пользователем или группой в формате Unixtime.
    val views:Int,// Количество просмотров видеозаписи.
    val local_views:Int,// Если видео внешнее, количество просмотров в ВК.
    val comments:Int,//	Количество комментариев к видеозаписи.
    val player:String,// URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    val platform:String?=null,//	Название платформы (для видеозаписей, добавленных с внешних сайтов).
    val canAdd:Boolean=true,
    val isPrivate: Boolean=true,
    val accessKey:String,
    val processing:Boolean=true,// Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    val isFavorite:Boolean=false,//true, если объект добавлен в закладки у текущего пользователя.
    val canComment:Boolean=true,// Может ли пользователь комментировать видео.
    /*0 — Не может комментировать.
    1 — Может комментировать.*/
    val canEdit:Boolean=false,// Может ли пользователь редактировать видео.
    /*0 — Не может редактировать.
    1 — Может редактировать.*/
    val canLike:Boolean=true,//	'Может ли пользователь добавить видео в список <<Мне нравится>>.
    /*0 — Не может добавить.
    1 — Может добавить.*/
    val canRepost:Boolean=true,//Может ли пользователь сделать репост видео.
    /*0 — Не может сделать репост.
    1 — Может сделать репост.*/
    val canSubscribe:Boolean=true,//Может ли пользователь подписаться на автора видео.
    /*0 — Не может подписаться.
    1 — Может подписаться.*/
    val canAddToFaves:Boolean=true,//Может ли пользователь добавить видео в избранное.
    /*0 — Не может добавить.
    1 — Может добавить.*/
    val canAttachLink:Boolean=false,//Может ли пользователь прикрепить кнопку действия к видео.
    /*0 — Не может прикрепить.
    1 — Может прикрепить.*/
    val width:Int,//Ширина видео.
    val height:Int,//Высота видео.

    val converting:Boolean=false,//Конвертируется ли видео.
    /*0 — Не конвертируется.
    1 — Конвертируется.*/
    val added:Boolean=false,//Добавлено ли видео в альбомы пользователя.
    /*0 — Не добавлено.
    1 — Добавлено.*/
    val is_subscribed:Boolean=false,//Подписан ли пользователь на автора видео.
    val repeat:Int,//Поле возвращается в том случае, если видео зациклено, всегда содержит 1
    val type:String,//Тип видеозаписи. Может принимать значения: "video", "music_video", "movie".
    val balance:Int?=null,//	Баланс донатов в прямой трансляции.
    val live_status:String?=null,//Статус прямой трансляции. Может принимать значения: "waiting", "started", "finished",
    // "failed", "upcoming".
    val live:Boolean?=null,//	Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1.
    // Обратите внимание, в этом случае в поле duration содержится значение 0.
    val upcoming:Boolean?=null,//(для live = 1). Поле свидетельствует о том, что трансляция скоро начнётся.
    val spectators:Int?=null,//Количество зрителей прямой трансляции.
    val likes:LikesVideo,
    val reposts:RepostsVideo
)

data class RepostsVideo(
    val count:Int,
    val wallCount:Int,
    val mailCount :Int,
    val userReposted:Boolean
)

data class LikesVideo(
    val count:Int,
    val userLikes:Boolean
)

data class Image(
    val height:Int,
    val url:String,
    val width:Int,
    val withPadding:Boolean
)

data class FirstFrame(
    val height:Int,
    val url:String,
    val width:Int
)