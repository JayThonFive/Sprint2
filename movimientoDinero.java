

public class movimientoDinero {

    empleado idEmpleado = new empleado();


    public int movimiento;
    public int montoPositivo;
    public int montoNegativo;
    public String descripcionMovimiento;


    public movimientoDinero(int movimiento, int montoPositivo, int montoNegativo, String descripcionMovimiento) {
        this.movimiento = movimiento;
        this.montoPositivo = montoPositivo;
        this.montoNegativo = montoNegativo;
        this.descripcionMovimiento = descripcionMovimiento;

    }

    public movimientoDinero (){

        idEmpleado.getNombreEmpleado();
    }

    public empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getMontoPositivo() {
        return montoPositivo;
    }

    public void setMontoPositivo(int montoPositivo) {
        this.montoPositivo = montoPositivo;
    }

    public int getMontoNegativo() {
        return montoNegativo;
    }

    public void setMontoNegativo(int montoNegativo) {
        this.montoNegativo = montoNegativo;
    }

    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
    }

}
