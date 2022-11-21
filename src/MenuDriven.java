import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int ex;
        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1.Largest of 3. 2.Smallest of 3 3.Prime or not 4.Even or not 5.Reverse 6.Exit");
            int operation=sc.nextInt();


            switch (operation) {
                case 1:
                    System.out.println("Enter the first number");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number");
                    int b = sc.nextInt();
                    System.out.println("Enter the third number");
                    int c = sc.nextInt();
                    if (a > b && a > c) {
                        System.out.println(a + "is largesr");
                    } else if (b > c) {
                        System.out.println(b + "is largest");

                    } else {
                        System.out.println(c + "is largset");
                    }
                    break;
                case 2:
                    System.out.println("Enter the first number");
                    int x = sc.nextInt();
                    System.out.println("Enter the second number");
                    int y = sc.nextInt();
                    System.out.println("Enter the third number");
                    int z = sc.nextInt();
                    if (x < y && x < z) {
                        System.out.println(x + "is smallest");
                    } else if (y < z) {
                        System.out.println(y + "is smallest ");

                    } else {
                        System.out.println(z + "is smallest");
                    }
                    break;

                case 3:
                    System.out.println("enter the number for checking prime or not");
                    int num = sc.nextInt();
                    boolean flag = false;
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println(num + "is a prime number");
                    } else {
                        System.out.println(num + "is not a prime number");
                    }
                    break;
                case 4:
                    System.out.println("Enter a number");
                    int n = sc.nextInt();
                    if (n%2==0)
                    {
                        System.out.println(n+"is even");
                    }
                    else
                    {
                        System.out.println(n+"is odd4");
                    }
                    break;
                case 5:
                    System.out.println("Enter the number");
                    int r = sc.nextInt();
                    int rev = 0;
                    while (r!=0)
                    {
                        int rem=r%10;
                        rev=rev*10+rem;
                        r=r/10;
                    }
                    System.out.println("The reverse of given number is:"+rev);
                    break;

                case 6:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;



            }

            System.out.println("do you want to continue ?1.yes 2.no");
            ex=sc.nextInt();
        }while (ex==1);

    }
}
