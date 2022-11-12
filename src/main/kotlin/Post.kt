data class Post(
    val id: Int,//  Идентификатор записи.
    val ownerId: Int,// Идентификатор владельца стены, на которой размещена запись.
    val fromId: Int,//  Идентификатор автора записи (от чьего имени опубликована запись).
    val date: Int,//    Время публикации записи в формате unixtime.
    val text: String,
    val friendsOnly: Boolean,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean//   true, если объект добавлен в закладки у текущего пользователя
)

