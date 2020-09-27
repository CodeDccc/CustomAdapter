package edu.temple.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    ArrayList<String> col;
    Spinner spinner2;
   // TextView textView;
   // ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView = findViewById(R.id.textView);
        spinner2 = findViewById(R.id.spinner2);
        //listView = findViewById(R.id.listView);

        col = new ArrayList<>();
        fillArrayList ();
        final BaseAdapter adapter = new ColorAdapter(this, col);
       // ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, col);
        spinner2.setAdapter(adapter);
       // listView.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // textView.setText(parent.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    private void fillArrayList () {
            col.add("BLACK");
            col.add("BLUE");
            col.add("GREEN");
            col.add("DARK GRAY");
            col.add("YELLOW");
            col.add("CYAN");
            col.add("GRAY");
            col.add("MAGENTA");
            col.add("LIGHT GRAY");
            col.add("RED");

    }
}