package com.example.kotlin_schedule.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_schedule.databinding.LessonItemLayoutBinding
import com.example.kotlin_schedule.item.LessonItem
import java.text.SimpleDateFormat
import com.example.kotlin_schedule.LessonHelper

class LessonListAdapter : RecyclerView.Adapter<LessonListAdapter.LessonViewHolder>() {

    private val list: MutableList<LessonItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LessonItemLayoutBinding.inflate(inflater, parent, false)
        return LessonViewHolder(binding)
    }

    override fun getItemCount(): Int =
        list.size

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<LessonItem>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class LessonViewHolder(
        private val binding: LessonItemLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: LessonItem) = with(binding) {

            beginTime.text = LessonHelper.getLessonStartTime(item.accountNumber)
            endTime.text = LessonHelper.getLessonEndTime(item.accountNumber)

            lessonTitle.text = "${item.lessonName}"
            lessonAudience.text = "Аудитория: ${item.audience}"
            lessonTeacher.text = "Преподаватель: ${item.teacherName}"
        }
    }
}