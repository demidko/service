import com.google.common.truth.Truth.assertThat
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.HttpStatusCode.Companion.OK
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class AppKtTest {

  @Test
  @Disabled
  fun testLocalhostServer() {
    localhostServer().start(false)
    val answer = runBlocking {
      HttpClient().use {
        it.get("http://localhost:80/")
      }
    }
    assertThat(answer.status).isEqualTo(OK)
  }
}