package demoPOO.models;

public class ConexionInternet {

    private String proveedorInternet;
    private boolean redDisponible;
    private boolean saldoDisponible;
    private Telefono telefono;

    // Constructor
    public ConexionInternet(String proveedorInternet, boolean redDisponible, boolean saldoDisponible) {
        this.proveedorInternet = proveedorInternet;
        this.redDisponible = redDisponible;
        this.saldoDisponible = saldoDisponible;
    }

    // Getter y Setter para Telefono
    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    // Funcionalidad principal
    public void establecerConexionInternet() {
        System.out.println("Intentando conectar al proveedor de Internet: " + this.proveedorInternet);

        if (!redDisponible) {
            System.out.println("❌ No hay red disponible ❌");
            System.out.println("-----------------------------------------------------------------------");
            return;
        }

        if (telefono == null) {
            System.out.println("❌ No se ha asignado un teléfono para la conexión ❌");
            System.out.println("-----------------------------------------------------------------------");
            return;
        }

        if (!saldoDisponible) {
            System.out.println("❌ El número " + telefono.getNumero() + " no tiene saldo suficiente ❌");
            System.out.println("-----------------------------------------------------------------------");
            return;
        }

        System.out.println("✔️ Conexión a Internet establecida con éxito desde el número " + telefono.getNumero());
        System.out.println("-----------------------------------------------------------------------");
    }
}
