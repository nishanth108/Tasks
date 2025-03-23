class Price {
	
	public static double getPrice(String foodItem) {
		
		if(foodItem == "Rice" ) {
			
			return 50;
			
		} 
		
		else if (foodItem == "chapati") {
			return 30;
		}
		
		else if (foodItem == "ladoo") {
			return 60.50;
		}
		
		else if (foodItem == "Biriyani") {
			return 150;
		}
		else if (foodItem == "IceCream") {
			return 150;
		}
		else if (foodItem == "Porota") {
			return 56;
		}
		else if (foodItem == "AvilMilk") {
			return 40;
		}
		else if (foodItem == "Pizza") {
			return 235;
		}
		else if (foodItem == "Burger") {
			return 255;
		} 
		else if (foodItem == "cola") {
			return 85;
		}
		else if (foodItem == "Prasad") {
			return 50;
		}

		return 0;
	}



}