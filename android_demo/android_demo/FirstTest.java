package com.mytaxi.android_demo;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Nishtha Verma on 2018-03-16.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FirstTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

   //providing the variables to be passed in test here
    private String username = "whiteelephant261";
    private String password = "video";
    private String searchcriteria ="sa";
    private String matchingDriver="Sarah Friedrich";

    @Before
    public void setUp() throws Exception {
        //Before Test case execution
    }

    @Test
       public void LoginAndSearch(){
        //Espresso is a library

        //Typing in the username
        Espresso.onView(ViewMatchers.withId(R.id.edt_username)).perform(ViewActions.typeText(username),closeSoftKeyboard());

        //Typing in the password
        Espresso.onView(ViewMatchers.withId(R.id.edt_password)).perform(ViewActions.typeText(password),closeSoftKeyboard());

        //clicking in login button
        Espresso.onView(ViewMatchers.withId(R.id.btn_login)).perform(click());

        //waiting for 3 seconds for next page to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Typing in the search criteria
        Espresso.onView(ViewMatchers.withId(R.id.textSearch)).perform(ViewActions.typeText(searchcriteria),closeSoftKeyboard());

        //Select Sarah Friedrich
        Espresso.onView(withText(matchingDriver))
                .inRoot(RootMatchers.isPlatformPopup())
                .perform(click());

        //waiting for 3 seconds for next page to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Verify if the matching driver is displayed
        Espresso.onView(withText(matchingDriver)).check(matches(isDisplayed()));

        //Click on call button for the searched driver
        //takes the user to phone calling screen of the phone
        Espresso.onView(ViewMatchers.withId(R.id.fab))
                .perform(click());

    }


    @After
    public void tearDown() throws Exception {
        //no code here
    }
}

