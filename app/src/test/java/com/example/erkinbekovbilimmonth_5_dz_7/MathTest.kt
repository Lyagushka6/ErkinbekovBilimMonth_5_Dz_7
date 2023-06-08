package com.example.erkinbekovbilimmonth_5_dz_7

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd(){
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun doubleAdd(){
        assertEquals("4", math?.add("2.0", "2"))
    }

    @Test
    fun negativeAdd(){
        assertEquals("-4", math?.add("-2", "-2"))
    }

    @Test
    fun emptyAdd(){
        assertEquals("Одно из полей пусто", math?.add("", "2"))
    }

    @Test
    fun charAdd(){
        assertEquals("Нельзя вводить буквы", math?.add("asd4asdf", "2"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("0", math?.divide("0", "2"))
    }

    @Test
    fun zeroDivide(){
        assertEquals("На ноль делить нельзя", math?.divide("2", "0"))
    }


    @After
    fun detach(){
        math = null
    }

}