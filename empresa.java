public class empresa {

    empresa empre1 = new empresa();

    public String nombreEmpresa;
    public String direccionEmpresa;
    public int telefonoEmpresa;
    public String nitEmpresa;

    public empresa(empresa empre1, String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, String nitEmpresa) {
        this.empre1 = empre1;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public empresa() {

    }

    public empresa getEmpre1() {
        return empre1;
    }

    public void setEmpre1(empresa empre1) {
        this.empre1 = empre1;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
}
