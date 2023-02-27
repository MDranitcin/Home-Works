public class RAM {
    private int capacity;

    public RAM(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void loadOS(String os) {
        System.out.println("Loading " + os + " into RAM");
    }

    public void clear() {
        System.out.println("Clearing RAM");
    }
}