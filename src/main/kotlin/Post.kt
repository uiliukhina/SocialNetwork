data class Post(
    var id: Int = 0,//  Идентификатор записи.
    val ownerId: Int,// Идентификатор владельца стены, на которой размещена запись.
    val fromId: Int,//  Идентификатор автора записи (от чьего имени опубликована запись).
    val date: Int,//    Время публикации записи в формате unixtime.
    val text: String,
    val friendsOnly: Boolean = true,
    val canPin: Boolean = true,
    val canDelete: Boolean= true,
    val canEdit: Boolean= true,
    val isPinned: Boolean= false,
    val markedAsAds: Boolean= false,
    val isFavorite: Boolean = false,//   true, если объект добавлен в закладки у текущего пользователя
    val comment: Comment
    )

