package ru.maxpek.sunrain.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.maxpek.sunrain.databinding.FragmentClothesFeedBinding

class ClothesFeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentClothesFeedBinding.inflate(inflater, container, false)
        return binding.root
    }
}
