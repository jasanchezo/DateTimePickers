package com.mtw.josealejandrosanchezortega.datetimepickers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


// REFERENCIA: https://android--code.blogspot.com/2018/02/android-kotlin-datepickerdialog-example.html
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePickerDialog(v: View) {
        val newFragment = DatePickerFragment()

        newFragment.show(fragmentManager, getString(R.string.date_picker))
    }

    fun processDatePickerResult(year: Int, month: Int, day: Int) {
        val month_string = Integer.toString(month + 1)
        val day_string = Integer.toString(day)
        val year_string = Integer.toString(year)

        val dateMessage = month_string + "/" + day_string + "/" + year_string

        Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show()
    }

    fun showTimePickerDialog(view: View) {
        val newFragment = TimePickerFragment()
        newFragment.show(fragmentManager, getString(R.string.time_picker))
    }

    fun processTimePickerResult(hourOfDay: Int, minute: Int) {
        // Convert time elements into strings.
        val hour_string = Integer.toString(hourOfDay)
        val minute_string = Integer.toString(minute)
        // Assign the concatenated strings to timeMessage.
        val timeMessage = "$hour_string:$minute_string"
        Toast.makeText(this, getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show()
    }
}
