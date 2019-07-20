public class ComputadorFacade {
    private Cpu cpu = null;
    private Memoria memoria = null;
    private HardDrive hardDrive = null;
 
    public ComputadorFacade(Cpu cpu,Memoria memoria,HardDrive hardDrive) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.hardDrive = hardDrive;
    }
 
    public void ligarComputador() {
        cpu.start();
        hardDrive.read();
        memoria.load();
        cpu.execute();
        memoria.free();
    }
}