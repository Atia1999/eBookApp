package com.example.eshoboiporiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<subjectModel> list;
    SubjectAdapter adapter;
    RecyclerView recyclerView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menu;
    View header;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        recyclerView=findViewById(R.id.recySubject);
        menu=findViewById(R.id.menu);

        drawerLayout=(DrawerLayout) findViewById(R.id.drawerlayout);
        navigationView=(NavigationView) findViewById(R.id.navView);

        list = new ArrayList<>();
        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        list.add(new subjectModel("Deyal by HA"));
        list.add(new subjectModel("Ei Boshonte by HA"));
        list.add(new subjectModel("Nobiji by HA"));
        list.add(new subjectModel("Himu by HA"));
        list.add(new subjectModel("Mohapurush by HA"));
        list.add(new subjectModel("Misir Ali HA"));
        list.add(new subjectModel("Josna o Jononir Golpo by HA"));
        list.add(new subjectModel("Amar Ache Jol by HA"));
        list.add(new subjectModel("Megher Upor Bari by HA"));
        list.add(new subjectModel("Lilaboti by HA"));
        list.add(new subjectModel("shajghor by HA"));
        list.add(new subjectModel("Noboni by HA"));

        adapter = new SubjectAdapter(this,list);
        recyclerView.setAdapter(adapter);
        header = navigationView.getHeaderView(0);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerOpen(GravityCompat.START))
                {
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else
                {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                    case R.id.share:
                         String shareBody="Hey, I am using best book App";
                         Intent intent=new Intent(Intent.ACTION_SEND);
                         intent.setType("text/plain");
                         intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                         startActivity(intent);

                        drawerLayout.closeDrawer(GravityCompat.START);
                    case R.id.rate:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/")));
                        drawerLayout.closeDrawer(GravityCompat.START);

                }
                return true;
            }
        });
    }
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
}