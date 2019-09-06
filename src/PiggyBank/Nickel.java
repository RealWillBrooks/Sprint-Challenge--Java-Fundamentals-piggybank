package PiggyBank;

public class Nickel extends AbstractCurrency 
{
  public Nickel() 
  {
    super(0.05, 1, "Nickel");
  }

  public Nickel(int inventory) 
  {
    setInventory(inventory);
    setDenomination(0.05);
    if (inventory > 1)
      setName("Nickels");
  }
}