class Beer {

    public void setBeerName(String name) {
        System.out.println("Beer name: " + name);
    }

    public void setBeerType(String type) {
        System.out.println("Beer type: " + type);
    }

    public void setAlcoholPercentage(double percentage) {
        System.out.println("Alcohol percentage: " + percentage);
    }

    public void rateBeer(String user, int rating) {
        System.out.println("User: " + user + " rated the beer: " + rating);
    }

    public void orderBeer(String customerName, String beerName, int quantity) {
        System.out.println("Customer: " + customerName + " ordered " + quantity + " of " + beerName);
    }

    public void addBeer(String name, double price, String brewery) {
        System.out.println("Beer added - Name: " + name + ", Price: " + price + ", Brewery: " + brewery);
    }

    public void brewBeer(String name, String type, double alcoholPercentage) {
        System.out.println("Brewing beer - Name: " + name + ", Type: " + type + ", Alcohol Percentage: " + alcoholPercentage);
    }
}
