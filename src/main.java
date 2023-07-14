public class main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 300;
        int percent = 1;
        int bonus = amount * percent / 100;
        int check = balance + amount + bonus;

        if (amount>999) {
            System.out.println("Счет клиента = " + check);
        } else {
            System.out.println("Счет клиента = " + (amount+balance) );
        }
        }
}
