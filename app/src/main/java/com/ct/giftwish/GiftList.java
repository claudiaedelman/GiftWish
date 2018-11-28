package com.ct.giftwish;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ct.giftwish.R;

/**
 * Created by edelmanclaudia on 26/04/2018.
 */

public class GiftList extends Activity{

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
        setContentView(R.layout.my_wish_list);

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


    }

}
