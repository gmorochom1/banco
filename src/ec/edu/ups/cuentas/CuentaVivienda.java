/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.cuentas;


/**
 *
 * @author caro
 */
public class CuentaVivienda extends Cuenta {

    private int id;
    private double interes;

    public CuentaVivienda() {
        super();
        setTipo("Cuenta vivienda");
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public double revisionMensual() {
        double rm = getSaldo() + getInteres();
        return rm;
    }

    @Override
    public boolean ingresarDinero(double monto) {
        this.setSaldo(getSaldo() + monto);
        return true;
    }

    @Override
    public boolean sacarDinero(double monto) {
        return false;
    }
}
