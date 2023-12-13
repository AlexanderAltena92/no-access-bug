package com.example.mylibrary2

import com.example.mylibrary2.fragment.UserDetails
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


/**
 * First test will fail with:
 *  Cannot access class 'com.example.mylibrary2.fragment.UserDetails.Address'.
 *  Check your module classpath for missing or conflicting dependencies.
 *
 *  However if you comment the first test and uncomment the second + extension the test will pass,
 *  even-though the code is the same as the code called in [toHelloWorld]
 */
class FailingUnitTest {

    @Test
    fun `failing access test`() {
        val user = UserDetails.Address(1, "test", "test")

        assertEquals("Hello World", user.toHelloWorld())
    }

//    @Test
//    fun `succeeding access test`() {
//        val user = UserDetails.Address(1, "test", "test")
//
//        assertEquals("Hello World", user.toHelloWorldSuccess())
//    }
//
//    private fun UserDetails.Address.toHelloWorldSuccess(): String = "Hello World"
}
