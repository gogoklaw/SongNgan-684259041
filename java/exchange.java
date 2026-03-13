import java.util.Scanner;

public class exchange{
    public static void main(String[] args) {
        System.out.println("-------Konijiwaaa-------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        float amount = sc.nextFloat();
        System.out.println("We have 1.Thailand 2.Vietnam");
        System.out.print("Select Currency you want: ");
        int Currency = sc.nextInt();
        System.out.println("------------------------");


        System.out.println("-------Result-------");
        if(Currency == 1){
            float total = amount/5;
            System.out.println(amount+" Yen = "+total+" Bath");
        }
        else if (Currency == 2) {
            float total = amount*165;
            System.out.println(amount+" Yen ="+total+" Dong");
        }
        else{
            System.out.println("Sorry, Try again");
        }
        
    }
}