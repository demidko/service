import assertk.assertThat
import assertk.assertions.isEqualTo
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.http.HttpStatusCode.Companion.OK
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class AppKtTest {

  @Test
  fun testLocalhostServer() {
    localhostServer().start(false)
    val answer = runBlocking {
      HttpClient().use {
        it.get<HttpStatusCode>()
      }
    }
    assertThat(answer).isEqualTo(OK)
  }
}