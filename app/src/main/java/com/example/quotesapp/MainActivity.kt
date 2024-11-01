package com.example.quotesapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quotesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var quoteList = ArrayList<DataEntity>()
    private val rvAdapter by lazy {
        RvAdapter(this, quoteList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteList.addAll(SampleData.data)
        binding.rv.layoutManager= LinearLayoutManager(this)
        binding.rv.adapter = rvAdapter


        binding.fab.setOnClickListener { view ->
          startActivity(Intent(this,AddEditActivity::class.java))
        }
    }
}