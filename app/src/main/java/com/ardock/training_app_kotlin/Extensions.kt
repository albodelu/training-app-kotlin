package com.ardock.training_app_kotlin

import android.content.Context
import android.widget.Toast

fun Context.toast(text: CharSequence, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, length).show()
}
