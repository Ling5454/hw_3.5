package com.example.hw_35

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_35.databinding.FragmentMainBinding
import com.example.hw_35.databinding.FragmentTextBinding


class TextFragment : Fragment() {
    private lateinit var binding: FragmentTextBinding
    var result=arguments?.getString("text")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentTextBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text.text=result.toString()
    }
}