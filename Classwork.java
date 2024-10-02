import java.util.Scanner; //Always have to import Scanner then initialize scanner
public class Classwork
{
  public static void main(String[] args)
  {
    //Shopping
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String itemBuying = sc.nextLine(); 
    System.out.println("How many are you buying?");
    int amountBought = sc.nextInt();
    System.out.println("How much does each one weigh?");
    double weightofProduct = sc.nextDouble();
    System.out.println(amountBought + itemBuying + " at " + weightofProduct + " pounds each will weigh " + (weightofProduct * amountBought) + " pounds total");
    //Quote
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
    //Rabbit
    System.out.println("(\\(\\\n(  - -)\n((') (')");
  }
}
