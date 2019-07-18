package com.megatronkenya.wikipedia.activities.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.megatronkenya.wikipedia.R
import com.megatronkenya.wikipedia.activities.adapters.ArticleCardAdapter
import com.megatronkenya.wikipedia.activities.adapters.ArticleListItemAdapter
import kotlinx.android.synthetic.main.fragment_favorite.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FavoriteFragment : Fragment() {
    var favoriteRecycler: RecyclerView? =null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_favorite, container, false)
        favoriteRecycler = view.findViewById(R.id.favorite_article_recycler)
        favoriteRecycler!!.layoutManager=LinearLayoutManager(context)
        favoriteRecycler!!.adapter = ArticleCardAdapter()
        return view

    }


}
