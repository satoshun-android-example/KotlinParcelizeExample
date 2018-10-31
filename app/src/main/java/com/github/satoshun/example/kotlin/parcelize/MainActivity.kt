package com.github.satoshun.example.kotlin.parcelize

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.satoshun.example.kotlin.parcelize.databinding.MainActBinding
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(),
  CoroutineScope {

  private val job = Job()
  override val coroutineContext: CoroutineContext get() = job + Dispatchers.Main

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<MainActBinding>(this, R.layout.main_act)

    val user1 = User1("10")
    val user2 = User2().apply { this.a = "11" }

    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .add(
          FFF().apply {
            arguments = Bundle().apply {
              putParcelable("user1", user1)
              putParcelable("user2", user2)
            }
          },
          "hoge"
        )
        .commitAllowingStateLoss()
    }
  }

  override fun onDestroy() {
    super.onDestroy()
    job.cancel()
  }
}

class FFF : Fragment() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    println(arguments!!.getParcelable<User1>("user1").a)
    println(arguments!!.getParcelable<User2>("user2").a)
  }
}

@Parcelize
data class User1(
  val a: String
) : Parcelable

@Parcelize
data class User2(val hoge: String? = null) : Parcelable {
  lateinit var a: String
}
