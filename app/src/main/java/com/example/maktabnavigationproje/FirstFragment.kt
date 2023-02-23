package com.example.maktabnavigationproje

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.maktabnavigationproje.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    val viewModel:MainViewModel by activityViewModels()
   private var _binding:FragmentFirstBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.materialButton.setOnClickListener {
            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment("mohammad")
            Navigation.findNavController(view).navigate(action)
        }
        //val model = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        viewModel.textButton.observe(viewLifecycleOwner){
            binding.textView.text=it
        }
    }


}