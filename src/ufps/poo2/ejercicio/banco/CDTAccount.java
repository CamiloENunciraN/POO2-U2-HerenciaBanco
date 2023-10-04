/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco;

/**
 *
 * @author camilo Nuncira
 */
public class CDTAccount extends Account{

    public CDTAccount(int a) {
        super(a);
    }
    
    public void calcularRentabilidad(int numDias){
       Double i=((this.getBalance()/100)*numDias)+this.getBalance();
           System.out.println("Acc " + this.getAccountNumber() + ": " + "Rentabilidad = " + i);  
    }
    
    @Override
    	public  void withdraw(double sum) {
        System.out.println("Esta cuenta no permite hacer retiros");
	}
    
}
