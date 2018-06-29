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
public class FondoInversion extends Cuenta {

    private int id;
    private double interes;
    private int puntos;

    public FondoInversion() {
        super();
        setTipo("Fondo Inversion");
        this.puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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

    public void sumarPunto(double monto) {
        this.puntos = this.puntos+((int) (monto / 6));
    }

    @Override
    public boolean ingresarDinero(double monto) {
        this.setSaldo(getSaldo() + monto);
        sumarPunto(monto);
        return true;
    }

    @Override
    public boolean sacarDinero(double monto) {
        if (this.getSaldo() >= -500.0) {
            this.setSaldo(this.getSaldo() - monto);
            return true;
        } else {
            return false;
        }
    }
}
