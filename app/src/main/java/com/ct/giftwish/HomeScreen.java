package com.ct.giftwish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ct.giftwish.R;

/**
 * Created by claudiaedelman on 24/04/2018.
 */

public class HomeScreen extends Activity
{
    ListView list;
    final String[] itemname = {
            "Liron",
            "Tom",
            "Aviv",
            "Eli",
            "Moran",
            "Tal",
            "Sharon",
    };

    Integer[] imgid = {
            R.drawable.kid1,
            R.drawable.kid2,
            R.drawable.kid3,
            R.drawable.kid4,
            R.drawable.kid5,
            R.drawable.kid6,
            R.drawable.kid7,
    };

    final String[] shopname = {
            "10.5.18",
            "20.5.18",
            "5.6.18",
            "7.7.18",
            "15.7.18",
            "20.10.18",
            "12.12.18",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, shopname);
        list = (ListView) findViewById(R.id.listsoonbirth);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeScreen.this, GiftList.class);
                startActivity(intent);

            }
        });



    }

}

