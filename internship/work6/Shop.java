class Shop
{
	public static void sell(String vegetable,int quantity)
	{
		System.out.println("Shop bought "+quantity+" kgs of "+vegetable+".");
		Agent.purchase(vegetable,quantity);
	}
}