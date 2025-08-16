import java.util.Scanner;
public class taking_inp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Hey "+name+",tell me full name");
        System.out.println("Enter your full name:");
        String Name= sc.nextLine();
        System.out.println("Hey "+Name+",tell me this...");
        System.out.println("Enter your lucky number:");
        int num_1=sc.nextInt();
        System.out.println("oh! so your lucky numer is "+ num_1);

    }

}
