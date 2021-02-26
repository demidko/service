import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.testng.annotations.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.System.setOut

class AppKtTest {

  @Test
  fun testMain() {
    val injectedOutput = ByteArrayOutputStream()
    setOut(PrintStream(injectedOutput))
    main(arrayOf())
    assertThat(injectedOutput.toByteArray().decodeToString(), equalTo("Application successfully started\n"))
  }
}