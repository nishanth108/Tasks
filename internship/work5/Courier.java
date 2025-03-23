class Courier {
	
	
		public static void pickup(String item) {
			
			System.out.println("The item is Picked up through the Courier ");
			
			Station.send(item);
			
		}
	
	
}