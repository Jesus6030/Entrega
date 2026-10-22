import modelo.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Refugio refugio = new Refugio();
        Animal[] nuevoRegistro = new Animal[0];
        //Variable auxiliar para el conteo de la opción 3)
        int indice = 0; //Nos ayudará en los cálculos de posiciones en el array
        
        //Presentación menú
        System.out.printf("|" + "-".repeat(50) + "|\n");
        System.out.printf("| GESTIÓN DEL REFUGIO" + " ".repeat(30) + "|\n");
        System.out.printf("|" + "-".repeat(50) + "|\n");
        System.out.printf("| 1) Crear un nuevo registro de animales" + " ".repeat(11) + "|\n");
        System.out.printf("| 2) Configurar el precio del alimanto por kg" + " ".repeat(6) + "|\n");
        System.out.printf("| 3) Añadir un nuevo animal al refugio" + " ".repeat(13) + "|\n");
        System.out.printf("| 4) Mpstrar información de los animales" + " ".repeat(11) + "|\n");
        System.out.printf("| 5) Salir (se borrará toda a información)" + " ".repeat(9) + "|\n");
        System.out.printf("|" + "-".repeat(50) + "|\n");
        System.out.printf("Seleccione una opción (1-5): ");
        int i = sc.nextInt();
        sc.nextLine(); //Limpieza de línea

        //Ejecución del menú
        while (i < 5) {
            if (i == 1){
                //Nuevo Array de registros
                refugio.setCantidadRegistros(0);
                while (refugio.getCantidadRegistros() <= 0) {
                    System.out.println("Introduzca cuantos animales quiere registrar (>0): ");

                    if (sc.hasNextInt()){
                        refugio.setCantidadRegistros(sc.nextInt());
                        sc.nextLine(); //Limpieza de línea
                    }else{
                        System.out.println("Error: el valor debe ser un número entero >0.");
                        sc.next(); // Limpia la entrada no válida
                    }
                }
                //Crear el Array con la cantidad de registros
                nuevoRegistro = new Animal[refugio.getCantidadRegistros()];
                refugio.setAnimales(nuevoRegistro);
                System.out.println("Nuevo registro creado:\nHay " + refugio.getAnimales().length + " huecos disponibles.");
                //Nuevo valor para variable auxiliar del conteo de la opción 3)

            }if (i == 2){
                //Precio único de alimento
                refugio.setPrecioAlimentoKg(3);
                System.out.println("Introduzca el precio del alimento (>0): ");
                if (sc.hasNextDouble()){
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine(); //Limpieza de línea
                    if (nuevoPrecio > 0){
                    refugio.setPrecioAlimentoKg(nuevoPrecio);
                    }else{
                        System.out.println("Se mantiene el precio por defecto.");
                    }
                }else{
                    System.out.println("Error: valor debe ser un número entero >0.");
                    sc.next(); // Limpia la entrada no válida
                }
               System.out.println("El precio del alimento es: " + refugio.getPrecioAlimentoKg());
            }if (i == 3){
                //Nuevo registro
                if(indice <= refugio.getCantidadRegistros()){
                    Cuidador cuidador = new Cuidador(null, null, null);
                    System.out.println("Introduzca los datos del cuidador: ");
                    System.out.println("Nombre del cuidador: ");
                    cuidador.setNombreCuidador(sc.nextLine());
                    System.out.println("Apellidos: ");
                    cuidador.setApellidos(sc.nextLine());
                    System.out.println("Formación (1 = si/0 = no): ");
                    int formacion = 2;
                    while (formacion != 0 && formacion !=1) {
                        if (sc.hasNextInt()) {
                            formacion = sc.nextInt();
                            sc.nextLine(); //Limpieza de línea
                                if (formacion == 0) {
                                    cuidador.setFormacion(false);
                                }else if (formacion == 1) {
                                    cuidador.setFormacion(true);
                                }else{
                                    System.out.println("Introduzca 1 si el cuidador tiene formación. Introduzca 0 en caso contrario.");
                                    sc.next(); // Limpia la entrada no válida
                                }
                        }else{
                        System.out.println("Introduzca 1 si el cuidador tiene formación. Introduzca 0 en caso contrario.");
                        sc.next(); // Limpia la entrada no válida
                        }
                    }
                    Animal animal = new Animal(null, null,0,0,null);
                    System.out.println("Introduzca los datos del animal: ");
                    animal.setCuidador(cuidador); //El cuidador ya nos lo han dado
                    System.out.println("Nombre del Animal: "); //no lo lee bien
                    animal.setNombreAnimal(sc.nextLine());
                    System.out.println("Especie animal: ");
                    animal.setEspecie(sc.nextLine());
                    System.out.println("Peso (kg) del animal: ");
                    while (animal.getPesoKg() <= 0) {
                        if (sc.hasNextDouble()) {
                            animal.setPesoKg(sc.nextDouble());
                            sc.nextLine(); //Limpieza de línea
                        }else{
                            System.out.println("Introduzca un peso mayor a 0kg: ");
                            sc.next(); // Limpia la entrada no válida
                        }
                    }
                    System.out.println("Cantidad de alimento que necesita (kg): ");
                    while (animal.getAlimentoKg() <= 0) {
                        if (sc.hasNextDouble()) {
                            animal.setAlimentoKg(sc.nextDouble());
                            sc.nextLine(); //Limpieza de línea
                        }else{
                            System.out.println("Introduzca un peso mayor a 0kg: ");
                            sc.next();
                        }
                    }
                    nuevoRegistro[indice] = new Animal(animal.getNombreAnimal(), animal.getEspecie(), animal.getPesoKg(), animal.getAlimentoKg(), animal.getCuidador());
                    indice = indice + 1;
                }else{
                    System.out.println("No quedan huecos libres para registros. :(");
                }

            }if (i == 4) {
                //Tabla
                System.out.printf("|" + "-".repeat(95) + "|\n");
                System.out.printf("| ANIMALES DEL REFUGIO " + " ".repeat(73)+ "|\n");
                System.out.printf("|" + "-".repeat(95) + "|\n");
                System.out.printf("| Nombre     | Especie  | Cuidador          | Formación | Peso (kg) | Consumo (kg) | Coste EUR  |\n");
                System.out.printf("");
                System.out.printf("|" + "-".repeat(95) + "|\n");
                System.out.printf("| Coste diario total de alimentación: \n" + refugio.costeDiarioTotal(nuevoRegistro));
                System.out.printf("| Peso medio de los animales: \n" + refugio.pesoMedio(nuevoRegistro));
                System.out.printf("|" + "-".repeat(95) + "|\n");
            }
            System.out.println("\nSeleccione una opción (1-5): ");
            i = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Ejecución finalizada:");
        sc.close();
    }          
}
