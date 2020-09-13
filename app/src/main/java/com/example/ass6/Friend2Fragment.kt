package com.example.ass6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_friend1.view.*
import kotlinx.android.synthetic.main.fragment_friend1.view.btnClickFriend1
import kotlinx.android.synthetic.main.fragment_friend2.view.*

class Friend2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_friend2, container, false)
        view.btnClickFriend2.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = myFragment()
            replaceFragment1(fragment)
        }
        return view
    }

    fun replaceFragment1(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fragmentLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    }
