class FoodItem {
	
	public  void setFoodName(String foodName ) {
		
		
		System.out.println("Selected Food Name:"+foodName);
		
		
	}
	
	
	public void UpdatePrice(String price) {
		
		
		System.out.println("Updated Price is: "+Price);
		
		
	}
	public void setCategory(String category) {
		
		System.out.println("The Food is ",category);
		
	}
	
	public void setNutritionalInfo(int calories, double fat) {
		
		
		System.out.println("Number of calories is ",calories,"and food fat is :"+number);
		
		
	}
	
	public void updateStock(int itemId, int quantity) {
		
		System.out.println("Food :",itemId,"quantity: ",quantity);
		
	}
	
	public void addFoodItem(String name, double price, String category) {
		
		System.out.println("Food name:",name,"price: ",price,"category:",category);
		
	}
	
	public void updateFoodDetails(String itemId, String name, double price){
		
		System.out.println(itemId,name,price)
		
	}
	
	
	
}