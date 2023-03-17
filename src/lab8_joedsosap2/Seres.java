/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_joedsosap2;

/**
 *
 * @author joeds
 */
public class Seres {
   private String nombre,universoproce,raza; 
   private int anio,poder,id;

    public Seres() {
    }

    public Seres(String nombre, String universoproce, String raza, int anio, int poder, int id) {
        this.nombre = nombre;
        this.universoproce = universoproce;
        this.raza = raza;
        this.anio = anio;
        this.poder = poder;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniversoproce() {
        return universoproce;
    }

    public void setUniversoproce(String universoproce) {
        this.universoproce = universoproce;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }
   
}
