/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.cuentas;
import ec.edu.ups.clases.Banco;
import ec.edu.ups.clases.Cliente;


/**
 *
 * @author Geovanny Morocho
 */
public abstract class Cuenta {

    private int id;
    private double saldo;
    private String tipo;
    private double comision;
    private Cliente cliente;
    private Banco banco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public abstract double revisionMensual();

    public abstract boolean ingresarDinero(double monto);

    public abstract boolean sacarDinero(double monto);

    @Override
    public String toString() {
        return "Cuenta{" + "\nid=" + id + "\nsaldo=" + saldo + "\ntipo=" + tipo 
                + "\ncomision=" + comision + "\ncliente=" + cliente + "\nbanco=" + banco + '}';
    }

}
