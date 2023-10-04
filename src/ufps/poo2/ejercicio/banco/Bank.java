package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;

public class Bank {
private ArrayList <Account> accounts;

public Bank() {
    this.accounts=new ArrayList<Account>();
}

public void openAccount(String AccountType, int accnum){
    Account c;
    if(AccountType=="SavingsAccount"){
        c=new SavingsAccount(accnum);
    }else if(AccountType=="CurrentAccount"){
        c=new CurrentAccount(accnum);
    }else if(AccountType=="CDTAccount"){
        c=new CDTAccount(accnum);
    }else{
        c=new Account(accnum);
    }
    this.accounts.add(c);
    System.out.println("Account open: "+c.getAccountNumber());
}

public void deleteAccount(int accnum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.err.println("Account not found");
    }else{
        this.accounts.remove(acc);
        System.out.println("Account remove: "+acc.getAccountNumber());
    }
}

private Account searchAccount(int accnum){
    for(int i=0;i<this.accounts.size();i++){
        if(this.accounts.get(i).getAccountNumber()==accnum){
            return this.accounts.get(i);
        }  
    }
    return null;
}

public void payDividend(int accnum, double sum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.err.println("Account not found");
    }else{
        acc.deposit(sum);
        System.out.println("Acc "+acc.getAccountNumber()+" deposit: "+sum);
    }
}

public void withdrawAccount(int accnum, double sum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.out.println("Account not found");
    }else{
        System.out.println("Acc "+acc.getAccountNumber()+" withdraw: "+sum);
        acc.withdraw(sum);
    }
}

public void getBalance(int accnum){
    Account acc=this.searchAccount(accnum);
    if(acc==null){
       System.out.println("Account not found");
    }else{
     acc.print();
    }
}

public void sendLetterToOverdraftAccounts(){
    for(int i=0;i<this.accounts.size();i++){
        Account c=this.accounts.get(i);
        if(c instanceof CurrentAccount && c.getBalance()<0){
            System.out.println("---------Account in overdraft----------");
            c.print();
        }  
    } 
}

public void imprimirSaldoCuentasCDT(int numDias){
    System.out.println("------Listado de cuentas CDT------");
    for(int i=0;i<this.accounts.size();i++){
        if(this.accounts.get(i) instanceof CDTAccount){
          CDTAccount c=  (CDTAccount) this.accounts.get(i);
          c.calcularRentabilidad(numDias);
        }
    }
}

    public void calcularRentabilidad(int accnum, int numDias) {
        Account c=this.searchAccount(accnum);
        
         if(c instanceof CDTAccount){
             ((CDTAccount) c).calcularRentabilidad(numDias);
         }else{
             System.out.println("La cuenta: "+accnum+" no es de tipo CDT");
         }
    }

}
