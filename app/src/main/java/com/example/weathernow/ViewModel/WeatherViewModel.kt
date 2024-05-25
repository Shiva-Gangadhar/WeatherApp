package com.example.weathernow.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weathernow.Respository.WeatherRespository
import com.example.weathernow.Server.ApiClient
import com.example.weathernow.Server.ApiServices

class WeatherViewModel(val repository: WeatherRespository):ViewModel() {

    constructor():this(WeatherRespository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double,lng:Double,unit:String)=
        repository.getCurrentWeather(lat,lng,unit)

    fun loadForecastWeather(lat:Double,lng:Double,unit:String)=
        repository.getForecastWeather(lat,lng,unit)
}