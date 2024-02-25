import java.util.Scanner;

public class PatternEasy1 {

    public static void main(String[] args) {

        //Pattern Easy1

        Scanner sc = new Scanner(System.in);
        int num,i,j;

        System.out.print("Enter a number to see its pattern: ");
        num = sc.nextInt();

        for (i=1;i<=num;i++){
            for (j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
