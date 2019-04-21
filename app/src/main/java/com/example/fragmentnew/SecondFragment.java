package com.example.fragmentnew;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    EditText radius;
    Button btnCalcRadius;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second2, container, false);

        radius = view.findViewById(R.id.etRadius);
        btnCalcRadius = view.findViewById(R.id.btnCalcRadius);

        btnCalcRadius.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float givenRadius = Float.parseFloat( radius.getText().toString() );
        float res = 3.14f * givenRadius * givenRadius;

        Toast.makeText(getActivity(),"Area of circle is: " + res,Toast.LENGTH_LONG).show();

    }
}
