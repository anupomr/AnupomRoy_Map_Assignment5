package com.example.anupo.anupomroy_comp304_assignment5;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    July 11, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 5
 * */
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    BitmapDrawable imageViewIcon;
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

        // List View action listener Code
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showroomIntent=showroomIntent=new Intent(MainActivity.this,ShowroomsActivity.class);
                SharedPreferences sharedPref=getSharedPreferences("logoInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPref.edit();
                //imageViewIcon=getResources().getDimension(R.drawable.honda);
                switch (position)
                {
                    case 0:
                        editor.putString("brand","chevrolet");
                        showroomIntent.putExtra("name","chevrolet");
                        break;
                    case 1:
                        editor.putString("brand","ford");
                        showroomIntent.putExtra("name","ford");
                        break;
                    case 2:
                        editor.putString("brand","honda");
                        showroomIntent.putExtra("name","honda");
                        break;
                    case 3:
                        editor.putString("brand","nissan");
                        showroomIntent.putExtra("name","nissan");
                        break;
                    case 4:
                        editor.putString("brand","toyota");
                        showroomIntent.putExtra("name","toyota");
                        break;

                }
                startActivity(showroomIntent);
                editor.apply();
            }
        });
    }
}
