package util

import java.security.MessageDigest
import java.util.Base64

class CodeChallenge {
    companion object {
        fun generate(codeVerifier: String): String {
            val bytes = codeVerifier.toByteArray(Charsets.US_ASCII)
            val messageDigest = MessageDigest.getInstance("SHA-256")
            messageDigest.update(bytes, 0, bytes.size)
            val digest = messageDigest.digest()
            return Base64.getUrlEncoder().withoutPadding().encodeToString(digest)
        }
    }
}