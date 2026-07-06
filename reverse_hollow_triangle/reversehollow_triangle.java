import java.util.Scanner;

public class reversehollow_triangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    //outer loop for rows
    for(int i=1;i <= n;i++){
        //Print spaces
        for(int j=1;j <= i-1;j++){
            System.out.print(" ");
        }
            //Print stars and hallow spaces
            for(int j=1;j <= 2*(n-i+1)-1;j++){
                if(i == 1 || j == 1 || j == 2*(n-i+1)-1){
                    System.out.print("*");
                }
                    else {
                        System.out.print("");
                    }
                }
                System.out.println();
            }
        }
    }
