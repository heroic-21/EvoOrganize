package com.example.evoorganize

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import java.util.Calendar
import androidx.fragment.app.Fragment

class ItemDivisiFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.item_divisi, container, false)

        val spinner: Spinner = view.findViewById(R.id.spinnerDivisi)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.dropdown_items_divisi,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val buttonTanggal: Button = view.findViewById(R.id.button_tanggal)

        buttonTanggal.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                requireContext(),
                { _, selectedYear, selectedMonth, selectedDay ->
                    val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                    buttonTanggal.text = selectedDate
                },
                year, month, day
            )
            datePickerDialog.show()
        }

        return view
    }
}