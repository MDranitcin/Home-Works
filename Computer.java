public class Computer {
    private CPU cpu;
    private RAM ram;
    private GraphicsCard graphicsCard;

    public Computer(CPU cpu, RAM ram, GraphicsCard graphicsCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void boot() {
        cpu.processInstruction("boot from disk");
        ram.loadOS("Windows 10");
        graphicsCard.displayImage("Windows 10 boot screen");
    }

    public void shutdown() {
        cpu.processInstruction("shutdown");
        ram.clear();
        graphicsCard.turnOff();
    }
}