package com.example.contactapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    List<ContactModel> contacts;

    public ContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.layout_contact, null);

        TextView textLetter = view.findViewById(R.id.text_letter);
        TextView textName = view.findViewById(R.id.text_name);

        ContactModel contact = contacts.get(i);
        textName.setText(contact.getName());
        textLetter.setText(contact.getName().charAt(0) + "");

        return view;
    }
}
