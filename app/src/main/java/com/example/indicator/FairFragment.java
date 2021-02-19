package com.example.indicator;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class FairFragment extends Fragment {


    EditText editText_s,editText_d;

    public FairFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fair, container, false);

        editText_s=(EditText) view.findViewById(R.id.edittext_source);
        editText_d=(EditText)view.findViewById(R.id.edittext_des);

        editText_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getContext(), ListViewCode.class);
                startActivity(intent);
            }
        });

        editText_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getContext(), ListViewCode.class);
                startActivity(intent);
            }
        });



        return view;
    }
}