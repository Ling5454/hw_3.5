package com.example.hw_35

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_35.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNum.setOnClickListener { view ->
            if (count < 10 && binding.btnNum.text != "-1") {
                count++
                binding.tvNum.text = count.toString()
            } else if (count == 10 || count < 10 && count>0) {
                binding.btnNum.text="-1"
                count--
                binding.tvNum.text=count.toString()
            }else if (count==0){
                val textFragment=TextFragment()
                var bundle=Bundle()
              parentFragmentManager.beginTransaction().replace(R.id.container,textFragment).commit()
                bundle.putString("text",count.toString())
                textFragment.arguments=bundle

            }
        }
    }
}