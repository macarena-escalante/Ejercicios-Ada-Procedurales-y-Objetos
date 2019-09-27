package ar.com.ada.billeteravirtual;

import java.util.*;

import org.hibernate.exception.ConstraintViolationException;

import ar.com.ada.billeteravirtual.excepciones.PersonaEdadException;
import ar.com.ada.billeteravirtual.security.Crypto;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static PersonaManager ABMPersona = new PersonaManager();
    public static UsuarioManager ABMUsuario = new UsuarioManager();
    public static BilleteraManager ABMBilletera = new BilleteraManager();
    public static CuentaManager ABMCuenta = new CuentaManager();
    public static MovimientoManager ABMovimiento = new MovimientoManager();

    public static void main(String[] args) throws Exception {
        ABMPersona.setup();
        ABMUsuario.setup();
        ABMBilletera.setup();
        ABMCuenta.setup();
        ABMovimiento.setup();

        printOpciones();

        int opcion = Teclado.nextInt();
        Teclado.nextLine();

        while (opcion > 0) {

            switch (opcion) {
            case 1:
                alta();
                break;

            case 2:
                baja();
                break;

            case 3:
                modifica();
                break;

            case 4:
                listar();
                break;

            case 5:
                listarPorNombre();
                break;

            default:
                System.out.println("La opcion no es correcta.");
                break;
            }

            printOpciones();

            opcion = Teclado.nextInt();
            Teclado.nextLine();
        }

        // Hago un safe exit del manager
        ABMPersona.exit();
        ABMUsuario.exit();
        ABMBilletera.exit();
        ABMCuenta.exit();
        ABMovimiento.exit();

    }

    public static void alta() throws Exception {
        Persona p = new Persona();
        System.out.println("Ingrese el nombre:");
        p.setNombre(Teclado.nextLine());
        System.out.println("Ingrese el DNI:");
        p.setDni(Teclado.nextLine());
        System.out.println("Ingrese la edad:");
        p.setEdad(Teclado.nextInt());
        Teclado.nextLine();
        System.out.println("Ingrese el Email:");
        p.setEmail(Teclado.nextLine());

        Usuario u = new Usuario();
        u.setUserName(p.getEmail());
        System.out.println("Su nombre de usuario es " + u.getUserName());
        System.out.println("Ingrese su password:");

        // La password ingresa en texto claro a la variable y luego se encripta
        String passwordEnTextoClaro;
        String passwordEncriptada;
        String passwordEnTextoClaroDesencriptado;

        passwordEnTextoClaro = Teclado.nextLine();

        passwordEncriptada = Crypto.encrypt(passwordEnTextoClaro, "shakalaka!!!");

        passwordEnTextoClaroDesencriptado = Crypto.decrypt(passwordEncriptada, "shakalaka!!!");

        System.out.println("Tu password encriptada es :" + passwordEncriptada);

        System.out.println("Tu password desencriptada es :" + passwordEnTextoClaroDesencriptado);

        if (passwordEnTextoClaro.equals(passwordEnTextoClaroDesencriptado)) {
            System.out.println("Ambas passwords coinciden");
        } else {
            System.out.println("Las passwords no coinciden, nunca debio entrar aqui");
        }

        u.setPassword(passwordEncriptada);

        /*
         * System.out.println("Su mail es:"); u.setUserEmail(p.getEmail());
         */
        // System.out.println("Ingrese su email de usuario:");
        u.setUserEmail(u.getUserName());

        p.setUsuario(u);
        /// u.setPersona(p); <- esta linea hariaa falta si no lo hacemos en el
        /// p.SetUsuario(u)
        // u.setPersonaId(p.getPesonaId());
        // ABMUsuario.create(u);

        // System.out.println("Usuario generado con exito. " + u);

        Billetera b = new Billetera();
        b.setPersona(p);
        ABMPersona.create(p);

        Cuenta c = new Cuenta();
        c.setMoneda("ARS");
        b.agregarCuenta(c);

        ABMBilletera.create(b);

        Movimiento m = new Movimiento();
        m.setImporte(100);
        m.setDeUsuarioId(u.getUsuarioId());
        m.setaUsuarioId(u.getUsuarioId());
        m.setCuentaDestinoId(c.getCuentaId());
        m.setCuentaOrigenId(c.getCuentaId());
        m.setConceptoDeOperacion("Envío");
        m.setTipoDeOperacion("Cargar dinero");
        m.setEstado(0);
        m.setFechaMovimiento(new Date());
        c.agregarMovimiento(m);

        ABMBilletera.update(b);

        System.out.println("Persona generada con exito.  " + p);
        if (p.getUsuario() != null)
            System.out
                    .println("Tambien se le creo un usuario: " + p.getUsuario().getUserName() + " con una billetera.");

                    
        Billetera b2 = ABMBilletera.read(b.getBilleteraId());
        b=null;
        c=null;

        System.out.println("El saldo es: " + b2.getCuentas().get(0).getSaldo());

        /*
         * enviarDinero();{
         * System.out.println("Ingrese el email del usuario al que desea transferir:");
         * String email = Teclado.nextLine(); Usuario user2 = ABMUsuario.read(email);
         * 
         * user2.getPersona().getBilletera();
         */
        System.out.println("Desea enviar dinero a otra cuenta?");
        String rta;
        rta = Teclado.nextLine();

        if (rta.equals("si")) {

            Billetera b3 = ABMBilletera.read(15);

            Movimiento m2 = new Movimiento();
            m2.setImporte(-50);
            m2.setDeUsuarioId(u.getUsuarioId());
            m2.setaUsuarioId(37);
            m2.setCuentaOrigenId(b2.getCuentas().get(0).getCuentaId());
            m2.setCuentaDestinoId(b3.getCuentas().get(0).getCuentaId());
            m2.setConceptoDeOperacion("Envío");
            m2.setTipoDeOperacion("Enviar dinero");
            m2.setEstado(0);
            m2.setFechaMovimiento(new Date());
            b2.getCuentas().get(0).agregarMovimiento(m2);

            //b3.getCuentas()

            ABMBilletera.update(b2);

            Movimiento m3 = new Movimiento ();
            m3.setImporte(+50);
            m3.setDeUsuarioId(u.getUsuarioId());
            m3.setaUsuarioId(37);
            m3.setCuentaOrigenId(b2.getCuentas().get(0).getCuentaId());
            m3.setCuentaDestinoId(b3.getCuentas().get(0).getCuentaId());
            m3.setConceptoDeOperacion("Recibo");
            m3.setTipoDeOperacion("Recibir dinero");
            m3.setEstado(0);
            m3.setFechaMovimiento(new Date());
            b3.getCuentas().get(0).agregarMovimiento(m3);

            ABMBilletera.update(b3);
            b3= ABMBilletera.read(b3.getBilleteraId());
            System.out.println("El saldo de ID 11 es "+ b3.getCuentas().get(0).getSaldo());
        }

        System.out.println("Se enviaron $50 desde la cuenta "+ b2.getCuentas().get(0).getCuentaId()+ " a la cuenta ID 11." );

        b2= ABMBilletera.read(b2.getBilleteraId());
        System.out.println("El saldo de tu cuenta ahora es:" + b2.getCuentas().get(0).getSaldo());

        


        
        }

   

    public static void baja() {
        System.out.println("Ingrese el nombre:");
        String n = Teclado.nextLine();
        System.out.println("Ingrese el ID de Persona:");
        int id = Teclado.nextInt();
        Teclado.nextLine();
        Persona personaEncontrada = ABMPersona.read(id);

        if (personaEncontrada == null) {
            System.out.println("Persona no encontrada.");

        } else {

            try {

                ABMPersona.delete(personaEncontrada);
                System.out.println("El registro de " + personaEncontrada.getDni() + " ha sido eliminado.");

            } catch (ConstraintViolationException exPersonaConUsuario) {
                System.out.println("No se puede eliminar una persona que tenga usuario");

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Ocurrio un error al eliminar una persona.Error: " + e.getCause());
            }

        }
    }

    public static void bajaPorDNI() {
        System.out.println("Ingrese el nombre:");
        String n = Teclado.nextLine();
        System.out.println("Ingrese el DNI de Persona:");
        String dni = Teclado.nextLine();
        Persona personaEncontrada = ABMPersona.readByDNI(dni);

        if (personaEncontrada == null) {
            System.out.println("Persona no encontrada.");

        } else {
            ABMPersona.delete(personaEncontrada);
            System.out.println("El registro de " + personaEncontrada.getDni() + " ha sido eliminado.");
        }
    }

    public static void modifica() throws PersonaEdadException {
        // System.out.println("Ingrese el nombre de la persona a modificar:");
        // String n = Teclado.nextLine();

        System.out.println("Desea modificar un dato de la persona o del usuario? \n1: persona \n2: usuario");
        int seleccion = Teclado.nextInt();

        if (seleccion == 1) {

            System.out.println("Ingrese el ID de la persona a modificar:");
            int id = Teclado.nextInt();
            Teclado.nextLine();
            Persona personaEncontrada = ABMPersona.read(id);

            if (personaEncontrada != null) {

                System.out.println(personaEncontrada.toString() + "seleccionado para modificacion.");

                System.out.println(
                        "Elija qué dato de la persona desea modificar: \n1: nombre, \n2: DNI, \n3: edad, \n4: email");
                int selecper = Teclado.nextInt();

                switch (selecper) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre:");
                    Teclado.nextLine();
                    personaEncontrada.setNombre(Teclado.nextLine());

                    break;
                case 2:
                    System.out.println("Ingrese el nuevo DNI:");
                    Teclado.nextLine();
                    personaEncontrada.setDni(Teclado.nextLine());

                    break;
                case 3:
                    System.out.println("Ingrese la nueva edad:");
                    Teclado.nextLine();
                    personaEncontrada.setEdad(Teclado.nextInt());

                    break;
                case 4:
                    System.out.println("Ingrese el nuevo Email:");
                    Teclado.nextLine();
                    personaEncontrada.setEmail(Teclado.nextLine());

                    break;

                default:
                    break;
                }

                // Teclado.nextLine();

                ABMPersona.update(personaEncontrada);

                System.out.println("El registro de " + personaEncontrada.getNombre() + " ha sido modificado.");

            } else {
                System.out.println("Persona no encontrada.");
            }

        } else {

            System.out.println("Ingrese el ID del usuario que desea modificar:");
            int idu = Teclado.nextInt();
            Usuario usuarioEncontrado = ABMUsuario.read(idu);

            if (usuarioEncontrado != null) {

                System.out.println(usuarioEncontrado.toString() + "seleccionado para modificacion.");

                System.out.println("Elija qué dato del usuario desea modificar: 1: email, 2: password");
                int selecus = Teclado.nextInt();

                if (selecus == 1) {
                    System.out.println("Ingrese el nuevo Email de usuario:");
                    Teclado.nextLine();
                    usuarioEncontrado.setUserEmail(Teclado.nextLine());
                } else {
                    System.out.println("Ingrese la nueva password de usuario:");
                    Teclado.nextLine();
                    usuarioEncontrado.setPassword(Teclado.nextLine());
                }

                ABMUsuario.update(usuarioEncontrado);

                System.out.println("El registro de " + usuarioEncontrado.getUserName() + " ha sido modificado.");
            } else {
                System.out.println("Usuario no encontrado.");
            }

        }
    }

    /*
     * public static void modificaByDNI() { //
     * System.out.println("Ingrese el nombre de la persona a modificar:"); // String
     * n = Teclado.nextLine();
     * System.out.println("Ingrese el DNI de la persona a modificar:"); String dni =
     * Teclado.nextLine(); Persona personaEncontrada = ABMPersona.readByDNI(dni);
     * 
     * if (personaEncontrada != null) {
     * 
     * System.out.println(personaEncontrada.toString() +
     * "seleccionado para modificacion.");
     * System.out.println("Ingrese el nuevo nombre:");
     * personaEncontrada.setNombre(Teclado.nextLine());
     * System.out.println("Ingrese el nuevo DNI:");
     * personaEncontrada.setDni(Teclado.nextLine()); // Teclado.nextLine();
     * System.out.println("Ingrese la nueva edad:");
     * personaEncontrada.setEdad(Teclado.nextInt()); Teclado.nextLine();
     * 
     * System.out.println("Ingrese el nuevo Email:");
     * personaEncontrada.setEmail(Teclado.nextLine());
     * 
     * ABMPersona.update(personaEncontrada); System.out.println("El registro de " +
     * personaEncontrada.getDni() + " ha sido modificado.");
     * 
     * } else { System.out.println("Persona no encontrada."); }
     */

    public static void listar() {

        List<Persona> todas = ABMPersona.buscarTodas();
        for (Persona p : todas) {
            System.out.println("Id: " + p.getPesonaId() + " Nombre: " + p.getNombre());
        }
    }

    public static void listarPorNombre() {

        System.out.println("Ingrese el nombre:");
        String nombre = Teclado.nextLine();

        List<Persona> personas = ABMPersona.buscarPor(nombre);
        for (Persona p : personas) {
            System.out.println("Id: " + p.getPesonaId() + " Nombre: " + p.getNombre());
        }
    }

    public static void printOpciones() {
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("Para agregar una persona presione 1.");
        System.out.println("Para eliminar una persona presione 2.");
        System.out.println("Para modificar una persona presione 3.");
        System.out.println("Para ver el listado presione 4.");
        System.out.println("Buscar una persona por nombre especifico(SQL Injection)) 5.");
        System.out.println("Para terminar presione 0.");
        System.out.println("");
        System.out.println("=======================================");
    }

}