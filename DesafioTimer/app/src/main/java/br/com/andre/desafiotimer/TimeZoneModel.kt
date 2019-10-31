package br.com.andre.desafiotimer

data class TimeZoneModel(
    val name: String,
    val timezone: String = "GMT",
    val time: Int = 0

)

