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
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quotesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    public var quoteList = ArrayList<DataEntity>()
    private lateinit var myViewModel : MyViewModel
    private val rvAdapter by lazy {
        RvAdapter(this, quoteList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding.rv.layoutManager= LinearLayoutManager(this)
        binding.rv.adapter = rvAdapter


        binding.fab.setOnClickListener { view ->
        //  startActivity(Intent(this,AddEditActivity::class.java))
          //  rvAdapter.quoteList= myViewModel.getData()
            rvAdapter.quoteList= myViewModel.quoteList


            rvAdapter.notifyDataSetChanged()
        }
    }
}