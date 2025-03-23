class Station {
	
	
	public static void send(String item) {
		
		
		System.out.println("The item "+ item + " is send via Courier to delivery guy");
		DeliveryGuy.accept(item);
		
	}
	
	
}