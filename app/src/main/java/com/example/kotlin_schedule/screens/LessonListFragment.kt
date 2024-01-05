package com.example.kotlin_schedule.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_schedule.R
import com.example.kotlin_schedule.databinding.FragmentLessonListBinding

class LessonListFragment : Fragment() {

    private var binding: FragmentLessonListBinding? = null

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