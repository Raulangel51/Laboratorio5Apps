package com.example.survey


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import com.example.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class QuestionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_question, container, false)
        val rate: RatingBar = root.findViewById(R.id.ratingBar)
        rate.setOnClickListener(){

        }
        return root
    }


}
