package com.mtw.josealejandrosanchezortega.datetimepickers


import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import android.text.format.DateFormat.is24HourFormat
import android.app.TimePickerDialog
import android.support.annotation.NonNull
// import java.text.DateFormat
import java.util.*

// IMPORTADO POR REFERENCIA: https://stackoverflow.com/questions/41507754/cannot-resolve-method-dateformat-is24hourformat-in-timepickerdialog
import android.text.format.DateFormat;



// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle): Dialog {
        // Use the current time as the default values for the picker.
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        // Create a new instance of TimePickerDialog and return it.
        // REFERENCIA DEL FORMATO DE 24 HORAS: https://stackoverflow.com/questions/41507754/cannot-resolve-method-dateformat-is24hourformat-in-timepickerdialog
        return TimePickerDialog(getActivity(), this, hour, minute,
                android.text.format.DateFormat.is24HourFormat(getActivity()))
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        // Do something with the time chosen by the user.
    }
}
