package com.example.anupo.anupomroy_comp304_assignment5;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    July 11, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 5
 * */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //declare an array
    String []brandArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List view Code
        ListView listView=(ListView)findViewById(R.id.myListView);
        brandArray=getResources().getStringArray(R.array.brand);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,brandArray);
        listView.setAdapter(arrayAdapter);
    }
}
