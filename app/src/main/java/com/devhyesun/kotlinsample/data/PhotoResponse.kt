package com.devhyesun.kotlinsample.data

data class PhotoResponse(
    val photos: Photos,
    val stat: String,
    val code: Int,
    val message: String?
)

data class Photos(
    val page: Int,
    val pages: String,
    val perpage: Int,
    val photo: List<Photo>,
    val total: String
)

data class Photo(
        val id: String,
        val owner: String,
        val secret: String,
        val server: String,
        val farm: Int,
        val title: String,
        val ispublic: Int,
        val isfriend: Int,
        val isfamily: Int
) {
   fun getImageUrl() = "https://farm${farm}.staticflickr.com/${server}/${id}_${secret}.jpg"
}