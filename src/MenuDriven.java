import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int ex;
        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1.Largest of 3. 2.Smallest of 3 3.Prime or not 4.Even or not 5.Reverse 6.Exit");
            int operation=sc.nextInt();


            switch (operation)
            {
                case 1:
                    System.out.println("Enter the first number");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number");
                    int b = sc.nextInt();
                    System.out.println("Enter the third number");
                    int c = sc.nextInt();
                    if(a>b&&a>c){
                        System.out.println(a+"is largesr");
                    } else if (b>c)
                    {
                        System.out.println(b+"is largest");

                    }
                    else {
                        System.out.println(c+"is largset");
                    }
                    break;


            }





            System.out.println("do you want to continue ?1.yes 2.no");
            ex=sc.nextInt();




        }while (ex==1);

    }
}
