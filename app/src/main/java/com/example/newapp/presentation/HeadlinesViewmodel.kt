package com.example.newapp.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newapp.data.common.Resource
import com.example.newapp.domain.use_cases.GetHeadlinesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HeadlinesViewmodel @Inject constructor(private val getHeadlineUseCase: GetHeadlinesUseCase) :
    ViewModel() {


    private val _list = mutableStateOf(HeadlinesState())
    val list: State<HeadlinesState> = _list

    init {
        getHeadline()
    }

    fun getHeadline() {
        getHeadlineUseCase().onEach {
            when (it) {
                is Resource.Loading -> {
                    _list.value = HeadlinesState(isLoading = true)
                }

                is Resource.Success -> {
                    _list.value = HeadlinesState(data = it.data)
                }

                is Resource.Error -> {
                    _list.value = HeadlinesState(error = it.message.toString())
                }

            }
        }.launchIn(viewModelScope)
    }


}