package com.megatronkenya.wikipedia.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megatronkenya.wikipedia.R
import com.megatronkenya.wikipedia.activities.holders.CardHolder

class ArticleListItemAdapter() : RecyclerView.Adapter<CardHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
   var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item,parent,false)
        return CardHolder(cardItem)
    }

    override fun getItemCount(): Int {
        return 15
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}