package cajero.automatico;

public abstract class Transacciones {

    protected String nombre;
    protected double saldo;
    protected String nroCuenta;
    protected String password;
//Atributos a utilizar

    public Transacciones(String nombre, double saldo, String nroCuenta, String password) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.nroCuenta = nroCuenta;
        this.password = password;
    }

    public Transacciones() {
        this.nombre = null;
        this.saldo = 0;
        this.nroCuenta = null;
        this.password = null;
    }

    public Transacciones(String nombre) {
        this.nombre = nombre;
        this.saldo = 500.99;
    }
//Sobrecarga de constructores solo el primero vamos a utilizar los demás solo.
//se han creado para demostrar el principio de sobrecarga.

    public abstract boolean Retiro(double Cantidad);
    

    public abstract boolean CambioClave(double Cantidad);

    public abstract void Consulta(String direccion);
    
   
//Métodos abstractos
}
