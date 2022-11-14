import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class WallServiceTest {
    var newPost1 = Post(
        ownerId = 1, fromId = 1, date = 1668419390,
        text = "new post 1", comment = Comment(1)
    )

    var newPost2 = Post(
        id = 1, ownerId = 2, fromId = 2, date = 1668419390,
        text = "new post 2", comment = Comment(2)
    )

    var newPost3 = Post(
        id = 3, ownerId = 3, fromId = 3, date = 1668419390,
        text = "new post 3", comment = Comment(3)
    )


    @Test
    fun add() {
        val result = WallService.add(newPost1)
        assertNotEquals(0, result.id)
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