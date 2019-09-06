package PiggyBank;

import java.util.*;
import java.text.DecimalFormat;

public class Main 
{
  public static void main(String[] args) 
  {

    DecimalFormat fp = new DecimalFormat("$###,###.00");
    double sum = 0;

    ArrayList<AbstractCurrency> myBank = new ArrayList<>();

    myBank.add(new Quarter());
    myBank.add(new Dime());
    myBank.add(new Dollar(5));
    myBank.add(new Nickel(3));
    myBank.add(new Dime(7));
    myBank.add(new Dollar());
    myBank.add(new Penny(10));

    // Count container elements
    for (int i = 0; i < myBank.size(); i++)
      System.out.println(myBank.get(i).toString());

   // Sum of elements
    for (int i = 0; i < myBank.size(); i++)
      sum += myBank.get(i).getSum();

    System.out.println();

  
    System.out.println("The piggy bank holds " + fp.format(sum));
  }
}
