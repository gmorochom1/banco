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
public class Cliente extends Persona{

    private Banco banco;

    public Cliente() {
        super();
    }

    public Cliente(int id, String cedula, String nombre, String apellido, String telefono, List<Direccion> agregarList) {
        super(id, cedula, nombre, apellido, telefono, agregarList);
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\nbanco=" + banco + '}';
    }
    
    

}
