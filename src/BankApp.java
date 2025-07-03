public class BankApp {
    public static void main(String[] args) {
        BankAccount  account1 =new BankAccount("Jayasurya",1000);
        BankAccount  account2 =new BankAccount("Rohit",650);
        System.out.println("-----------:Intial Account Details:-----------");
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        Transaction t1 = account1.transferTo(account2,300);
        t1.displayTransaction();

        Transaction t2 = account2.transferTo(account1,6000);
        t2.displayTransaction();

        System.out.println("Final Accoutn Details");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
