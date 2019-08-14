package com.example.appmaya;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Dos extends AppCompatActivity implements SearchView.OnQueryTextListener {

    // Declarar Variables
    ListView list;
    ListViewAdapter adapter;
    SearchView editsearch;
    String[] zonasArq;
    int[] imagenes;
    ArrayList<BuscadorClass> arraylist = new ArrayList<BuscadorClass>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscador);
        // Generar datos de muestra
        zonasArq = new String[]{"Chichén Itzá", "Zona Arqueológica de Tulum", "Cobá",
                "Ruinas de Xaman-Há", "Xcaret", "Uxmal", "Palenque", "Kohunlich",
                "Ruinas de San Miguelito y Museo Maya de Cancún"," Zona Arqueológica El Tajín"};


        // Buscar los datos y presentarlos en el list_view_item.xml


        list = (ListView) findViewById(R.id.listView);
        for (int i = 0; i < zonasArq.length; i++) {
            BuscadorClass animalNames = new BuscadorClass(zonasArq[i]);


            // Vincula todas las cadenas a una matriz
            arraylist.add(animalNames);
        }
        // Pasar los resultados a la clase ListViewAdapter
        adapter = new ListViewAdapter(this, arraylist);
        // Vincula el adaptador a ListView
        list.setAdapter(adapter);
        // Buscar los datos y presentarlos en el listview_main.xml
        editsearch = (SearchView) findViewById(R.id.searchView);
        editsearch.setOnQueryTextListener(this);
    }
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }
    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}
