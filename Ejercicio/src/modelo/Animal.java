package modelo;
import java.io.Console;

public class Animal {
    //Atributos
    Console console = System.console();
    private Cuidador cuidador = new Cuidador();
    private String nombreAnimal;
    private String especie;
    private Double pesoKg;
    private Double alimentoKg;

    //Constructores
    public Animal(){
        this.cuidador = cuidador;
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.pesoKg = pesoKg;
        this.alimentoKg = alimentoKg;
    }

    //Getters y setters
    public Cuidador getCuidador(){
        return this.cuidador;
    }
    public String getNombreAnimal(){
        return this.nombreAnimal;
    }
    public String getEspecie(){
        return this.especie;
    }
    public double getPesoKg(){
        return this.pesoKg;
    }
    public double getAlimentoKg(){
        return this.alimentoKg;
    }

    public void setCuidador(Cuidador cuidador){
        this.cuidador = cuidador;
    }
    public void setNombreAnimal(String nombreAnimal){
        this.nombreAnimal = nombreAnimal;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setPesoKg(double pesoKg){
        while (pesoKg <= 0) {
            pesoKg = Integer.parseInt(console.readLine("El peso debe ser mayor a 0kg. Introduzca de nuevo el peso: "));
        }
        this.pesoKg = pesoKg;
    }
    public void setAlimentoKG(double alimentoKg){
        while (alimentoKg <= 0) {
            alimentoKg = Integer.parseInt(console.readLine("El alimento debe ser mayor a 0kg. Introduzca de nuevo la canridad de alimento: "));
        }
        this.alimentoKg =  alimentoKg;
    }

}
