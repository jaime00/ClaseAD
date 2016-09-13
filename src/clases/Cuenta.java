/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author jtorres61
 */
public class Cuenta {

    private long numero_cuenta;
    private long numero_identifcacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long numero_identifcacion, double saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.numero_identifcacion = numero_identifcacion;
        this.saldo_actual = saldo_actual;
    }

    public Cuenta(long numero_cuenta, long numero_identificacion) {
        this.numero_cuenta = numero_cuenta;
        this.numero_identifcacion = numero_identificacion;
        this.saldo_actual = 0;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getNumero_identifcacion() {
        return numero_identifcacion;
    }

    public void setNumero_identifcacion(long numero_identifcacion) {
        this.numero_identifcacion = numero_identifcacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void actualizarsaldo(double interes) {
        double aux = this.getSaldo_actual() + (interes / 365);
        double aux2 = this.getSaldo_actual() + aux;
        this.setSaldo_actual(aux2);

    }

    public void Ingresar(double ingreso) {
        double aux = this.getSaldo_actual() + ingreso;
        this.setSaldo_actual(aux);

    }

    public void Retirar(double egreso) {
        double aux = this.getSaldo_actual() - egreso;
        this.setSaldo_actual(aux);

    }

    public String mostrar() {
        String aux = "Numero de la cuenta " + this.getNumero_cuenta() + "\n"
                + "Numero de identificacion " + this.getNumero_identifcacion() + "\n"
                + "Saldo actual" + this.getSaldo_actual();
        return aux;
    }
}
