package ufps.poo2.ejercicio.banco;


public class CurrentAccount extends Account{
     private double overLimit;

    public CurrentAccount(int a) {
        super(a);
        this.overLimit=10;
    }
    
     @Override
     public void withdraw(double sum) {
    if((this.getBalance()+this.getOverLimit())>=sum){
        super.withdraw(sum);
    }else{
        System.out.println("The requested amount cannot be withdrawn from the account because it exceeds the overdraft limit.");
    }
}
		
       
    public double getOverLimit() {
        return overLimit;
    }

    public void setOverLimit(double overLimit) {
        this.overLimit = overLimit;
    }
     
}
