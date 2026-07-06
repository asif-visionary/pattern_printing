import java.util.Scanner;

public class mirror_image_pattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    for(int i=1;i <= n;i++){
        //Print spaces
        for(int j=1;j <= i-1;j++){
            System.out.print(" ");
        }
        //Print numbers
        for(int j=i;j <= n;j++){
            System.out.print(j +" ");
        }
        System.out.println();
    }
    for(int i=1;i<n; i++){
        //Print space
        for(int j=1;j <= n-i-1;j++){
            System.out.print(" ");
        }
        //Print numbers
        for(int j=n-i;j <= n; j++){
            System.out.print(j +" ");
        }
    System.out.println();
}
}
}