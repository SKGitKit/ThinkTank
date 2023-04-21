package com.khanappsnj.thinktank.util

import java.text.SimpleDateFormat
import java.util.*

object DateTimeUtils {
    private const val API_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    private const val DISPLAY_DATE_FORMAT = "MMM d, yyyy"
    private const val DISPLAY_DATETIME_FORMAT = "MMM d, yyyy h:mm a"

    fun convertApiDateToDisplayDate(apiDate: String): String {
        val apiDateFormat = SimpleDateFormat(API_DATE_FORMAT, Locale.getDefault())
        val displayDateFormat = SimpleDateFormat(DISPLAY_DATE_FORMAT, Locale.getDefault())
        val date = apiDateFormat.parse(apiDate)
        return displayDateFormat.format(date)
    }

    fun convertApiDateToDisplayDateTime(apiDate: String): String {
        val apiDateFormat = SimpleDateFormat(API_DATE_FORMAT, Locale.getDefault())
        val displayDateTimeFormat = SimpleDateFormat(DISPLAY_DATETIME_FORMAT, Locale.getDefault())
        val date = apiDateFormat.parse(apiDate)
        return displayDateTimeFormat.format(date)
    }
}