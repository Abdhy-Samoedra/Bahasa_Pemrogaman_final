package com.example.bahasapemrogaman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBahasa;
    private ArrayList<Bahasa> list = new ArrayList<>();
    private String title = "Mode List";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvBahasa = findViewById(R.id.rv_bahasa);
        rvBahasa.setHasFixedSize(true);

        list.addAll(BahasaData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvBahasa.setLayoutManager(new LinearLayoutManager(this));
        ListBahasaAdapter listBahasaAdapter = new ListBahasaAdapter(list);
        rvBahasa.setAdapter(listBahasaAdapter);

        listBahasaAdapter.setOnItemClickCallback(new ListBahasaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Bahasa data) {
                showSelectedBahasa(data);
            }
        });
    }
    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                 ;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
            break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
            break;
        }
        setActionBarTitle(title);
    }

    private void showRecyclerGrid(){
        rvBahasa.setLayoutManager(new GridLayoutManager(this, 2));
        GridBahasaAdapter gridBahasaAdapter = new GridBahasaAdapter(list);
        rvBahasa.setAdapter(gridBahasaAdapter);

        gridBahasaAdapter.setOnItemClickCallback(new GridBahasaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Bahasa data) {
                showSelectedBahasa(data);
            }
        });

    }

    private void showRecyclerCardView(){
        rvBahasa.setLayoutManager(new LinearLayoutManager(this));
        CardViewBahasaAdapter cardViewBahasaAdapter = new CardViewBahasaAdapter(list);
        rvBahasa.setAdapter(cardViewBahasaAdapter);
    }

    private void showSelectedBahasa(Bahasa bahasa){
        Toast.makeText(this, "kamu memilih " + bahasa.getName(), Toast.LENGTH_SHORT).show();
    }


}