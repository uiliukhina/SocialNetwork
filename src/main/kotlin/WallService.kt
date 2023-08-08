object WallService {
    private var posts = emptyArray<Post>()
    private var nextId: Int = 0
    fun add(post: Post): Post {
        nextId = if (posts.isEmpty()) 0 else posts.last().id + 1
        val added = post.copy(id = nextId)
        posts += added
        return added
    }

    fun update(post: Post): Boolean {
        for ((index,postEx ) in posts.withIndex()) {
            if (post.id == postEx.id){
                val updated = post.copy(ownerId = postEx.ownerId, date = postEx.date)
                posts[index] = updated
                return true
            }
        }
        return false
    }
}