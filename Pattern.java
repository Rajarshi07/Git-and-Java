import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=in.nextInt();
        in.close();
        for(int i=0;i<n;i++) {
            for(int k=0;k<i;k++)
                System.out.print(" ");
            for(int j=0;j<n-i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}