import java.util.Scanner;
public class Nfactorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n=sc.nextInt();
    long fact=1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
fact*=j;
        }
        System.out.println("The factorial of "+i+" is : "+fact);
        fact=1;
    }
  }  
}