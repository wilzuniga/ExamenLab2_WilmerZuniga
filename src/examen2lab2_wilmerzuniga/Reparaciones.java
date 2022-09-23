
package examen2lab2_wilmerzuniga;

public class Reparaciones {
    private Empleados empleado;
    private Carros carros;
    private String Exito;

    public Reparaciones() {
    }

    public Reparaciones(Empleados empleado, Carros carros, String Exito) {
        this.empleado = empleado;
        this.carros = carros;
        this.Exito = Exito;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public Carros getCarros() {
        return carros;
    }

    public void setCarros(Carros carros) {
        this.carros = carros;
    }

    public String getExito() {
        return Exito;
    }

    public void setExito(String Exito) {
        this.Exito = Exito;
    }

    @Override
    public String toString() {
        return "Reparaciones{" + "empleado=" + empleado + ", carros=" + carros + ", Exito=" + Exito + '}';
    }
    
    
}
