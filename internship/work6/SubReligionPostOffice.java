class SubRegionalPostOffice
{
	public static void deliver(String customername,String address)
	{
		System.out.println("Wait a sec,Lets call Regional Post office about your Letter!");
		RegionalPostOffice.deliver(customername,address);
	}
}