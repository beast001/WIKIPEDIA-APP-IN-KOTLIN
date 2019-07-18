package com.megatronkenya.wikipedia.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megatronkenya.wikipedia.R
import com.megatronkenya.wikipedia.activities.holders.CardHolder
import com.megatronkenya.wikipedia.activities.holders.ListItemHolder

class ArticleListItemAdapter() : RecyclerView.Adapter<ListItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
   var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item,parent,false)
        return ListItemHolder(cardItem)
    }

    override fun getItemCount(): Int {
        return 15
           }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {
          }
}