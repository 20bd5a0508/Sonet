package com.example.ktdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.example.ktdemo1.databinding.ActivityFragmentDemoBinding

class FragmentDemoActivity : AppCompatActivity() {

    lateinit var binding:  ActivityFragmentDemoBinding
    lateinit var myVM: MyViewModel

  //  var btn1=findViewById<Button>(R.id.demo_fragment_btn1)
    // var btn2=findViewById<Button>(R.id.demo_fragment_btn2)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFragmentDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myVM=ViewModelProvider(this).get(MyViewModel::class.java)
        myVM.getData().observe(this,{
            binding.vmName.text=it.toString()
        })

        binding.demoFragmentBtn1.setOnClickListener(View.OnClickListener {

            replaceFragment(fragment1())

        })
        binding.demoFragmentBtn2.setOnClickListener(View.OnClickListener {
            replaceFragment(fragment2())

        })
    }
    private fun replaceFragment(a:Fragment) {
        var fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.demo_fragment_container, a)
        fragmentTransaction.commit()
    }
}