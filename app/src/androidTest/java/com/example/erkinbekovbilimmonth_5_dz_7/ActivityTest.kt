package com.example.erkinbekovbilimmonth_5_dz_7

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd(){
        Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.typeText("10"))
        Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.typeText("10"))
        Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btnCalc)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult))
            .check(ViewAssertions.matches(ViewMatchers.withText("20")))
    }
    @Test
    fun simpleDivide(){
        Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.typeText("0"))
        Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.typeText("2"))
        Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btnCalcDiv)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult))
            .check(ViewAssertions.matches(ViewMatchers.withText("0")))
    }
    @Test
    fun zeroDivide(){
        Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.typeText("2"))
        Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.typeText("0"))
        Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btnCalcDiv)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult))
            .check(ViewAssertions.matches(ViewMatchers.withText("на ноль делить нельзя")))
    }
}