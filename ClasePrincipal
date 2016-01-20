package cajero.automatico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Charlie CÃ¡rdenas
 */
public class ejecutor2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int retirar = 0, op = 0;
        boolean error = false;
        //instanciamos la clase cuenta
        Cuenta objCuenta = new Cuenta();
        
        System.out.println("==================================");
        System.out.println("\tBienvenido");
        System.out.println("==================================");
        System.out.print("Ingresa tu tarjeta: ");
        String direccion = sc.next();
        System.out.println("==================================");
        error = false;
        //vcalida si la tarjeta ingresada existe, si existe sigue ejecuntando, si no existe sale del programa
        try {
            leerTarjeta(direccion);
            if (leerTarjeta(direccion)) {
                System.out.println("\tValidando Tarjeta...");
                System.out.println("==================================");
            }
        } catch (Exception e) {
            System.err.println("Tarjeta invalida o Bloqueada! Consulte con el Administrador");
            System.exit(0);
        }

//ingreso de la contrasseña 
        System.out.print("Ingrese su contraseña: ");
        String password = sc.next();
        System.out.println("==================================");
        System.out.println("||\tValidando datos...      ||");
        System.out.println("==================================");
//valida si la contraseña ingresada es igual a la contraseña que esta dentro del archivo txt
//si la contraseña es correcta presentera el menu
// si no es correcta saldra del programa
        if (password.equals(validarTarjeta(direccion))) {
            //presentar valores iniciales
            System.out.println("Bienvenido Sr(a): " + verNombreUsuario(direccion));
            System.out.println("Nro Cuenta: " + verNroCuenta(direccion));
            System.out.println("==================================");
            System.out.println("\tMenu de Opciones");
            System.out.println("1. Retirar");
            System.out.println("2. Consulta");
            System.out.println("3. Cambio de Clave");
            System.out.println("==================================");
            op = sc.nextInt();
            System.out.println("==================================");
            switch (op) {
                case 1:
                    do {
                        error = false;
                        System.out.println("||   5                        100||");
                        System.out.println("||   10                       200||");
                        System.out.println("||   30             Otro Valor(8)||");
                        System.out.println("==================================");
                        retirar = sc.nextInt();
                        try {

                            switch (retirar) {
                                case 5:
                                    versaldo(direccion, retirar);
                                    break;
                                case 10:
                                    versaldo(direccion, retirar);
                                    break;
                                case 30:
                                    versaldo(direccion, retirar);
                                    break;
                                case 100:
                                    versaldo(direccion, retirar);
                                    break;
                                case 200:
                                    versaldo(direccion, retirar);
                                    break;
                                case 8:
                                    System.out.println("Ingrese otro valor. (multiplos de 5)");
                                    System.out.println("====================================");
                                    retirar = sc.nextInt();
                                    if (retirar > 5 && retirar < 500) {
                                        versaldo(direccion, retirar);
                                    } else {
                                        
                                        System.err.println("No se puede retirar esa cantidad. Porfavor Vuelva ha ingresar la tarjeta");
                                        System.exit(0);
                                    }
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("==================================");
                            System.out.println("Ingrese solo numeros");
                            System.out.println("==================================");
                            error = true;
                        }
                    } while (error);
                    break;
                case 2:
                    consulta(direccion);

                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.print("Ingrese su contraseña ");
                    String contra = sc.next();
                    System.out.println("==================================");
                    if (contra.equals(validarTarjeta(direccion))) {
                        System.out.println("==================================");
                        System.out.print("Ingrese su nueva contraseña");
                        String nuevaContra = sc.next();
                        System.out.println("==================================");
                        cambioClave(direccion, nuevaContra);
                        System.out.println("Contraseña cambiada con exito");
                    }
                    break;

            }
        } else {
            System.out.println("==================================");
            System.err.println("Contraseña Incorrecta");
            System.exit(0);
        }

    }

    private static boolean leerTarjeta(String direccion) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        boolean estado = false;
        //verifica los métodos del bf y busca uno para decir que el archivo es válido o no.
        //si es válido es true, es decir no hay problema
        //si es inválido es false, la tarjeta no sirve
       
        String lineaPrueba = bf.readLine();
        if (lineaPrueba != null || lineaPrueba != "") { //
            estado = true;
        }
        bf.close();
        return estado;
    }

    private static String validarTarjeta(String direccion) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String usuario = bf.readLine();
        String cuenta = bf.readLine();
        String pass = bf.readLine();
        double saldo = Double.parseDouble(bf.readLine());
        bf.close();
        return pass;
    }

    private static String verNombreUsuario(String direccion) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String usuario = bf.readLine();
        String cuenta = bf.readLine();
        double saldo = Double.parseDouble(bf.readLine());
        bf.close();
        return usuario;
    }

    private static String verNroCuenta(String direccion) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String usuario = bf.readLine();
        String cuenta = bf.readLine();
        String pass = bf.readLine();
        double saldo = Double.parseDouble(bf.readLine());
        bf.close();
        return cuenta;
    }

    private static double versaldo(String direccion, double cantidad) throws FileNotFoundException, IOException {

        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        //escribir el archivo
        FileWriter fichero = null;
        PrintWriter pw = null;

        Cuenta objCuenta = new Cuenta();
        String usuario = bf.readLine();
        objCuenta.nombre = usuario;
        String cuenta = bf.readLine();
        objCuenta.nroCuenta = cuenta;
        String pass = bf.readLine();
        objCuenta.password = pass;
        double saldo = Double.parseDouble(bf.readLine());
        objCuenta.setSaldo(saldo);
        objCuenta.Retiro(cantidad);
        double saldoNuevo = objCuenta.getSaldo();
        bf.close();
        fichero = new FileWriter(direccion);
        pw = new PrintWriter(fichero);
        pw.println(usuario);
        pw.println(cuenta);
        pw.println(pass);
        pw.println(saldoNuevo);

        fichero.close();

        return saldo;
    }

    private static String consulta(String direccion) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String usuario = bf.readLine();
        System.out.println("==================================");
        System.out.println("Sr(a): " + usuario);
        String cuenta = bf.readLine();
        System.out.println("Nro Cuenta " + cuenta);
        String pass = bf.readLine();
        double saldo = Double.parseDouble(bf.readLine());
        System.out.println("Su saldo es: " + saldo);
        System.out.println("==================================");
        bf.close();
        return direccion;
    }

    private static String cambioClave(String direccion, String password) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        //escribir el archivo
        FileWriter fichero = null;
        PrintWriter pw = null;

        Cuenta objCuenta = new Cuenta();
        String usuario = bf.readLine();
        objCuenta.nombre = usuario;
        String cuenta = bf.readLine();
        objCuenta.nroCuenta = cuenta;
        String pass = bf.readLine();
        objCuenta.password = pass;
        objCuenta.password = password;
        double saldo = Double.parseDouble(bf.readLine());
        objCuenta.saldo = saldo;
        bf.close();
        fichero = new FileWriter(direccion);
        pw = new PrintWriter(fichero);
        pw.println(usuario);
        pw.println(cuenta);
        pw.println(password);
        pw.println(saldo);

        fichero.close();

        return pass;
    }

}
