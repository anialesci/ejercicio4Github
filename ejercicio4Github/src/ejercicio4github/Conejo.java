package ejercicio4github;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Conejo {
    private Integer id;
    private String raza;
    private double peso;
    private double altura;
    private String nombre;

    public Conejo() {
    }

    public Conejo(Integer id, String raza, double peso, double altura, String nombre) {
        this.id = id;
        this.raza = raza;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Conejo{" + "id=" + id + ", raza=" + raza + ", peso=" + peso + ", altura=" + altura + ", nombre=" + nombre + '}';
    }
    
    
}
