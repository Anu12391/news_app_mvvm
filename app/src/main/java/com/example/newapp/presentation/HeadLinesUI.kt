package com.example.newapp.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newapp.domain.model.ArticlesItem
import com.example.newapp.domain.model.HeadlineResponseDTO

@Composable
fun HeadLinesUI(headLineViewModel: HeadlinesViewmodel = hiltViewModel()) {
    val res = headLineViewModel.list.value
    if (res.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()

        }
    }
    if (res.error.isNotBlank()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = res.error.toString())


        }

    }




    res.data?.get(0)?.let {

        LazyColumn {
            items(it.articles) {
                HeadlineListItem(articleItem=it)
            }
        }
    }
}


@Composable
fun HeadlineListItem(articleItem: ArticlesItem) {
    Card(modifier = Modifier.padding(8.dp)) {
        Text(text = articleItem.title)
    }
}