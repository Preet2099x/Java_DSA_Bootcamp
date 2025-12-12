import java.util.Scanner;
class Xstop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[1000];
        int sum = 0;

        System.out.print("Enter number: " );
        arr[0] = sc.nextInt();
        sum = arr[0]; 

        for(int i=1; i<1000; i++)
        {
            System.out.print("Enter next number or 'x' to finish: ");
            String str = sc.next();

            if(str.equals("x"))
            {
                System.out.println("Sum = " + sum);
                break;
            }


            arr[i] = Integer.parseInt(str);
            sum += arr[i]; 
        }
    }
}