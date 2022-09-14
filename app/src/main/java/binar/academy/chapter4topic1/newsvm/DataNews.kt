package binar.academy.chapter4topic1.newsvm

import java.io.Serializable

data class DataNews (val headline : String, val author : String, val date : String, val image : Int, val body : Int) : Serializable