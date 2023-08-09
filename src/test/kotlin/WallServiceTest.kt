import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class WallServiceTest {
    var newPost1 = Post(
        id= 0,
        ownerId= 0,
        fromId= 1,
        createdBy=2,
        date = 1691482573,
        text="post0",
        replyOwnerId= 2,
        replyPostId=7,
        likes=Likes(3, false, true, false),
        reposts=Reposts(4),
        views=Views(5),
        postType = "post",
        comment= Comment(6)
    )

    var newPost2 = Post(
        id= 0,
        ownerId= 10,
        fromId=11,
        createdBy=12 ,
        date = 1691482573,
        text="post1",
        replyOwnerId= 12,
        replyPostId=17,
        likes=Likes(13, false, true, false),
        reposts=Reposts(14),
        views=Views(15),
        postType = "reply",
        comment=Comment(16),
        attachment= arrayOf(
            NoteAttachment(typeData = Note(id=23,
                owner_id=34,
                title="note title",
                text="note text",
                date=1691512338,
                comments=5,
                read_comments=2,
                view_url="https//:url",
                privacy_view= arrayOf("vi","e","w"),
                privacy_comment= arrayOf("com","men","t"),
                text_wiki="tag"))
        )
    )

    var newPost3 = Post(
        id= 2,
        ownerId= 20,
        fromId=21,
        createdBy=13,
        date = 1691482573,
        text="post2",
        replyOwnerId= 22,
        replyPostId=27,
        likes=Likes(33, false, true, false),
        reposts=Reposts(24),
        views=Views(25),
        postType = "post",
        comment=Comment(26)
    )


    @Test
    fun add() {
        val result = WallService.add(newPost1)
        assertNotEquals(-1, result.id)
    }

    @Test
    fun updateTrue() {
        WallService.add(newPost1)
        val result = WallService.update(newPost2)
        assertEquals(true, result)
    }

    @Test
    fun updateFalse() {
        val result = WallService.update(newPost3)
        assertEquals(false, result)
    }
}