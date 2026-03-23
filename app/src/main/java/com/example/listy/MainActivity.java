package com.example.listy;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Produkt> arrayListProdukty;
    private ArrayAdapter<Produkt> arrayAdapter;
    private ListView listView;


    private Button button;
    private EditText editTextNazwa, editTextCena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        arrayListProdukty = new ArrayList<>();
        arrayListProdukty.add(new Produkt("chleb", 4.6, false));
        arrayListProdukty.add(new Produkt("bulki", 0.25, true));
        arrayListProdukty.add(new Produkt("kielbasa", 5.99, true));

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListProdukty);
        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                arrayListProdukty.get(i).odwroc();
                arrayAdapter.notifyDataSetChanged();
            }
        });


        button = findViewById(R.id.button);
        editTextNazwa = findViewById(R.id.editTextNazwaProduktu);
        editTextCena = findViewById(R.id.editTextCena);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nazwa = editTextNazwa.getText().toString();
                double cena = Double.parseDouble(editTextCena.getText().toString());

                arrayListProdukty.add(new Produkt(nazwa, cena, false));
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }

}