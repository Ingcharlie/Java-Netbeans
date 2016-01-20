package cajero.automatico;

public class Cuenta extends Transacciones { // Creacion de una clase "Cuenta" que hereda de Operaciones

    private int ultMovimiento = 0;
//Atributo de tipo privado usado para la contraseña de la cuenta 

    public Cuenta(String nombre, double saldo, String nroCuenta, String password) {
        super(nombre, saldo, nroCuenta, password);
    }

    Cuenta() {

    }

//Constructor de la clase cuenta que inicializa primero al de la clase padre
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setnroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getnroCuenta() {

        return nroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public void setPassoword(String password) {
        this.password = password;
    }

    public String getPassword() {

        return password;
    }

//propiedades de lectura que usaremos en la principal
    @Override
    public boolean Retiro(double cantidad) {
        double total = cantidad + 0.35;
        if (super.saldo >= total) {
            super.saldo = super.saldo - total;
            System.out.println("Su saldo nuevo es: " + super.saldo);
            System.out.println("==================================");
            return true;
        } else {
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }//Fin de metodo Retiro

    @Override
    public void Consulta(String direccion) {
        System.out.println("==================================");
        System.out.println("Sr(a): " + super.nombre);
        System.out.println("Su saldo es: " + super.saldo);
        System.out.println("Nro Cuenta: " + super.nroCuenta);
        System.out.println("==================================");

    }//Fin del metodo Consulta

    @Override
    public boolean CambioClave(double pass) {
        double contrasena = pass;

        return true;
    }
}//Fin de metodo Retir
