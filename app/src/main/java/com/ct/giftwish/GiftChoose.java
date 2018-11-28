package com.ct.giftwish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.ct.giftwish.R;

/**
 * Created by claudiaedelman on 23/04/2018.
 */

public class GiftChoose extends Activity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.gift_choose);

        //ArrayList<Dog> dogs = new ArrayList<>();

//
//        ArrayAdapter<GiftItem> adapter = new ArrayAdapter<GiftItem>(this,R.layout.list_singel,R.id.txtfirst);
//
//        adapter.add(new GiftItem(,"Bike","Naftali Shop"));
//        adapter.add(new GiftItem(,"Football","Pirat hadom"));
//        adapter.add(new GiftItem(,"Basketball","Eli's Shop"));
//        adapter.add(new GiftItem(,"Prince","Ebay"));
//        adapter.add(new GiftItem(,"Magnets triangle","Naftali Shop"));
//
//        setListAdapter(adapter);
//
//
//
//    }
//
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//        LinearLayout linear = (LinearLayout)v;
//        TextView textView  = (TextView)linear.findViewById(R.id.txtfirst);
//        Toast.makeText(this,textView.getText().toString(), Toast.LENGTH_SHORT).show();
//    }

        ListView list;
        final String[] itemname = {
                "Bike",
                "Football",
                "Basketball",
                "Barbaba",
                "Magnets triangle",
                "Water Puzzel",
               "LEGO Ninjago Green Mech Dragon ",
        };

        Integer[] imgid = {
                R.drawable.bike,
                R.drawable.soccerball,
                R.drawable.basketball,
                R.drawable.barbapap_book,
                R.drawable.magnet,
                R.drawable.puzzel,
                R.drawable.lego,
        };

        final String[] shopname = {
                "Naftali Shop",
                "Elis Shop",
                "Ebay",
                "MisterHid Books Shop",
                "Naftali Shop",
                "Kfar hshashsoim",
                "Ben's Shop",
        };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_choose);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, shopname);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });


        Button btndone = (Button) findViewById(R.id.btnfinish);

        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GiftChoose.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }


    }