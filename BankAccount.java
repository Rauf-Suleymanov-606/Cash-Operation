public class BankAccount {
    private double balance;
    private double money;

    public BankAccount(double balance, double money) {
        this.balance = balance;
        this.money = money;
    }
    public BankAccount(){
        System.out.println("This is the best way to make constructor rather than Java_Developer made!");
    }
    protected String checkPoint(){
        return "Your transaction successfully accomplished";
    }

    public void insufficientBalance() {
        double totalBalance = balance - money;
        if (balance < money) {
            throw new InsufficientBalanceException("Insufficient balance please, increase your card balance!");

        } else {
            System.out.println("Operation successfully completed and your balance is : " + totalBalance + " USD");
        }


    }
}
