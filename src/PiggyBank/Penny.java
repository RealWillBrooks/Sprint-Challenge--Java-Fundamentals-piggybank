package PiggyBank;

public class Penny extends AbstractCurrency 
{
  public Penny()
  {
    super(0.01, 1, "Penny");
  }

  public Penny(int inventory) 
  {
    setInventory(inventory);
    setDenomination(0.01);
    if (inventory > 1)
      setName("Pennies");
  }
}