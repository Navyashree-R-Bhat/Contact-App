package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work=new ArrayList<>();
        work.add(new ContactModel("A","A@gamil.com", "9999999900", R.drawable.female));
        work.add(new ContactModel("B","B@gamil.com", "9999999901", R.drawable.female));
        work.add(new ContactModel("C","C@gamil.com", "9999999902", R.drawable.male));
        work.add(new ContactModel("D","D@gamil.com", "9999999903", R.drawable.female));
        work.add(new ContactModel("E","E@gamil.com", "9999999904", R.drawable.male));
        work.add(new ContactModel("F","F@gamil.com", "9999999905", R.drawable.male));
        work.add(new ContactModel("G","G@gamil.com", "9999999906", R.drawable.male));
        work.add(new ContactModel("H","H@gamil.com", "9999999907", R.drawable.female));
        work.add(new ContactModel("I","I@gamil.com", "9999999908", R.drawable.female));
        work.add(new ContactModel("J","J@gamil.com", "9999999909", R.drawable.male));

        RecyclerView work_recyclerView=findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,work,R.color.category_work);
        work_recyclerView.setAdapter(contactAdapter);
    }
}