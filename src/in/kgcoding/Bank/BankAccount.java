package in.kgcoding.Bank;

 class BankAccount {
     private String accountNumber;
     private String accountHolderName;
     private double balance;



     public BankAccount() {
     }

     public BankAccount(String accountHolderName,String accountNumber) {
         this.accountHolderName = accountHolderName;
         this.accountNumber=accountNumber;
     }

     public void depositmoney(double money){
         if(money<=0){
             System.out.println("invalid deposit");
         }else {
             balance += money;
         }

     }
     public double withdrarmoney(double money){
         if (money<=0){
             System.out.println(" invalid withdraw");
             balance-=money;
         } else if (balance>=money) {
balance-=money;
         }else{
        money=balance;
        balance=0;
         }

         return money;
     }
}
