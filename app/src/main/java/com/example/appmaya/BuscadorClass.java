package com.example.appmaya;


import androidx.appcompat.app.AppCompatActivity;

public class BuscadorClass extends AppCompatActivity {
    //--Declaramos la variable que tomara los nombres recibidos en la función
    private String zonasArq;
    //--Función que recibe los nombres
    public BuscadorClass(String nombresAnimales) {
        this.zonasArq = nombresAnimales;
    }
    //--Función que regresa el nombre recibido y asigando a la variable
    public String getAnimalName() {
        return this.zonasArq;
    }
}
