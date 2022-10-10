package com.example.homework6month3

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.addFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().add(R.id.conteyner, fragment).commit()

}

fun Fragment.replaceFragment(fragment: Fragment) {
    requireActivity().supportFragmentManager.beginTransaction().replace(R.id.conteyner, fragment)
        .addToBackStack(null).commit()
}