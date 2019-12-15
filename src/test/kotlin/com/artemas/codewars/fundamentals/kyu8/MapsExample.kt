import com.artemas.codewars.fundamentals.kyu8.maps
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MapsExample {

    @Test
    fun `Should return numbers mapped by two`() {
        assertArrayEquals(intArrayOf(2, 4, 6), maps(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), maps(intArrayOf(4, 1, 1, 1, 4)))
        assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), maps(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}