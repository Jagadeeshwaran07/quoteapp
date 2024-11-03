package com.example.quotesapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MyViewModel(application: Application) : AndroidViewModel(application) {
    public var quoteList = AppRepository.instance.list

//    fun getData() : ArrayList<DataEntity>{
//        quoteList = SampleData.data as ArrayList<DataEntity>
//        return quoteList
//    }

}