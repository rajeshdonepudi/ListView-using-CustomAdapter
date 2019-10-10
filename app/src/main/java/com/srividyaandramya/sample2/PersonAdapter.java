package com.srividyaandramya.sample2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

class PersonAdapter extends ArrayAdapter<Person> {

    Context context;
    int resource;

    public PersonAdapter(Context context, int resource, ArrayList<Person> personArrayList) {
        super(context, resource, personArrayList);
        this.context = context;
        this.resource = resource;
    }

    public View getView(int position, View ConvertView, ViewGroup parent) {

        String name = getItem(position).getName();
        String gender = getItem(position).getGender();
        String dob = getItem(position).getDob();

        Person person = new Person(name, gender, dob);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ConvertView = layoutInflater.inflate(resource, parent, false);


        TextView textView = (TextView) ConvertView.findViewById(R.id.name);
        TextView textView1 = (TextView) ConvertView.findViewById(R.id.gender);
        TextView textView2 = (TextView) ConvertView.findViewById(R.id.dob);

        textView.setText(name);
        textView1.setText(gender);
        textView2.setText(dob);

        return ConvertView;
    }
}
