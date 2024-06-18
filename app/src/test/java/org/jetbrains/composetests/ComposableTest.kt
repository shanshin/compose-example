package org.jetbrains.composetests

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ComposableTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun basicTestCase() {
        rule.setContent {
            Greeting(
                name = "Android"
            )
        }
    }
}