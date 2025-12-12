import java.util.Scanner;
class HcfLcm {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        System.out.println("HCF = " + x);

        int lcm = (a*b)/x;
        System.out.println("LCM = " + lcm);

    }
}