package examen2lab2_wilmerzuniga;

import java.util.ArrayList;

public class Empleados {
    //Atributos

    private int Edad;
    private String Nombre;
    private String Id;
    private int carros = 0;

    //Constructores
    public Empleados() {

    }

    public Empleados(int Edad, String Nombre, String Id) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Id = Id;
        
    }

    //Mutadores

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getCarros() {
        return carros;
    }

    public void setCarros(int carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Empleados{" + "Edad=" + Edad + ", Nombre=" + Nombre + ", Id=" + Id + ", carros=" + carros + '}';
    }

    

}
