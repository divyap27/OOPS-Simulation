class BankAccountMain{
    public static void main(String[] args) {
        BankAccount bankaccount =new BankAccount();
        bankaccount.deposit(500);
        bankaccount.withdraw(300);
        bankaccount.checkbalance();
    }
}