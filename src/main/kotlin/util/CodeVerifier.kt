package util

import java.security.SecureRandom
import java.util.*

class CodeVerifier {
    companion object {
        fun generate(): String {
            val secureRandom = SecureRandom()
            val codeVerifier = ByteArray(32)
            secureRandom.nextBytes(codeVerifier)
            return Base64.getUrlEncoder().withoutPadding().encodeToString(codeVerifier)
        }
    }
}