package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family=new ArrayList<>();
        family.add(new ContactModel("AA", "AA@gmail.com", "9990009999", R.drawable.male));
        family.add(new ContactModel("AB", "AB@gmail.com", "9990009998", R.drawable.female));
        family.add(new ContactModel("AC", "AC@gmail.com", "9990009997", R.drawable.female));
        family.add(new ContactModel("AD", "AD@gmail.com", "9990009996", R.drawable.male));
        family.add(new ContactModel("AE", "AE@gmail.com", "9990009995", R.drawable.male));
        family.add(new ContactModel("AF", "AF@gmail.com", "9990009994", R.drawable.female));
        family.add(new ContactModel("AG", "AG@gmail.com", "9990009993", R.drawable.female));
        family.add(new ContactModel("AH", "AH@gmail.com", "9990009992", R.drawable.male));
        family.add(new ContactModel("AI", "AI@gmail.com", "9990009991", R.drawable.male));
        family.add(new ContactModel("AJ", "AJ@gmail.com", "9990009990", R.drawable.female));

        RecyclerView family_recyclerView=findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,family,R.color.category_family);
        family_recyclerView.setAdapter(contactAdapter);
    }
}