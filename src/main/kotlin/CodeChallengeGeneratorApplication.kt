import util.CodeChallenge
import util.CodeVerifier

class CodeChallengeGeneratorApplication

fun main(args: Array<String>){
    println("----------------------------------------")
    println("-> GENERATING CODE VERIFIER...")
    val codeVerifier = CodeVerifier.generate()
    println("-> CODE VERIFIER = $codeVerifier")
    println("----------------------------------------")
    println("-> GENERATING CODE CHALLENGE...")
    val codeChallenge = CodeChallenge.generate(codeVerifier)
    println("-> CODE CHALLENGE = $codeChallenge")
    println("----------------------------------------")
}