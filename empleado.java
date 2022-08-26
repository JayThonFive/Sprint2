public class empleado {

    empleado emple1 = new empleado();

    public String nombreEmplaedo;
    public String correoEpleado;
    public String empresaEmpleado;
    public String rolEmpleado;

    public empleado(empleado emple1, String nombreEmplaedo, String correoEpleado, String empresaEmpleado, String rolEmpleado) {
        this.emple1 = emple1;
        this.nombreEmplaedo = nombreEmplaedo;
        this.correoEpleado = correoEpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public empleado() {

    }

    public empleado getEmple1() {
        return emple1;
    }

    public void setEmple1(empleado emple1) {
        this.emple1 = emple1;
    }

    public String getNombreEmplaedo() {
        return nombreEmplaedo;
    }

    public void setNombreEmplaedo(String nombreEmplaedo) {
        this.nombreEmplaedo = nombreEmplaedo;
    }

    public String getCorreoEpleado() {
        return correoEpleado;
    }

    public void setCorreoEpleado(String correoEpleado) {
        this.correoEpleado = correoEpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
