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
public class FirstFragment extends Fragment implements View.OnClickListener {

    EditText fn,sn;
    Button btnCalc;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        fn = view.findViewById(R.id.fn);
        sn = view.findViewById(R.id.sn);
        btnCalc = view.findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        int firstNum = Integer.parseInt( fn.getText().toString() );
        int secondNum = Integer.parseInt( sn.getText().toString() );
        String result = String.valueOf(firstNum + secondNum);

        Toast.makeText(getActivity(),"Sum is: " + result, Toast.LENGTH_LONG).show();

    }
}
