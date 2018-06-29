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
public class CuentaCorriente extends Cuenta {

    private int id;
    private double interes;


    public CuentaCorriente() {
        super();
        setTipo("Cuenta corriente");
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }


    @Override
    public double revisionMensual() {
        double rm = getSaldo() + getInteres() - getComision();
        return rm;
    }

    @Override
    public boolean ingresarDinero(double monto) {
        this.setSaldo(getSaldo() + monto);
        return true;
    }



    @Override
    public boolean sacarDinero(double monto) {
        if (monto < this.getSaldo()) {
            this.setSaldo(this.getSaldo() - monto);
            return true;
        } else {
            return false;
        }
    }
}
