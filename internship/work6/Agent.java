class Agent
{
	public static void purchase(String vegetable,int quantity)
	{
		System.out.println("Agent bought "+quantity+" kgs of "+vegetable+".");
		Broker.brokerage(vegetable,quantity);
	}
}