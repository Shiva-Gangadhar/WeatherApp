package com.example.weathernow.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weathernow.Respository.CityRepository
import com.example.weathernow.Server.ApiClient
import com.example.weathernow.Server.ApiServices

class CityViewModel(val respository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int)=
        respository.getCities(q, limit)
}