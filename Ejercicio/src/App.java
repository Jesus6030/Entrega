import modelo.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Refugio refugio = new Refugio();
        //Presentación menú
        System.out.println("|" + "-".repeat(50) + "|");
        System.out.println("| GESTIÓN DEL REFUGIO" + " ".repeat(30) + "|");
        System.out.println("|" + "-".repeat(50) + "|");
        System.out.println("| 1) Crear un nuevo registro de animales" + " ".repeat(11) + "|");
        System.out.println("| 2) Configurar el precio del alimanto por kg" + " ".repeat(6) + "|");
        System.out.println("| 3) Añadir un nuevo animal al refugio" + " ".repeat(13) + "|");
        System.out.println("| 4) Mpstrar información de los animales" + " ".repeat(11) + "|");
        System.out.println("| 5) Salir (se borrará toda a información)" + " ".repeat(9) + "|");
        System.out.println("|" + "-".repeat(50) + "|");
        System.out.println("\nSeleccione una opción (1-5): ");
        int i = sc.nextInt();

        //Ejecución del menú
        while (i < 5) {
            if (i == 1){
                refugio.setCantidadRegistros(0);
                Animal[] nuevoRegistro = new Animal[refugio.getCantidadRegistros()];
                while (refugio.getCantidadRegistros() <= 0) {
                    System.out.println("Introduzca cuantos animales quiere registrar (>0): ");

                    if (sc.hasNextInt()){
                        refugio.setCantidadRegistros(sc.nextInt());
                    }else{
                        System.out.println("Error: el valor debe ser un número entero >0.");
                        sc.next(); // Limpia la entrada no válida
                    }
                }
                //Crear el Array con la cantidad de registros
                nuevoRegistro = new Animal[refugio.getCantidadRegistros()];
                refugio.setAnimales(nuevoRegistro);
                System.out.println("Nuevo registro creado:\nHay " + refugio.getAnimales().length + " huecos disponibles.");
            }if (i == 2){
                refugio.setPrecioAlimentoKg(3);
                System.out.println("Introduzca el precio del alimento (>0): ");
                if (sc.hasNextDouble()){
                    refugio.setPrecioAlimentoKg(sc.nextDouble());
                }else{
                    System.out.println("Error: valor debe ser un número entero >0.");
                    sc.next(); // Limpia la entrada no válida
                }
               System.out.println("El precio del alimento es: " + refugio.getPrecioAlimentoKg());
            }
            System.out.println("\nSeleccione una opción (1-5): ");
            i = sc.nextInt();
        }
        System.out.println("Ejecución finalizada:");
    }          
}
