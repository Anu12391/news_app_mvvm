package com.example.newapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newapp.presentation.HeadLinesUI

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationItem.HeadlineNavigationItem.route
    ) {
        composable(NavigationItem.HeadlineDetailsNavigationItem.route){
          
        }

        composable(NavigationItem.HeadlineNavigationItem.route){
            HeadLinesUI()
        }
    }

}