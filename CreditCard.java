public class CreditCard {
    String number;
    int balance;


    public CreditCard(String number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    void refill(int amount){
        balance +=amount;
    }
    void withdraw(int amount){
        balance-=amount;
    }


    void info (){
        System.out.println("Card number: " + number + ", balance: " + balance);
    }

}