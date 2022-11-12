class Post(
    id: Int,//  Идентификатор записи.
    ownerId: Int,// Идентификатор владельца стены, на которой размещена запись.
    fromId: Int,//  Идентификатор автора записи (от чьего имени опубликована запись).
    date: Int,//    Время публикации записи в формате unixtime.
    text: String,
    friendsOnly: Boolean,
    canPin: Boolean,
    canDelete: Boolean,
    canEdit: Boolean,
    isPinned: Boolean,
    markedAsAds: Boolean,
    isFavorite: Boolean//   true, если объект добавлен в закладки у текущего пользователя
) {

}

