package examen2lab2_wilmerzuniga;

public class Carros {

    private int AñoFab;
    private String Marca;
    private String Modelo;
    private int Saldo;
    private String Estado;

    //Constructores

    public Carros() {
    }

    public Carros(int AñoFab, String Marca, String Modelo, int Saldo, String Estado) {
        this.AñoFab = AñoFab;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Saldo = Saldo;
        this.Estado = Estado;
    }

    public int getAñoFab() {
        return AñoFab;
    }

    public void setAñoFab(int AñoFab) {
        this.AñoFab = AñoFab;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Carros{" + "A\u00f1oFab=" + AñoFab + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Saldo=" + Saldo + ", Estado=" + Estado + '}';
    }


}
