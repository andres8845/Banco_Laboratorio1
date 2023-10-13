/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author andre
 */
public class CuentaBancaria{
    private int codigo;
    private String nombreCliente;
    private double saldo;

    public CuentaBancaria(int codigo, String nombreCliente){
        this.codigo=codigo;
        this.nombreCliente=nombreCliente;
        this.saldo=500;
    }

    public int getCodigo(){
        return codigo;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double monto){
        if(monto>=0){
            this.saldo=this.saldo+monto;
        }
    }
    
    public boolean retirar(double monto){
        if(monto>=0 && monto<this.saldo){
            this.saldo=this.saldo-monto;
            return true;
        }
        return false;
    }
    
    public void print(){
        System.out.println("Codigo: "+this.codigo+" - Nombre: "+this.nombreCliente+" - Saldo: "+this.saldo);
    }
}
