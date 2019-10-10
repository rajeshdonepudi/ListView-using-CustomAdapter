package com.srividyaandramya.sample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        Person person1 = new Person("rajesh", "16-03-1998", "male");
        Person person2 = new Person("rajesh", "16-03-1998", "male");
        Person person3 = new Person("rajesh", "16-03-1998", "male");
        Person person4 = new Person("rajesh", "16-03-1998", "male");
        Person person5 = new Person("rajesh", "16-03-1998", "male");
        Person person6 = new Person("rajesh", "16-03-1998", "male");
        Person person7 = new Person("rajesh", "16-03-1998", "male");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);


        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.list_item_layout,persons);
        listView.setAdapter(personAdapter);

    }
}
