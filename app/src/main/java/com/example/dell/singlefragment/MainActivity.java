package com.example.dell.singlefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *      Implemented a single screen using fragment
 first i have created an activity called MainActivity.java then loaded the fragment1 in MainActivity.
 Next i created a fragment called FragmentClass.java. On a button click get a value from
 EditText and show it in TextView.
 */

public class MainActivity extends AppCompatActivity implements MessagePasserInterface{

    FragmentClass fragment;

    EditText edittext;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext=(EditText)findViewById(R.id.editText);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {

            // onClick()-> gets the text of EditText and passed as a parameter of onMessage().
            @Override
            public void onClick(View v) {

                String text_of_edittext=edittext.getText().toString();

                onMessage(text_of_edittext);

            }
        });

    }

    //onMessage()-> set the text of editText in the fragment by object.
    @Override
    public void onMessage(String message) {
        fragment= (FragmentClass) getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.setMessage(message);
    }
}
