package com.example.kotlin_schedule.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_schedule.DayDataStorage
import com.example.kotlin_schedule.R
import com.example.kotlin_schedule.adapters.WeekAdapter
import com.example.kotlin_schedule.databinding.FragmentWeekBinding

class WeekFragment : Fragment() {

    private var binding: FragmentWeekBinding? = null
    private var adapter: WeekAdapter = WeekAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding?.weekRecyclerView) {
            this ?: return
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@WeekFragment.adapter
            addItemDecoration(createItemDecorator())
        }

        adapter.submitList(DayDataStorage.daysFirstWeek)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeekBinding.inflate(inflater, container, false)
        return binding?.root
    }

    private fun createItemDecorator() =
        DividerItemDecoration(requireContext(), RecyclerView.VERTICAL).apply {
            ContextCompat.getDrawable(requireContext(), R.drawable.day_item_decorator)
                ?.let { this@apply.setDrawable(it) }
        }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            WeekFragment().apply {

            }
    }
}