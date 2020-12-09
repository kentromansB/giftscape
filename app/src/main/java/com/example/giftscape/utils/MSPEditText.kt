package com.example.giftscape.utils


import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView


class MSPEditText(context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {

    /**
     * The init block runs every time the class is instantiated.
     */
    init {

        applyFont()
    }

    /**
     * Applies a font to a EditText.
     */
    private fun applyFont() {

        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        setTypeface(typeface)
    }
}
