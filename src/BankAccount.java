import com.sun.net.httpserver.Authenticator;

public class BankAccount {
    private String accountHolder ;
    private int accountNumber ;
    private double balance ;
    static  int accountCount ;

    public BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
        accountCount +=1 ;
    }
    public void displayAccountDetails(){
        System.out.println("Account number :"+accountNumber);
        System.out.println("Account Holder Name :"+accountHolder);
        System.out.println("Balance :"+balance);
    }
    public boolean withdraw (double amount){
        if (balance > 0 && balance >= amount){
            balance -= amount;
            return true ;

        }
        return  false ;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += balance;
        }else{
            System.out.println("Enter a valid amount");
        }

    }
    public Transaction transferTo (BankAccount target , double amount){
        if (this.withdraw(amount)) {
            target.deposit(amount);
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Success");
        }else{
            return new Transaction(this.accountNumber,target.accountNumber,amount,"Failed");
        }
    }

}

