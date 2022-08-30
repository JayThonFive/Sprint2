public class empleado {

    empresa idEmpresa = new empresa();

    public String nombreEmpleado;
    public String correoEmpleado;
    public String rolEmpleado;

    public empleado(empresa idEmpresa, String nombreEmpleado, String correoEpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public empleado() {

        idEmpresa.getNombreEmpresa();

    }

    public empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEpleado() {
        return correoEmpleado;
    }

    public void setCorreoEpleado(String correoEpleado) {
        this.correoEmpleado = correoEpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
