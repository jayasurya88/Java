public class Transaction {
    private int fromAccount ;
    private int toAccount ;
    private double amount ;
    private String status ;


    public Transaction(int fromAccount,int toAccount,double amount,String status){
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }
    public void displayTransaction(){
        System.out.println("Transaction Deatils :");
        System.out.println("From Account : "+ fromAccount);
        System.out.println("To Account :"+toAccount);
        System.out.println("Amount : "+amount);
        System.out.println("Status "+status);
        System.out.println("--------------------------------------");
    }
}
