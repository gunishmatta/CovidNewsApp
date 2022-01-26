package com.gunish.covidnewsapp

import com.google.firebase.database.Exclude
import java.io.Serializable

class News:Serializable {
    var title:String?=""
    var content:String?=""
    var country:String?=""
    var tags:String?=""
    var datePublished:String?=""
    var dateUploaded:String?=""
    var views:String?=""
    var publisher:String?=""
    var imageUrl:String?=""

    @get:Exclude
    @set:Exclude
    var key:String?=""

    override fun toString(): String {
        return  title!!
    }

}