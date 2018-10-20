package co.ghostnotes.sample.font

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun textView_hasProperTextLabel() {
        onView(allOf(withId(R.id.roboto_thin), withText(R.string.roboto_thin_)))
        onView(allOf(withId(R.id.roboto_thin_italic), withText(R.string.roboto_thin_italic)))

        onView(allOf(withId(R.id.roboto_light), withText(R.string.roboto_light)))
        onView(allOf(withId(R.id.roboto_light_italic), withText(R.string.roboto_light_italic)))

        onView(allOf(withId(R.id.roboto_regular), withText(R.string.roboto_regular)))
        onView(allOf(withId(R.id.roboto_regular_italic), withText(R.string.roboto_regular_italic)))

        onView(allOf(withId(R.id.roboto_medium), withText(R.string.roboto_medium)))
        onView(allOf(withId(R.id.roboto_medium_italic), withText(R.string.roboto_medium_italic)))

        onView(allOf(withId(R.id.roboto_condensed_bold), withText(R.string.roboto_condensed_bold)))
        onView(allOf(withId(R.id.roboto_condensed_bold_italic), withText(R.string.roboto_condensed_bold_italic)))
    }

}