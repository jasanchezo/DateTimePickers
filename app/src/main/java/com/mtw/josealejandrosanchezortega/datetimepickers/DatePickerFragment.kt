package com.mtw.josealejandrosanchezortega.datetimepickers


import android.R
import android.app.DatePickerDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import java.util.*
import android.support.annotation.NonNull




/**
 * A simple [Fragment] subclass.
 *
 */
class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {

    // POR DEFECTO LA VARIABLE savedInstanceState SE CREA COMO Bundle. SE CREA DE TIPO Bundle?
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(activity, 0, this, year, month, day)
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, day: Int) {
        // Set the activity to the Main Activity.
        val activity = activity as MainActivity
        // Invoke Main Activity's processDatePickerResult() method.
        activity.processDatePickerResult(year, month, day)
    }
}
