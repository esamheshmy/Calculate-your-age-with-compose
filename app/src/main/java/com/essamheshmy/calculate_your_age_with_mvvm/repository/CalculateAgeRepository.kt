package com.essamheshmy.calculate_your_age_with_mvvm.repository

import androidx.lifecycle.MutableLiveData
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import java.util.concurrent.Flow


interface CalculateAgeRepository {

    fun calculateYourAge(name: String, age: Int):Person
}