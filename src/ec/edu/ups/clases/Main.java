/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.cuentas.FondoInversion;
import ec.edu.ups.cuentas.CuentaCorriente;
import ec.edu.ups.cuentas.CuentaVivienda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geovanny Morocho
 */
public class Main {

    public static void main(String[] args) {

        //Bancos
        Banco b = new Banco();
        b.setId(1);
        b.setNombre("Banco del Austro");
        Direccion dBanco = new Direccion();
        dBanco.setId(1);
        dBanco.setCalleP("Presidente Borrero");
        dBanco.setCalleS("Mariscal Sucre");
        b.setDireccion(dBanco);

        Banco b2 = new Banco();
        b2.setId(1);
        b2.setNombre("Banco del Pichincha");
        Direccion dBanco2 = new Direccion();
        dBanco2.setId(1);
        dBanco2.setCalleP("Av. Solano");
        dBanco2.setCalleS("Av. 12 de abril");
        b2.setDireccion(dBanco2);
        
        
        //cliente 1
        Cliente c = new Cliente();
        c.setId(1);
        c.setCedula("0109876327");
        c.setNombre("Carolina");
        c.setApellido("Matovelle");
        c.setTelefono("0939392938");

        Direccion dClienteP = new Direccion();
        dClienteP.setId(1);
        dClienteP.setCalleP("Av. españa");
        dClienteP.setCalleS("Elia Liut");

        Direccion dClienteS = new Direccion();
        dClienteS.setId(2);
        dClienteS.setCalleP("Calle vieja");
        dClienteS.setCalleS("Elia Liut");

        List<Direccion> listDireccions = new ArrayList<>();
        listDireccions.add(dClienteP);
        listDireccions.add(dClienteS);
        c.setBanco(b);

        //cliente 2
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setCedula("0109326327");
        c1.setNombre("Doris");
        c1.setApellido("Marca");
        c1.setTelefono("0939322938");

        Direccion dClienteP1 = new Direccion();
        dClienteP1.setId(1);
        dClienteP1.setCalleP("Av. españa");
        dClienteP1.setCalleS("Elia Liut");

        Direccion dClienteS1 = new Direccion();
        dClienteS1.setId(2);
        dClienteS1.setCalleP("Ave americas");
        dClienteS1.setCalleS("Santiago calle");

        List<Direccion> listDireccions1 = new ArrayList<>();
        listDireccions1.add(dClienteP1);
        listDireccions1.add(dClienteS1);

        c.setAgregarList(listDireccions);
        c1.setAgregarList(listDireccions1);
        c1.setBanco(b2);
        

        System.out.println("\n--------------- DATOS DE INGRESO -------------------");
        //Cuenta corriente
        List<CuentaCorriente> lista = new ArrayList<>();
        CuentaCorriente cc = new CuentaCorriente();
        cc.setInteres(0.1);
        cc.setSaldo(20);
        cc.setComision(0.6);
        cc.setCliente(c1);
        cc.setBanco(b);
        System.out.println("SALDO ACTUAL :" + cc.getSaldo());

        //retirar dinero
        double montoASacar = 10;
        if (cc.sacarDinero(montoASacar) == true) {
            System.out.println("Dinero retirado de su cuenta " + montoASacar);
        } else {
            System.out.println("No cuenta con la cantidad de dinero que solicita");
        }

        //ingresar dinero
        double ingresarMonto = 10;
        if (cc.ingresarDinero(ingresarMonto) == true) {
            System.out.println("Se ha depositado " + ingresarMonto + " a su cuenta");
        } else {
            System.out.println("Transaccion incorrecta");
        }

        cc.ingresarDinero(200);
        System.out.println("Se ha depositado 200 dolares a su cuenta");
        lista.add(cc);

        for (CuentaCorriente CC : lista) {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("\nTipo de Cuenta : " + CC.getTipo()
                    + "\nInteres : " + CC.getInteres()
                    + "\nComision : " + CC.getComision()
                    + "\nCliente : " + CC.getCliente().getNombre() + " " + CC.getCliente().getApellido()
                    + "\nBanco : " + CC.getBanco().getNombre()
                   + "\nDireccion del Banco : " + CC.getBanco().getDireccion().getCalleP() + " y " + CC.getBanco().getDireccion().getCalleS()
                    + "\nSaldo : " + CC.getSaldo()
                    + "\nRevision Mensual :" + CC.revisionMensual());
        }
        System.out.println("\n--------------- DATOS DE INGRESO -------------------");
        //Cuenta Vivienda
        List<CuentaVivienda> listaCuentaViviendas = new ArrayList<>();
        CuentaVivienda cv = new CuentaVivienda();
        cv.setInteres(0.2);
        cv.setSaldo(20);
        cv.setComision(0.6);
        cv.setCliente(c);
        cv.setBanco(b2);
        System.out.println("SALDO ACTUAL :" + cv.getSaldo());

        //retirar dinero
        double montoASacarCV = 10;
        if (cv.sacarDinero(montoASacarCV) == true) {
            System.out.println("Dinero retirado de su cuenta " + montoASacarCV);
        } else {
            System.out.println("No se puede sacar dinero de su cuenta");
        }

        //ingresar dinero
        double ingresarMontoCV = 10;
        if (cv.ingresarDinero(ingresarMontoCV) == true) {
            System.out.println("Se ha depositado " + ingresarMontoCV + " a su cuenta");
        } else {
            System.out.println("Transaccion incorrecta");
        }

        cv.ingresarDinero(200);
        System.out.println("Se ha depositado 200 dolares a su cuenta");
        listaCuentaViviendas.add(cv);

        for (CuentaVivienda CV : listaCuentaViviendas) {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("\nTipo de Cuenta : " + CV.getTipo()
                    + "\nInteres : " + CV.getInteres()
                    + "\nComision : " + CV.getComision()
                    + "\nCliente : " + CV.getCliente().getNombre() + " " + CV.getCliente().getApellido()
                    + "\nBanco : " + CV.getBanco().getNombre()
                    + "\nDireccion del Banco : " + CV.getBanco().getDireccion().getCalleP() + " y " + CV.getBanco().getDireccion().getCalleS()
                    + "\nSaldo : " + CV.getSaldo()
                    + "\nRevision Mensual :" + CV.revisionMensual()
            );
        }

        System.out.println("\n--------------- DATOS DE INGRESO -------------------");
        //Fondo Inversion
        List<FondoInversion> listaFondoInversion = new ArrayList<>();
        FondoInversion fi = new FondoInversion();
        fi.setInteres(0.34);
        fi.setSaldo(20);
        fi.setComision(0.6);
        fi.setCliente(c1);
        fi.setBanco(b);
        System.out.println("SALDO ACTUAL :" + fi.getSaldo());

        //retirar dinero
        double montoASacarFI = 10;
        if (fi.sacarDinero(montoASacarFI) == true) {
            System.out.println("Dinero retirado de su cuenta " + montoASacarFI);
        } else {
            System.out.println("No cuenta con la cantidad de dinero que solicita");
        }

        //ingresar dinero
        double ingresarMontoFI = 10;
        if (fi.ingresarDinero(ingresarMontoFI) == true) {
            System.out.println("Se ha depositado " + ingresarMontoFI + " a su cuenta");
        } else {
            System.out.println("Transaccion incorrecta");
        }

        fi.ingresarDinero(200);
        System.out.println("Se ha depositado 200 dolares a su cuenta");
        listaFondoInversion.add(fi);

        fi.ingresarDinero(20);
        
        for (FondoInversion FI : listaFondoInversion) {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("\nTipo de Cuenta : " + FI.getTipo()
                    + "\nInteres : " + FI.getInteres()
                    + "\nComision : " + FI.getComision()
                    + "\nCliente : " + FI.getCliente().getNombre() + " " + FI.getCliente().getApellido()
                    + "\nBanco : " + FI.getBanco().getNombre()
                    + "\nDireccion del Banco : " + FI.getBanco().getDireccion().getCalleP() + " y " + FI.getBanco().getDireccion().getCalleS()
                    + "\nSaldo : " + FI.getSaldo()
                    + "\nPuntos : " + FI.getPuntos()
                    + "\nRevision Mensual :" + FI.revisionMensual()
            );
        }
        
        /*for(int i=0; i< listaFondoInversion.size(); i++) {
            System.out.println(listaFondoInversion.get(i));
        }*/
    }
}
