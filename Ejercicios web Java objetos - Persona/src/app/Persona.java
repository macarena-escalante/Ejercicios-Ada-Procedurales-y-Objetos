package app;

/**
 * Persona
 */
public class Persona {

    final protected static char SEXO_DEFINIDO = 'H';
    final protected static int INFRAPESO = -1; // Por qué hacer constantes de peso?
    final protected static int PESO_IDEAL = 0;
    final protected static int SOBREPESO = 1;

    protected String nombre;
    protected int edad;
    protected long dni;
    protected char sexo;
    protected double peso;
    protected double altura;

    public Persona() {
        this(" ", 0, SEXO_DEFINIDO, 0, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, long dni) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFINIDO;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularImc() {
        double pesoActual = peso / (altura * 2);
        if (pesoActual < 20) {
            return INFRAPESO;
        } else if (pesoActual > 20 && pesoActual < 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad < 18) {
            mayor = true;
        }
        return mayor;
    }

    public String toString() {

        return "Informacion de la persona: \n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + " años \n" + "Sexo: "
                + sexo + "\n" + "DNI: " + dni + "\n" + "Peso: " + peso + "kg \n" + "Altura: " + altura + "mtrs \n";

    }
}
