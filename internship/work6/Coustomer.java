class Coustomer
{
	public static void buy(String vegetable,int quantity)
	{
		System.out.println("Customer wanted "+quantity+" kgs of "+vegetable+".");
		Shop.sell(vegetable,quantity);
	}
}