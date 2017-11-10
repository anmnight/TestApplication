package com.example.anxiao.lesson_ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.anxiao.mytestapplication.R

class PracticeDrawColor : Fragment() {

    private var mListener: FragmentInteractionListener? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_practice_draw_color, container, false)
    }



    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is FragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }



    companion object {
        fun newInstance(): PracticeDrawColor {
            val fragment = PracticeDrawColor()
            return fragment
        }
    }
}
