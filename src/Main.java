public class Main {
    public static void main (String[] args) {

        double price = 6.42;
        double tax = 1.7;
        int quantity = 6;
        double total = (price*quantity*tax);

        System.out.println("I want to buy " + quantity + " shirt!");

        //System.out.println(price*quantity*tax);

        System.out.println("The total cost with tax is " + total);


    }

}