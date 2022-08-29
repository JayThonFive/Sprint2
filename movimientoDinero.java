

public class movimientoDinero extends empleado {

    movimientoDinero movDine1 = new movimientoDinero();

    public int movimiento;
    public int montoPositivo;
    public double montoNegativo;
    public String descripcionMovimiento;

    public empleado nombreempleado;

    public movimientoDinero(movimientoDinero movDine1, int movimiento, int montoPositivo, double montoNegativo, String descripcionMovimiento, String ususario) {
        this.movDine1 = movDine1;
        this.movimiento = movimiento;
        this.montoPositivo = montoPositivo;
        this.montoNegativo = montoNegativo;
        this.descripcionMovimiento = descripcionMovimiento;

    }

    public movimientoDinero() {

    }

    public movimientoDinero getMovDine1() {
        return movDine1;
    }

    public void setMovDine1(movimientoDinero movDine1) {
        this.movDine1 = movDine1;
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

    public double getMontoNegativo() {
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
