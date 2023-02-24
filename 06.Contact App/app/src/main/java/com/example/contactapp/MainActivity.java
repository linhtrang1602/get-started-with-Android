package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Faker faker = new Faker();
        contacts = new ArrayList<>();
        for (int i = 0; i < 50; i++)
            contacts.add(new ContactModel(i,
                    faker.name.name(),
                    faker.phoneNumber.phoneNumber(),
                    faker.internet.email()));

        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listContacts = findViewById(R.id.list_contacts);
        listContacts.setAdapter(adapter);

        listContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                
            }
        });
    }
}