package modelo;
import java.io.Console;

public class Animal {
    //Atributos
    Console console = System.console();
    private Cuidador cuidador;
    private String nombreAnimal;
    private String especie;
    private Double pesoKg;
    private Double alimentoKg;

    //Constructores
    public Animal(String nombreAnimal, String especie, double pesoKg, double alimentoKg, Cuidador cuidador){
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
    //Comprobación que peso y alimento son mayores a 0
    public void setPesoKg(double pesoKg) {
    if (pesoKg <= 0) {
        throw new IllegalArgumentException("El peso debe ser mayor a 0 kg.");
    }
        this.pesoKg = pesoKg;
    }
    public void setAlimentoKg(double alimentoKg) {
    if (alimentoKg <= 0) {
        throw new IllegalArgumentException("El alimento debe ser mayor a 0 kg.");
    }
        this.alimentoKg = alimentoKg;
    }
}
