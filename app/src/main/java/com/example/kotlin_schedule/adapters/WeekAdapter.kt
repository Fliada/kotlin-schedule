package com.example.kotlin_schedule.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_schedule.LessonHelper
import com.example.kotlin_schedule.R
import com.example.kotlin_schedule.databinding.DayItemLayoutBinding
import com.example.kotlin_schedule.databinding.LessonItemLayoutBinding
import com.example.kotlin_schedule.item.DayItem
import com.example.kotlin_schedule.item.LessonItem
import java.text.SimpleDateFormat

class WeekAdapter : RecyclerView.Adapter<WeekAdapter.WeekViewHolder>() {

    private val list: MutableList<DayItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DayItemLayoutBinding.inflate(inflater, parent, false)
        return WeekViewHolder(binding)
    }

    override fun getItemCount(): Int =
        list.size

    override fun onBindViewHolder(holder: WeekViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<DayItem>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class WeekViewHolder(
        private val binding: DayItemLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private val lessonAdapter = LessonListAdapter()

        init {
            binding.lessonsRecyclerView.layoutManager = LinearLayoutManager(binding.root.context)
            binding.lessonsRecyclerView.adapter = lessonAdapter

            binding.lessonsRecyclerView.addItemDecoration(createItemDecorator())
        }

        private fun createItemDecorator() =
            DividerItemDecoration(binding.root.context, RecyclerView.VERTICAL).apply {
                ContextCompat.getDrawable(binding.root.context, R.drawable.lesson_item_decorator)
                    ?.let { this@apply.setDrawable(it) }
            }

        fun bind(item: DayItem) = with(binding) {
            dayTitle.text = getDayOfWeekName(item.dayNumber)
            lessonAdapter.submitList(item.lessons)

            val (beginTime, endTime) = getLessonTimeRange(item.lessons)

            daySubtitle.text = getDayDescription(
                lessonAdapter.itemCount,
                beginTime,
                endTime
                )
        }

        private fun getLessonTimeRange(lessons: List<LessonItem>): Pair<String, String> {
            // Находим минимальное и максимальное время среди всех LessonItem
            val minBeginTime = lessons.minOfOrNull { it.accountNumber } ?: 0
            val maxEndTime = lessons.maxOfOrNull { it.accountNumber } ?: 0

            return Pair(
                LessonHelper.getLessonStartTime(minBeginTime),
                LessonHelper.getLessonEndTime(maxEndTime)
            )
        }

        fun getDayDescription(count: Int, beginTime: String, endTime: String): String {
            return "$count пары(а) с $beginTime до $endTime"
        }

        fun getDayOfWeekName(dayOfWeek: Int): String {
            return when (dayOfWeek) {
                1 -> "Понедельник"
                2 -> "Вторник"
                3 -> "Среда"
                4 -> "Четверг"
                5 -> "Пятница"
                6 -> "Суббота"
                7 -> "Воскресенье"
                else -> "Неверный день недели"
            }
        }

        private fun timestampToString(timestamp: Long) =
            formatter.format(timestamp * SECOND_IN_MS)


        companion object {
            private const val TIME_FORMAT = "HH:mm"
            private const val SECOND_IN_MS = 1000L
            private val formatter = SimpleDateFormat(TIME_FORMAT)
        }
    }
}