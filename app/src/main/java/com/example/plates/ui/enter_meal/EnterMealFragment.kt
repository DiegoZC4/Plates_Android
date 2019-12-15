package com.example.plates.ui.enter_meal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.plates.R


class EnterMealFragment : Fragment() {

    companion object {
        fun newInstance() = EnterMealFragment()
    }

    private lateinit var viewModel: EnterMealViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.enter_meal_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EnterMealViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
