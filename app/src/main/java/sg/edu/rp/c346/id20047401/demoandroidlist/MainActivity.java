package sg.edu.rp.c346.id20047401.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        al.add(new AndroidVersion("Oreo", "1"));
        al.add(new AndroidVersion("Nought", "2"));
        al.add(new AndroidVersion("Pie", "3"));
        al.add(new AndroidVersion("Oreo", "1"));

        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al);
        adapter = new CustomAdapter(MainActivity.this,R.layout.row, al);
        lv.setAdapter(adapter);

    }
}