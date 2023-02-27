public class GraphicsCard {
    private int memorySize;

    public GraphicsCard(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void displayImage(String image) {
        System.out.println("Displaying " + image + " on screen");
    }

    public void turnOff() {
        System.out.println("Turning off graphics card");
    }
}