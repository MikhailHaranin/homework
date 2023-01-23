public class Main {
    public static void main(String[] args) {
        CreditCard card1= new CreditCard("1111 1111 1111 1111",1200);
        CreditCard card2= new CreditCard("1111 1111 1111 1112",2000);
        CreditCard card3= new CreditCard("1111 1111 1111 1113",3000);
        card1.refill(1800);
        card2.refill(8000);
        card3.withdraw(3000);
        card1.info();
        card2.info();
        card3.info();
    }
}