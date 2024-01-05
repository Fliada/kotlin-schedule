package com.example.kotlin_schedule.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_schedule.DayDataStorage
import com.example.kotlin_schedule.R
import com.example.kotlin_schedule.adapters.WeekAdapter
import com.example.kotlin_schedule.databinding.FragmentLessonListBinding
import com.example.kotlin_schedule.item.DayItem
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class LessonListFragment : Fragment() {

    private var binding: FragmentLessonListBinding? = null
    private var adapter: WeekAdapter = WeekAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding?.weekRecyclerView) {
            this ?: return
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@LessonListFragment.adapter
        }

        val calendar = Calendar.getInstance()

        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val currentDate = sdf.format(Date())

        calendar.time = sdf.parse(currentDate)

        var currentYear = Calendar.getInstance().get(Calendar.YEAR)
        currentYear = if (calendar.get(Calendar.MONTH) >= 9) currentYear else currentYear - 1

        val beginDate = "01/09/${currentYear}"
        Log.d("LessonList", "BeginDate $beginDate")

        val currentWeekNumber = calendar.get(Calendar.WEEK_OF_YEAR)
        Log.d("LessonList", "Curr week number $currentWeekNumber")

        calendar.time = sdf.parse(beginDate)
        val beginWeekNumber = calendar.get(Calendar.WEEK_OF_YEAR)
        Log.d("LessonList", "BeginWeekNumber $beginWeekNumber")

        val weekDifference = (currentWeekNumber - beginWeekNumber) % 2
        Log.d("LessonList", "weekDifference $weekDifference")

        val selectedList = if (weekDifference == 0) DayDataStorage.daysFirstWeek else DayDataStorage.daysSecondWeek

        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1 // Приводим к формату от 0 до 6 (воскресенье - суббота)
        val selectedDay = selectedList.find { it.dayNumber == dayOfWeek }

        if (selectedDay != null) {
            adapter.submitList(selectedDay)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonListBinding.inflate(inflater, container, false)
        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            LessonListFragment().apply {

            }
    }
}