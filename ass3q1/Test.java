package ass3q1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int c = 0;
        int sum1 = 0;
        while (c == 0) {
            Ecommerce[] shopCar = new Ecommerce[50];

            Scanner type = new Scanner(System.in);
            Products pz = new Products();
            System.out.println("Please choose your product");
            System.out.println("#" + "  " + "Product Name" + "      " + "Price");
            System.out.println("1" + "  " + "Men T Shirt" + "       " + "15 dollars");
            System.out.println("2" + "  " + "Women T Shirt" + "     " + "15 dollars");
            System.out.println("3" + "  " + "Men Pant" + "          " + "10 dollars");
            System.out.println("4" + "  " + "Women Pant" + "        " + "25 dollars");


            int b = type.nextInt();
            String a = null;
            if (b == 1) {
                a = "Men T Shirt";
                sum1 = sum1 + 15;
            } else if (b == 2) {
                a = "Women T Shirt";
                sum1 = sum1 + 15;
            } else if (b == 3) {
                a = "Men Pant";
                sum1 = sum1 + 10;
            } else if (b == 4) {
                a = "Women Pant";
                sum1 = sum1 + 25;
            } else {
                System.out.println("Again");
            }
            pz.OrderProducts(a);


            System.out.println("Press 1 to Check Out, Press 0 to Continue Shopping");
            c = type.nextInt();
        }
        System.out.println("You need totally pay " + sum1 + ", " + "which method of payment you want to pay?");
        System.out.println("MasterCard");
        System.out.println("VisaCard");
        System.out.println("Leave");
        Scanner type = new Scanner(System.in);
        String command = type.nextLine();
        switch (command) {
            case "MasterCard":
                System.out.println("Thank you for shopping, your order will be deliveried within 2-5 days");
                System.out.println("Trackingnumber: "+ (int)Math.random()+1000000);
                break;
            case "VisaCard":
                System.out.println("Thank you for shopping, your order will be deliveried within 2-5 days");
                System.out.println("Trackingnumber: "+ (int)Math.random()+1000000);
                break;
            case "Leave":
                System.out.println("Your order has been canceled.");
                break;
        }

    }

}








