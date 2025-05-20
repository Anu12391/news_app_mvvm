package com.example.newapp.presentation

import androidx.lifecycle.ViewModel
import com.example.newapp.domain.use_cases.GetHeadlinesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HeadlinesViewmodel @Inject constructor(getHeadlineUseCase: GetHeadlinesUseCase) :
    ViewModel() {
}