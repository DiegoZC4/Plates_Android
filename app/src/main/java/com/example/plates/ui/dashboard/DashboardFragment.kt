package com.example.plates.ui.dashboard

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.plates.R

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var listener: EnterMealListener? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
//        val textView: TextView = root.findViewById(R.id.text_greeting)
        /*dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })
*/
        val button: Button = root.findViewById(R.id.btnInputMeal)
        button.setOnClickListener(View.OnClickListener {
            listener!!.onEnterMealSelected()
        })
        return root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is EnterMealListener) listener = context
        else throw RuntimeException("$context must implement EnterMealListener")
    }

    interface EnterMealListener {
        fun onEnterMealSelected()
    }
}