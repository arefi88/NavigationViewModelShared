package com.example.maktabnavigationproje

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.maktabnavigationproje.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    val viewModel:MainViewModel by viewModels()
    private lateinit var model: MainViewModel
    private var _binding:FragmentSecondBinding?=null
    private val binding get() = _binding!!
    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name=args.name
        binding.textView2.text=name
        model = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.button.setOnClickListener {
            model.updateText(binding.button.text.toString())
        }
        binding.button2.setOnClickListener {
            model.updateText(binding.button2.text.toString())
        }
//        viewModel.textButton.observe(viewLifecycleOwner){
//            binding.textView2.text=it
//        }

    }
}