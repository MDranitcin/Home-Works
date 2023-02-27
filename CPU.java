public class CPU {
    private int clockSpeed;

    public CPU(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public void processInstruction(String instruction) {
        System.out.println("Processing instruction: " + instruction);
    }
}
