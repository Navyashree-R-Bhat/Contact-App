package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends=new ArrayList<>();
        friends.add(new ContactModel("Q", "Q@gamil.com", "9900999900", R.drawable.female));
        friends.add(new ContactModel("R", "R@gamil.com", "9900999901", R.drawable.male));
        friends.add(new ContactModel("S", "S@gamil.com", "9900999902", R.drawable.female));
        friends.add(new ContactModel("T", "T@gamil.com", "9900999903", R.drawable.female));
        friends.add(new ContactModel("U", "U@gamil.com", "9900999904", R.drawable.female));
        friends.add(new ContactModel("V", "V@gamil.com", "9900999905", R.drawable.female));
        friends.add(new ContactModel("W", "W@gamil.com", "9900999906", R.drawable.male));
        friends.add(new ContactModel("X", "X@gamil.com", "9900999907", R.drawable.female));
        friends.add(new ContactModel("Y", "Y@gamil.com", "9900999908", R.drawable.male));
        friends.add(new ContactModel("Z", "Z@gamil.com", "9900999909", R.drawable.male));

        RecyclerView friends_recyclerView=findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,friends,R.color.category_friends);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}