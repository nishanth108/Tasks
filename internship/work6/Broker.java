class Broker
{
	public static void brokerage(String vegetable,int quantity)
	{
		System.out.println("Broker bought "+quantity+" kgs of "+vegetable+".");
		 Farmer.farm(vegetable,quantity);
	}
}