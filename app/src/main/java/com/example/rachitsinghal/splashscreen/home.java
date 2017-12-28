package com.example.rachitsinghal.splashscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

import me.toptas.fancyshowcase.FancyShowCaseView;

public class home extends AppCompatActivity {

    String[] lstSource={
            "Chanderi Sarees",
            "Darjeeling Tea",
            "Mysore Silk",
            "Navara Rice",
            "Kangra Tea",
            "Coimbatore Wet Grinder",
            "Kasuti Embroidery",
            "Madhubani Paintings",
            "Kashmir Pashmina",
            "Allahabad Surkha Guava",
            "Pokkali Rice",
            "Banaras Brocades and Sarees",
            "Lucknow Chikan Craft"
    };
    MaterialSearchView materialSearchView;
    ListView listView;
    //Code for getting focus on any button
    /*Button button4,button,button2,button7;
    public void focusMe(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 1!!!")
                .focusOn(view)
                .build()
                .show();
    }
    public void focusMee(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 2!!!")
                .focusOn(view)
                .build()
                .show();
    }
    public void focusMeee(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 3!!!")
                .focusOn(view)
                .build()
                .show();
    }
    public void focusMeeee(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 4!!!")
                .focusOn(view)
                .build()
                .show();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*button4=(Button)findViewById(R.id.button4);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button7=(Button)findViewById(R.id.button7);*/
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search It");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstSource);
        listView.setAdapter(adapter);
        materialSearchView= (MaterialSearchView)findViewById(R.id.search_view);
        materialSearchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {

                listView=(ListView)findViewById(R.id.listView);
                ArrayAdapter adapter=new ArrayAdapter(home.this,android.R.layout.simple_list_item_1,lstSource);
                listView.setAdapter(adapter);
            }
        });

        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText!=null && !newText.isEmpty()){
                    List<String> lstFound=new ArrayList<String>();
                    for (String item:lstSource){
                        if(item.contains(newText))
                            lstFound.add(item);
                    }
                    ArrayAdapter adapter=new ArrayAdapter(home.this,android.R.layout.simple_list_item_1,lstFound);
                    listView.setAdapter(adapter);
                }
                else {
                    //if search text is null
                    //return default
                    ArrayAdapter adapter=new ArrayAdapter(home.this,android.R.layout.simple_list_item_1,lstSource);
                    listView.setAdapter(adapter);
                }
                return true;
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item_xml,menu);
        MenuItem item=menu.findItem(R.id.action_search);
        materialSearchView.setMenuItem(item);
        return true;
    }
}
