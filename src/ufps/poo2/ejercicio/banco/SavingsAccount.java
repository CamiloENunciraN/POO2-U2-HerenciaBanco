
package ufps.poo2.ejercicio.banco;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a) {
        super(a);
        this.interest=10;///%
    }
    
    @Override
    	public void deposit(double sum) {
            double porcentaje=(this.getBalance()*this.getInterest())/100;
            super.deposit(sum+porcentaje);
	}

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
      
}
