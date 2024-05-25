package com.example.weathernow.Respository

import com.example.weathernow.Server.ApiServices

class CityRepository(val api: ApiServices) {
    fun getCities(q: String,limit :Int)=
        api.getCitiesList(q, limit, "c0ab691c7d1f01e8626a4e06b7bf3ed2")
}