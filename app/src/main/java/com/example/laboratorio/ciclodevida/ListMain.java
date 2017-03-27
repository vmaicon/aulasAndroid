package com.example.laboratorio.ciclodevida;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListMain extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[]
                {"Calculadora",
                        "Principal",
                        "MainActivity",
                        "Antecessor e Sucessor",
                        "Questão 2",
                        "Questão 3",
                        "Questão 4",
                        "Questão 5",
                        "Questão 6",
                        "Questão 7",
                        "Questão 8",
                        "Questão 9",
                        "Questão 10",
                        "Questão 11",
                        "Questão 12",
                };
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        values);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l,
                                   View v, int position, long id) {

        String item = (String)
                getListAdapter().getItem(position);

        Toast.makeText(this, item + " selected",
                Toast.LENGTH_SHORT).show();

        Intent i;
        switch (item){
            case "Calculadora":
                i = new Intent(this, Calculadora.class);
                startActivity(i);
                break;
            case "Principal":
                i = new Intent(this, Principal.class);
                startActivity(i);
                break;
            case "MainActivity":
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case "Antecessor e Sucessor":
                i  = new Intent(this, Exercicio1Tela1.class);
                startActivity(i);
                break;
            case "Questão 2":
                i  = new Intent(this, Q02.class);
                startActivity(i);
                break;
            case "Questão 3":
                i  = new Intent(this, Q03.class);
                startActivity(i);
                break;

        }
    }
}
