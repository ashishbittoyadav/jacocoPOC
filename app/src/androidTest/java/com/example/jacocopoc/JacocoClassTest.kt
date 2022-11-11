package com.example.jacocopoc

import org.junit.Test


internal class JacocoClassTest{

    @Test
    fun testing_function(){
        val o = JacocoClass()
        assert(o.function1("asdf")=="asdf")
    }
}