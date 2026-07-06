import java.util.*;
public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i <= n;i++){
            //print left stars
            for(int j=1;j <= i;j++){
            System.out.print("*");
           }
           //Print spaces
           for(int j=1;j <= (n-i)*2;j++){
                    System.out.print(" ");
                }
                //Print right stars
                for(int j=1;j <= i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i <= n;i++){
                //print left stars
                for(int j=1;j <= n-i+1;j++){
                        System.out.print("*");
                    }
                    //Print spaces
                    for(int j=1;j <= 2*i-2;j++){
                        System.out.print(" ");
                    }
                    //Print right stars
                    for(int j=1;j <= n-i+1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
            }
    }
}
