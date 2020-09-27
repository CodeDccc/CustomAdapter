package edu.temple.customadapter;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintProperties;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
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
    View bgCol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner2 = findViewById(R.id.spinner2);
        bgCol = findViewById(R.id.bgCol);
        col = new ArrayList<>();
        fillArrayList ();
        final BaseAdapter adapter = new ColorAdapter(this, col);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equals("BLACK")) {
                    bgCol.setBackgroundColor(Color.BLACK);
                } else if (parent.getItemAtPosition(position).toString().equals("GREEN")) {
                    bgCol.setBackgroundColor(Color.GREEN);
                } else if (parent.getItemAtPosition(position).toString().equals("GRAY")) {
                    bgCol.setBackgroundColor(Color.GRAY);
                }else if(parent.getItemAtPosition(position).toString().equals("DARK GRAY")) {
                    bgCol.setBackgroundColor(Color.DKGRAY);
                }else if(parent.getItemAtPosition(position).toString().equals("CYAN")) {
                    bgCol.setBackgroundColor(Color.CYAN);
                }else if(parent.getItemAtPosition(position).toString().equals("RED")) {
                    bgCol.setBackgroundColor(Color.RED);
                }else if(parent.getItemAtPosition(position).toString().equals("MAGENTA")) {
                    bgCol.setBackgroundColor(Color.MAGENTA);
                }else if(parent.getItemAtPosition(position).toString().equals("LIGHT GRAY")) {
                    bgCol.setBackgroundColor(Color.LTGRAY);
                }else if(parent.getItemAtPosition(position).toString().equals("BLUE")) {
                    bgCol.setBackgroundColor(Color.BLUE);
                }else if(parent.getItemAtPosition(position).toString().equals("YELLO")) {
                    bgCol.setBackgroundColor(Color.YELLOW);
                }

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