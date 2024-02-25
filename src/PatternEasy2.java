import java.util.Scanner;

public class PatternEasy2 {

    public static void main(String[] args) {

        //Pattern Easy2

        Scanner sc = new Scanner(System.in);
        int num,i,j;

        System.out.print("Enter a number to see its pattern: ");
        num = sc.nextInt();

        for (i=num;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Print star pattern

        System.out.print("\nEnter a number to see its star pattern: ");
        num = sc.nextInt();

        for (i=num;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Print character pattern
        char k,l;
        System.out.print("\nEnter a Character to see its character pattern: ");
        char ch = sc.next().charAt(0);

        for (k='A';k<=ch;k++){
            for (l='A';l<=k;l++){
                System.out.print(" "+l);
            }
            System.out.println();
        }

        //Print same digits pattern
        System.out.print("\nEnter a number to see its common pattern: ");
        num = sc.nextInt();

        for (i=1;i<=num;i++){
            for (j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
