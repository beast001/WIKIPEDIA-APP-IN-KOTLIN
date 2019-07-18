package com.megatronkenya.wikipedia.activities.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.megatronkenya.wikipedia.R

class ListItemHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    private val articleImage: ImageView = itemView.findViewById(R.id.result_icon)
    private  val titleTextView: TextView = itemView.findViewById(R.id.result_title)
}