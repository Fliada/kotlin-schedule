package com.example.kotlin_schedule

import android.R
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.kotlin_schedule.databinding.FragmentMainBinding
import com.example.kotlin_schedule.databinding.FragmentSpinnerBinding

class SpinnerFragment : Fragment() {

    private var binding: FragmentSpinnerBinding? = null
    private var weekSelectionListener: WeekSelectionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpinnerBinding.inflate(inflater, container, false)

        val spinner = binding?.weekSpinner
        val weekOptions = arrayOf(NumberOfWeek.FIRST, NumberOfWeek.SECOND)
        val adapter =
            this.context?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, weekOptions) }
        adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner?.adapter = adapter

        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedWeek = parent?.getItemAtPosition(position) as String
                weekSelectionListener?.onWeekSelected(selectedWeek)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Ничего не делаем в данном случае
            }
        }

        return binding?.root
    }

    fun setWeekSelectionListener(listener: WeekSelectionListener) {
        weekSelectionListener = listener
    }
}