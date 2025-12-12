import java.util.Scanner;
public class Prime {
    public static void main (String args[])
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean check = false;

        if(n <=1) {
            System.out.println(n + " is not a prime number");
            sc.close();
            return;
        }

        for(int i=2; i*i<=n; i++)
        {
            if(n%i == 0) {
                System.out.println(n +" is not a Prime Number");
                check = true;
                break;
            }
        }

        if(check != true) {
            System.out.println(n +" is a Prime Number");
        }

        sc.close();
    }
}
