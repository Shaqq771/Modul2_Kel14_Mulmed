package com.example.modul2_kel14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ListView listView = findViewById(R.id.list_kelompok);
        HashMap<String, String> ListAnggota = new HashMap<>();
        ListAnggota.put("Muhammad Faris Rizqan","21120119100083");
        ListAnggota.put("ODDY RAMADHAN PUTRA WINATA","21120119140122");
        ListAnggota.put("Muhammad Ishaq Matanggwan","21120119130053");
        ListAnggota.put("RAMA PRADANA PUTRA","21120119140125");

        List<HashMap<String, String>> listItem = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItem, R.layout.list_layout, new String[]{"First Line", "Second Line"}, new int[]{R.id.textView1, R.id.textView2});


        Iterator it = ListAnggota.entrySet().iterator();
        while (it.hasNext()){
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItem.add(resultsMap);
        }
        listView.setAdapter(adapter);
    }
}