/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.cuentas.Cuenta;
import java.util.List;

/**
 *
 * @author caro
 */
public class Banco {

    private int id;
    private String nombre;
    private Direccion direccion;
    private List<Cuenta> cuentaList;

    public Banco() {
    }

    public Banco(int id, String nombre, Direccion direccion, List<Cuenta> cuentaList) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentaList = cuentaList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public String toString() {
        return "Banco{" + "\nid=" + id + "\nnombre=" + nombre + "\ndireccion=" + direccion + '}';
    }

}
