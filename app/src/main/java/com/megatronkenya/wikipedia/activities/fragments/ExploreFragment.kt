package com.megatronkenya.wikipedia.activities.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.megatronkenya.wikipedia.R
import com.megatronkenya.wikipedia.activities.SearchActivity
import com.megatronkenya.wikipedia.activities.adapters.ArticleCardAdapter
import kotlinx.android.synthetic.main.fragment_explore.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ExploreFragment : Fragment() {
    var searchCardView : CardView? = null
    var exploreRecycler: RecyclerView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_explore, container, false)
        searchCardView = view.findViewById(R.id.search_card_view)
        exploreRecycler = view.findViewById(R.id.explore_article_recycler)

        searchCardView!!.setOnClickListener{
            val searchIntent = Intent(context,SearchActivity::class.java)
            context!!.startActivity(searchIntent)
        }

        exploreRecycler!!.layoutManager=LinearLayoutManager(context)
        exploreRecycler!!.adapter = ArticleCardAdapter()
        return  view
    }


}
