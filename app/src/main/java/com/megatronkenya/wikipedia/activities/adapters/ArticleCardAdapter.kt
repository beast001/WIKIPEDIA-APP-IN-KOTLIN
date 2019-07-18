package com.megatronkenya.wikipedia.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.megatronkenya.wikipedia.R
import com.megatronkenya.wikipedia.activities.holders.CardHolder

class ArticleCardAdapter() : RecyclerView.Adapter<CardHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_card_item,parent,false)
        return CardHolder(cardItem)
    }

    override fun getItemCount(): Int {
        return 15
            }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
          }
}