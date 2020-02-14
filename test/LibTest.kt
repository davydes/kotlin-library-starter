import org.assertj.core.api.Assertions.assertThat

class LibTest {
  fun hello() {
    assertThat(Lib().hello()).isEqualTo("hello world")
  }
}
