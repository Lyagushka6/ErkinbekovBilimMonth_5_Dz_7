package com.example.erkinbekovbilimmonth_5_dz_7

import kotlin.math.roundToInt

class Math {

    fun add(a: String, b: String): String{
        var result = ""
        if (a.isEmpty() || b.isEmpty()){
            result = "Одно из полей пусто"
        } else if (a.toDoubleOrNull() == null || b.toDoubleOrNull() == null) {
            result = "Нельзя вводить буквы"
        }else{
            result = (a.toDouble() + b.toDouble()).roundToInt().toString()
        }
        return result
    }

    fun divide(a: String, b: String): String{
        var result = ""
        if (b == "0"){
            result = "На ноль делить нельзя"
        }else{
            result = (a.toDouble() / b.toDouble()).roundToInt().toString()
        }
        return result
    }
}