package PiggyBank;

public class Dime extends AbstractCurrency 
{
  public Dime() 
  {
    super(0.10, 1, "Dime");
  }

  public Dime(int inventory) 
  {
    setInventory(inventory);
    setDenomination(0.10);
    if (inventory > 1)
      setName("Dimes");
  }
}