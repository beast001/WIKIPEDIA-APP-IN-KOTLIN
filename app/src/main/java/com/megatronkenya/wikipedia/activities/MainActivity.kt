package com.megatronkenya.wikipedia.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.megatronkenya.wikipedia.R
import com.megatronkenya.wikipedia.activities.fragments.ExploreFragment
import com.megatronkenya.wikipedia.activities.fragments.FavoriteFragment
import com.megatronkenya.wikipedia.activities.fragments.HistoryFragment

class MainActivity : AppCompatActivity() {
    private val exploreFagment: ExploreFragment
    private  val favouriteFragment: FavoriteFragment
    private val historyFragment: HistoryFragment
    init {
        exploreFagment = ExploreFragment()
        favouriteFragment= FavoriteFragment()
        historyFragment= HistoryFragment()
    }
    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            val transaction = supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            when(item.itemId){
                R.id.navigation_explore -> transaction.replace(R.id.fragment_container,exploreFagment)
                R.id.navigation_favorite->transaction.replace(R.id.fragment_container,favouriteFragment)
                R.id.navigation_history->transaction.replace(R.id.fragment_container,historyFragment)
            }
        transaction.commit()

        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.navigation)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
         val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container,exploreFagment)
        transaction.commit()
    }
}
