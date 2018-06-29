/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author caro
 */
public class Direccion {
    
     private int id;
     private String calleP;
     private String calleS;

    public Direccion() {
    }

    public Direccion(int id, String calleP, String calleS) {
        this.id = id;
        this.calleP = calleP;
        this.calleS = calleS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalleP() {
        return calleP;
    }

    public void setCalleP(String calleP) {
        this.calleP = calleP;
    }

    public String getCalleS() {
        return calleS;
    }

    public void setCalleS(String calleS) {
        this.calleS = calleS;
    }

    @Override
    public String toString() {
        return "Direccion{" + "\nid=" + id + "\ncalleP=" + calleP + "\ncalleS=" + calleS + '}';
    }
    
}
