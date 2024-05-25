package com.example.weathernow.Respository

import com.example.weathernow.Server.ApiServices

class WeatherRespository(val api:ApiServices) {
    fun getCurrentWeather(lat: Double,lng: Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"c0ab691c7d1f01e8626a4e06b7bf3ed2")

    fun getForecastWeather(lat: Double,lng: Double,unit:String)=
        api.getForecastWeather(lat,lng,unit,"c0ab691c7d1f01e8626a4e06b7bf3ed2")
}