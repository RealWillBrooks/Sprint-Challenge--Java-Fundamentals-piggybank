package PiggyBank;

public class Dollar extends AbstractCurrency 
{
  public Dollar() 
  {
    super(1.00, 1, "Dollar");
  }

  public Dollar(int inventory) 
  {
    setInventory(inventory);
    setDenomination(1.00);
    if (inventory > 1)
      setName("Dollars");
  }

  @Override
  public String toString() 
  {
    return "$" + getInventory();
  }
}