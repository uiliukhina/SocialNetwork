data class Post(
    var id: Int = 0,//  Идентификатор записи.
    val ownerId: Int,// Идентификатор владельца стены, на которой размещена запись.
    val fromId: Int,//  Идентификатор автора записи (от чьего имени опубликована запись).
    val createdBy:Int,// Идентификатор администратора, который опубликовал запись
    val date: Int,//    Время публикации записи в формате unixtime.
    val text: String,
    val replyOwnerId: Int, // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Int, // Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean = true,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val postSource: PostSource,
    val geo: Geo,
    val signerId: Int,
    val copyHistory: Int[],
    val canPin: Boolean = true,
    val canDelete: Boolean= true,
    val canEdit: Boolean= true,
    val isPinned: Boolean= false,
    val markedAsAds: Boolean= false,
    val isFavorite: Boolean = false,//   true, если объект добавлен в закладки у текущего пользователя
    val donut: Donut,
    val postponedId: Int,
    val comment: Comment

    )

