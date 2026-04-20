package hundredDays.phase1.day7_BankAccount;

public class BankAccount {
    private String owner;
    private double balance;
    private int withdrawCounterTaxAble=0;




    public BankAccount(String owner, double openingBalance ) {
        this.owner = owner;
        this.balance = openingBalance;

    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        withdrawCounterTaxAble++;
        if(withdrawCounterTaxAble % 5 == 0){
            balance -= 2.0;
            System.out.println("Fee applied after " + withdrawCounterTaxAble + " withdrawals.");
        }
        return true;
    }



    public double getBalance() {
        return balance;
    }



    public String getOwner() {
        return owner;
    }






}

