package com.example.priya.testapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
/**
 * Created by priya on 3/28/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testSomething(){
        onView(withId(R.id.tvContent)).perform(typeText("Hello Espresso"),closeSoftKeyboard());
        onView(withId(R.id.tvContent)).check(ViewAssertions.matches(withText("Hello Espresso")));
    }
}
