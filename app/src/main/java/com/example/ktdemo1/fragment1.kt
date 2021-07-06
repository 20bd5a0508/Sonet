package com.example.ktdemo1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ktdemo1.databinding.DemoFragment1Binding

class fragment1:Fragment(R.layout.demo_fragment_1) {
    lateinit var binder:DemoFragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binder= DemoFragment1Binding.inflate(layoutInflater)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binder.fragment1btn.setOnClickListener(View.OnClickListener {
            var fragmentManager = activity?.supportFragmentManager
            var fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.demo_fragment_container, fragment2())
            fragmentTransaction?.commit()
        })
    }


}