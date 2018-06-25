package com.mtw.josealejandrosanchezortega.datetimepickers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePickerDialog(v: View) {
        val newFragment = DatePickerFragment()

        newFragment.show(fragmentManager, getString(R.string.date_picker))
    }

    fun showTimePickerDialog(view: View) {
        val newFragment = TimePickerFragment()
        newFragment.show(fragmentManager, getString(R.string.time_picker))
    }
}
