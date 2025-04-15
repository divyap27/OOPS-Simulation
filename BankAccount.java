class BankAccount{
    int balance = 1000;


    void deposit(int amount){
        if (amount>0){
            balance =balance+amount;
            System.out.println("Amount Deposited successfully: "+ amount);
            System.out.println("current balance :"+balance);


        }
        else{
            System.out.println("invalid amount");
        }
        System.out.println("---------------------------------");
        }
        
    void withdraw(int amount){

        if(amount < balance){
            balance=balance-amount;
            System.out.println("withdraw successfully:" +amount);
            System.out.println("current balance:"+ balance);
        }
        else{
            System.out.println("Insufficient balance to withdraw ");
        }
System.out.println("---------------------");
        }
        void checkbalance( ){
            System.out.println("your current balance :"+ balance);
        }
    }
    
    
