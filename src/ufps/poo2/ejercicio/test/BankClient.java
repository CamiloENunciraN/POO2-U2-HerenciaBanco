package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.Bank;

public class BankClient {

public static void main(String[] args) {
		

		
		Bank bank = new Bank(); 		
		
                //quiz pruebas
                //agregar cuentas
                bank.openAccount("CDTAccount", 3354678);
                bank.openAccount("CurrentAccount", 3359302);
                bank.openAccount("SavingAccount", 3359301);
                bank.openAccount("CDTAccount", 3379844);
                //deposito en las cuentas
		bank.payDividend(3354678, 10);
		bank.payDividend(3354678, 30);
		bank.payDividend(3354678, 20);
		bank.payDividend(3354678, 40);

                //peticion de retiro
                bank.withdrawAccount(3354678, 20);
                //calcular rentabilidad cuenta CDT
                bank.calcularRentabilidad(3354678, 5);
                 //calcular rentabilidad cuenta de otro tipo (NO ES VALIDO)
                bank.calcularRentabilidad(3359302, 5);
                //listado de cuentas CDT
                bank.imprimirSaldoCuentasCDT(5);
                
//                bank.openAccount("SavingsAccount", 3354678);
//                bank.openAccount("SavingsAccount", 3359302);
//                bank.openAccount("CurrentAccount", 3379844);
//		
//		bank.payDividend(3354678, 10);
//		bank.payDividend(3354678, 30);
//		
//                bank.getBalance(3354678);
//                
//		bank.payDividend(3359302, 50);
//		bank.payDividend(3359302, 50);
//		
//		bank.payDividend(3379844, 10);
//		bank.payDividend(3379844, 10);
//		
//		bank.getBalance(3379844);
//		
//		bank.withdrawAccount(3379844, 20);
//		bank.withdrawAccount(3379844, 5);
//		
//		bank.getBalance(3379844);
//		
//		bank.withdrawAccount(3379844, 15);
//		
//		bank.getBalance(3379844);
//		
//		bank.sendLetterToOverdraftAccounts();
//		
//	

		
	}
	
}
