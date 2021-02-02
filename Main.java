import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Enter any whole number to count up or down from: ");
    num = s.nextInt();
    System.out.println("I like that number choice! : ");
    int n = num;
    while(num > 0)
    {
      System.out.println(num);
      num--;
    }
    int i = num;
    while(num <= 0)
      {
        System.out.println(num);
        num++;
      }
    System.out.println("BLAST OFF!!!");
    
  }
}