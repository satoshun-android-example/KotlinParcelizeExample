package com.github.satoshun.example.legacy

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel(private val job: Job) : ViewModel(),
    CoroutineScope {
  override val coroutineContext: CoroutineContext
    get() = Dispatchers.Main + job

  override fun onCleared() {
    super.onCleared()
    job.cancel()
  }
}
