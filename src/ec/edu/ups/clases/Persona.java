/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author caro
 */
public class Persona {

    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private List<Direccion> agregarList;

    public Persona() {
    }

    public Persona(int id, String cedula, String nombre, String apellido, String telefono, List<Direccion> agregarList) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.agregarList = agregarList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Direccion> getAgregarList() {
        return agregarList;
    }

    public void setAgregarList(List<Direccion> agregarList) {
        this.agregarList = agregarList;
    }

    @Override
    public String toString() {
        return "Persona{" + "\nid=" + id + "\ncedula=" + cedula + "\nnombre=" + nombre + "\napellido="
                + apellido + "\ntelefono=" + telefono + "\nagregarList=" + agregarList + '}';
    }
}
