class TeddyBear {

    public void setBearName(String name) {
        System.out.println("Teddy Bear name: " + name);
    }

    public void setBearSize(String size) {
        System.out.println("Teddy Bear size: " + size);
    }

    public void setBearColor(String color) {
        System.out.println("Teddy Bear color: " + color);
    }

    public void hugBear(String person, int duration) {
        System.out.println(person + " hugged the bear for " + duration + " seconds");
    }

    public void giftBear(String giver, String receiver) {
        System.out.println(giver + " gifted the teddy bear to " + receiver);
    }

    public void createBear(String name, String size, String color) {
        System.out.println("Teddy Bear created - Name: " + name + ", Size: " + size + ", Color: " + color);
    }

    public void customizeBear(String name, String accessory, String message) {
        System.out.println("Customized Bear - Name: " + name + ", Accessory: " + accessory + ", Message: " + message);
    }
}
