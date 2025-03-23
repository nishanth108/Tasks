class Whiteboard {

    public void setBoardSize(String size) {
        System.out.println("Whiteboard size: " + size);
    }

    public void setBoardMaterial(String material) {
        System.out.println("Whiteboard material: " + material);
    }

    public void setBoardColor(String color) {
        System.out.println("Whiteboard color: " + color);
    }

    public void writeOnBoard(String content, String markerColor) {
        System.out.println("Content written: " + content + ", using marker color: " + markerColor);
    }

    public void eraseBoard(String eraserType, int duration) {
        System.out.println("Erased with: " + eraserType + ", duration: " + duration + " seconds");
    }

    public void createBoard(String size, String material, String color) {
        System.out.println("Board created - Size: " + size + ", Material: " + material + ", Color: " + color);
    }

    public void displayBoardDetails(String size, String material, String color) {
        System.out.println("Board Details - Size: " + size + ", Material: " + material + ", Color: " + color);
    }
}
