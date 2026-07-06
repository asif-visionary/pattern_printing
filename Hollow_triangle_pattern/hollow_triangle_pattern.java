import java.util.Scanner;

public class hollow_triangle_pattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    for(int i=1;i <= n;i++){
        //Print spaces
        for(int j=1;j <= n-i;j++){
            System.out.print(" ");
        }
        //Printing stars and hallow spaces
        for(int j=1;j <= 2*i-1;j++){
            if(i == n || j == 1 || j == 2*i-1){
                System.out.print("*");
            }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}