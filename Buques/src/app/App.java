package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicilizando buques  y puertos");

        Buque barquito = Buque.NuevoBuqueCargado();

        for (Contenedor contenedorcito : barquito.losContenedores) {
            switch (contenedorcito.puertoArribo.nroPuerto) {
            case 1:
                Puerto.BuscaPuerto(1).ContenedoresARecibir.add(contenedorcito);
                break;
            case 2:
                Puerto.BuscaPuerto(2).ContenedoresARecibir.add(contenedorcito);
                break;
            case 3:
                Puerto.BuscaPuerto(3).ContenedoresARecibir.add(contenedorcito);
                break;
            }

        }
        // Por cada puerto voy a imprimir sus cantidades
        for (Puerto puertito : Puerto.PuertosDelMundo) {
            System.out.println("El puerto " + puertito.nombre + " recibirá " + puertito.ContenedoresARecibir.size());
        }
        // Imprimo el peso del Buque
        System.out.println("El peso del barco " + barquito.nombre + " es " + barquito.calcularPeso());

        // Ahora saco el contenedor máximo
        Contenedor elContenedorMasPesado = barquito.getContenedorMaximo();
        System.out.println("El contenedor más pesado es " + elContenedorMasPesado.idContenedor + " cuyo peso es "
                + elContenedorMasPesado.peso);
    }
}