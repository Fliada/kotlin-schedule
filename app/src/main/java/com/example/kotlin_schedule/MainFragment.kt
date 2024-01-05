package com.example.kotlin_schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import com.example.kotlin_schedule.adapters.WeekAdapter
import com.example.kotlin_schedule.databinding.FragmentMainBinding
import com.example.kotlin_schedule.screens.LessonListFragment
import com.example.kotlin_schedule.screens.WeekFragment

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.bottomNavigation?.setOnItemSelectedListener {
            changeTab(it.itemId)
            true
        }

        changeTab(R.id.navigation_lesson_list)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root
    }

    private fun changeTab(@IdRes id: Int) {
        val navHostId = binding?.navHost?.id
        navHostId ?: return
        val transaction = childFragmentManager.beginTransaction()
        when (id) {
            R.id.navigation_lesson_list ->
                transaction.replace(navHostId, LessonListFragment.newInstance())

            R.id.navigation_week ->
                transaction.replace(navHostId, WeekFragment.newInstance())
        }
        transaction.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment().apply {

            }
    }

}