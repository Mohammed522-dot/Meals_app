package com.example.mealsapp

import com.example.domain.usecase.GetMeals
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MealsViewModelTest{
    private lateinit var mealsViewModel: MealsViewModel
    private lateinit var getMeals: GetMeals

    @Before
    fun setup(){
        mealsViewModel = MealsViewModel(getMeals)
    }
    @Test
    fun `get meals items, return true` (){
   val value = mealsViewModel.getMeals()
       assertNotNull("true",value)
    }
}