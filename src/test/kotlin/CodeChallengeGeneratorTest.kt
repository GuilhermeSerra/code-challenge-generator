import org.junit.Test
import util.CodeChallenge
import util.CodeVerifier

class CodeChallengeGeneratorTest {
    @Test
    fun generateCodeVerifier() {
        println("CodeVerifier \n ${CodeVerifier.generate()}")
    }

    @Test
    fun generateCodeChallenge() {
        println("CodeChallenge \n ${CodeChallenge.generate(CodeVerifier.generate())}")
    }

    @Test
    fun generateCodeChallengePlainCodeVerifier() {
        println("CodeChallenge \n ${CodeChallenge.generate("497e9e4298441cf8322d63646800e9a31cf47e251d75522525aaf716")}")
    }
}