package demoPOO.models;

public class EstadoTelefono {

    private int bateria;      // porcentaje 0-100
    private int cpu;          // porcentaje 0-100
    private int memoria;      // porcentaje 0-100
    private Telefono telefono;

    // Constructor
    public EstadoTelefono(Telefono telefono, int bateria, int cpu, int memoria) {
        this.telefono = telefono;
        this.bateria = bateria;
        this.cpu = cpu;
        this.memoria = memoria;
    }

    // Getters y setters
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    // Métodos de verificación simulada
    public void verificarBateria() {
        System.out.println("🔋 Batería actual: " + bateria + "%");
    }

    public void verificarCPU() {
        System.out.println("⚙️ Uso del procesador: " + cpu + "%");
    }

    public void verificarMemoria() {
        System.out.println("💾 Uso de memoria: " + memoria + "%");
    }

    // Informe completo
    public void mostrarInforme() {
        System.out.println("\n 📱 Informe de estado del teléfono " + telefono.getMarca() + " " + telefono.getModelo());
        verificarBateria();
        verificarCPU();
        verificarMemoria();
    }
}
