import java.util.Scanner;
class AddTwoIntegers {
    public static void main(String args[]){
        int n1, n2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two integers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sum = n1 + n2;
        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + sum);
    }
}
