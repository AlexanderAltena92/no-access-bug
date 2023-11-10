import com.example.fragment.UserDetails
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
  @Test
  fun testStuff() {
    val user = UserDetails(
      id = "42",
      name = "John Doe",
      address = UserDetails.Address(
        number = 42,
        street = "Downing Street",
        city = "Paris"
      )
    )

    assertEquals(42, user.address.number)
  }
}