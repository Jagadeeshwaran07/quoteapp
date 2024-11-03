package com.example.quotesapp


class AppRepository private constructor(){
    val list=SampleData.data
    companion object{
        val instance=AppRepository()
    }
}
