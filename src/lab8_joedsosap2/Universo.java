/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_joedsosap2;

import java.util.ArrayList;

/**
 *
 * @author joeds
 */
public class Universo {
    private String nombre;
    private ArrayList<Seres> seresvivos = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seres> getSeresvivos() {
        return seresvivos;
    }

    public void setSeresvivos(ArrayList<Seres> seresvivos) {
        this.seresvivos = seresvivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
