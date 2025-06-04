package com.example.newapp.navigation

sealed class NavigationItem(val route: String) {
    object HeadlineNavigationItem : NavigationItem("headline_list")
    object HeadlineDetailsNavigationItem : NavigationItem("headline_details/{headline_id}")
}