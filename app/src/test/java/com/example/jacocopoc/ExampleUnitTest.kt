package com.example.jacocopoc

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun create_test_function(){
        val o = JacocoClass()
        assertEquals(o.function1("ashish"),"ashish")
    }
}