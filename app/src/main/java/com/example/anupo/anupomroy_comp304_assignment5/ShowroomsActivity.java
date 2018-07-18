package com.example.anupo.anupomroy_comp304_assignment5;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    July 17, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 5
 * */
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
    String []chevroletArray={"NorthYork","Etobicoke","Markham","DonMills"};
    String []fordArray={"Scarborough","Markham","Brampton","DonMills"};
    String [] hondaArray={"Scarborough","Downtown","Markham","DonMills"};
    String []toyotaArray={"Scarborough","Etobicoke","Markham","DonMills"};
    String []nissanArray={"Scarborough","Brampton","Markham","DonMills"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showrooms);


     String name=getIntent().getStringExtra("name");
        if (name.equals("chevrolet")) {
            //region Chevrolet
            listViewHonda=(ListView)findViewById(R.id.showroomListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chevroletArray);
            listViewHonda.setAdapter(arrayAdapter);

            listViewHonda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position)
                    {
                        case 0:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","NorthYork");
                            startActivity(mapIntent);
                            break;
                        case 1:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Etobicoke");
                            startActivity(mapIntent);
                            break;
                        case 2:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Markham");
                            startActivity(mapIntent);
                            break;
                        case 3:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","DonMills");
                            startActivity(mapIntent);
                            break;
                    }

                }
            });//endregion
        }
        else if (name.equals("ford")) {
            //region Ford
            listViewHonda=(ListView)findViewById(R.id.showroomListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fordArray);
            listViewHonda.setAdapter(arrayAdapter);

            listViewHonda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position)
                    {
                        case 0:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Scarborough");
                            startActivity(mapIntent);
                            break;
                        case 1:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Markham");
                            startActivity(mapIntent);
                            break;
                        case 2:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Brampton");
                            startActivity(mapIntent);
                            break;
                        case 3:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","DonMills");
                            startActivity(mapIntent);
                            break;
                    }

                }
            });//endregion
        }
        else if (name.equals("honda")) {
            //region Honda
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
                        case 2:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Markham");
                            startActivity(mapIntent);
                            break;
                        case 3:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","DonMills");
                            startActivity(mapIntent);
                            break;
                    }

                }
            });//endregion
        }

        else if (name.equals("toyota"))
        {
            //region Toyota
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
                        case 2:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Markham");
                            startActivity(mapIntent);
                            break;
                        case 3:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","DonMills");
                            startActivity(mapIntent);
                            break;
                    }
                }
            });//endregion
        }
        else  {
            //region Nissan
            listViewHonda=(ListView)findViewById(R.id.showroomListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nissanArray);
            listViewHonda.setAdapter(arrayAdapter);

            listViewHonda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position)
                    {
                        case 0:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Scarborough");
                            startActivity(mapIntent);
                            break;
                        case 1:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Brampton");
                            startActivity(mapIntent);
                            break;
                        case 2:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","Markham");
                            startActivity(mapIntent);
                            break;
                        case 3:
                            mapIntent=new Intent(ShowroomsActivity.this,MapsActivity.class);
                            mapIntent.putExtra("name","DonMills");
                            startActivity(mapIntent);
                            break;
                    }

                }
            });//endregion
        }
    }
}
