package com.example.dell.singlefragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 *  Created by Dell on 22-02-2017.
 *      FragmentClass extends Fragment
 *      onCreateView()-> returns the view
 *      onActivityCreated() -> gets the text view of fragment1.xml
 *      setMessage() -> sets the message on textView in fragment
 */
public class FragmentClass extends Fragment {

    TextView text;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(" onCreateView"," onCreateView method");


        View view=inflater.inflate(R.layout.fragment1,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        text= (TextView) getActivity().findViewById(R.id.frag_textView);
    }

    public void setMessage(String message) {

        text.setText(message);
    }
}

