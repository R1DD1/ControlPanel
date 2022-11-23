package theme

import androidx.compose.material.ButtonDefaults
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object Theme {
    private val primary = Color(245, 222,179)
    private val secondary = Color(208, 176, 132)

    fun primary() = primary
    fun secondary() = secondary

    @Composable
    fun textFieldColors(
        textColor: Color = Color.Black,
        disabledTextColor: Color = Color.White,
        cursorColor: Color = Color.Black,
        backgroundColor: Color = Color.White,
        errorCursorColor: Color = Color.White,

    ) = TextFieldDefaults.textFieldColors(
        textColor = textColor,
        disabledTextColor = disabledTextColor,
        backgroundColor = backgroundColor,
        cursorColor = cursorColor,
        errorCursorColor = errorCursorColor,
        focusedLabelColor = Color(0f,0f,.0f, .5f),
        focusedIndicatorColor = primary

    )

    @Composable
    fun buttonColors(
        backgroundColor: Color = primary,
        contentColor: Color = Color.White
    ) = ButtonDefaults.buttonColors(
        backgroundColor = primary,
        contentColor =contentColor
    )
}