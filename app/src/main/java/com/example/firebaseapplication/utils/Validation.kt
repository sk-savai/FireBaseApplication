package com.example.firebaseapplication.utils

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Matcher
import java.util.regex.Pattern

object Validation {





    fun isValidPassword(password: String): Boolean {
        val pattern: Pattern
        val passwordRegex ="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$"
        pattern = Pattern.compile(passwordRegex)
        val matcher: Matcher = pattern.matcher(password)
        return matcher.matches()
    }


    fun isFieldNull(mString: String?): Boolean {
        return if (mString == null) {
            false
        } else if (mString.equals("", ignoreCase = true)) {
            false
        } else if (mString.equals("N/A", ignoreCase = true)) {
            false
        } else if (mString.equals("[]", ignoreCase = true)) {
            false
        } else if (mString.equals("null", ignoreCase = true)) {
            false
        } else
            !mString.equals("{}", ignoreCase = true)
    }

    fun isFieldEmpty(field: String): Boolean {
        return when {
            field.isEmpty() -> {
                true
            }
            field == " " -> {
                true
            }
            field == "null" -> {
                true
            }
            field.equals(null) -> {
                true
            }
            else -> false
        }


    }


    fun isNameValidate(name: String): Boolean {
        return when {
            name.length < 2 || name.length > 100 -> {
                true
            }
            else -> false
        }
    }


    fun isMobileValidation(mobileNo: String): Boolean {
        return when {
            !Patterns.PHONE.matcher(mobileNo.trim()).matches() -> {
                true
            }
            else -> false
        }
    }

    fun isMobileValidate(mobileNo: String): Boolean {
        return when {
            mobileNo.length < 8 || mobileNo.length > 14 -> {
                true
            }
            else -> false
        }
    }

    fun isEmailValid(email: String): Boolean {
        return when {
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                true
            }
            else -> false
        }
    }

}
