package com.example.anupo.anupomroy_comp304_assignment5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowroomsActivity extends AppCompatActivity {
    ListView listViewHonda,listViewToyota;
    Intent mapIntent=null;
    //declare an array
    String [] hondaArray={"Scarborough","Downtown","Markham","DonMills"};
    String []toyotaArray={"Scarborough","Etobicoke","Markham","DonMills"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showrooms);


     String name=getIntent().getStringExtra("name");
        if (name.equals("honda")) {
            listViewHonda=(ListView)findViewById(R.id.showroomListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hondaArray);
            listViewHonda.setAdapter(arrayAdapter);

            listViewHonda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position)
                    {
                        case 0:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Roadsport_Honda");
                            startActivity(mapIntent);

                            break;
                        case 1:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Honda_Downtown");
                            startActivity(mapIntent);

                            break;

                    }

                }
            });
        }
        if (name.equals("toyota")) {
            listViewToyota=(ListView)findViewById(R.id.showroomListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, toyotaArray);
            listViewToyota.setAdapter(arrayAdapter);
            listViewToyota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                {
                    switch (position)
                    {
                        case 0:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Scarborough_Toyota");
                            startActivity(mapIntent);

                            break;
                        case 1:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Woodbine_Toyota");
                            startActivity(mapIntent);

                            break;

                    }
                }
            });
        }
    }
}
