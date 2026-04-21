package hundredDays.phase1.day7_BankAccount;

public class BankAccountMain {
    static void main(String[] args){
        BankAccount account = new BankAccount("Pietro", 1000.0);
        account.deposit(500.0);
        System.out.println(account.getBalance()); // 1500.0

// Trigger the fee — 5 withdrawals
        for (int i = 1; i <= 5; i++) {
            account.withdraw(100.0);
            System.out.println("After withdrawal " + i + ": " + account.getBalance());
        }
    }
}
