package com.redhead.imagesearch.api

import com.redhead.imagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>

)