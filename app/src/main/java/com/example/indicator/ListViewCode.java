package com.example.indicator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class ListViewCode extends AppCompatActivity {

    SearchView searchView;
    ListView listView;


    String[] stationNameList ={"Borivali","Byculla","CSMT","Charni Road","Chembur","Chinchpokli","Chunabhatti","Churchgate","Cotton Green",
            "Curry Road","Dadar","Dahanu Road","Dahisar","Dativali","Diva Jn","Dockyard Road","Dolavli","Dombivili"};
    ArrayAdapter<String> arrayAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_fair);

        searchView=(SearchView)findViewById(R.id.search_bar);
        listView=(ListView)findViewById(R.id.list_view);


        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1,stationNameList );
        listView.setAdapter(arrayAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=arrayAdapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
                Intent intent = new  Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);

            }
        });



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                ListViewCode.this.arrayAdapter.getFilter().filter(query);

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ListViewCode.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }


}
