package modelo;
import java.util.ArrayList;

public class Refugio {
    //Atributos
    private ArrayList<Animal> animales = new ArrayList<>();
    private double precioAlimentoKg;
    private int cantRegistros;
    
    //Constructores
    public Refugio(){
        this.animales = animales;
        this.precioAlimentoKg = precioAlimentoKg;
        this. cantRegistros = cantRegistros;
    }
    
    //Métodos (cálculos)
    public ArrayList<Double> costeAnimales(){
        ArrayList<Double> costeAniamles = new ArrayList<>();
        for (int i = 0; i <= cantRegistros; i++){
            double costeAnimal = getPrecioAlimentoKg()*animales.get(i).getAlimentoKg();
            costeAniamles.add(costeAnimal);
        }
        return costeAniamles;
    }
    public double costeDiarioTotal(){
        double coste = 0;
        for (Animal animal : animales){
            coste = coste + getPrecioAlimentoKg()*animal.getAlimentoKg();
        }
        return coste;
    }
    public double pesoMedio(){
        double peso = 0;
        for (Animal animal : animales){
            peso = peso + getPrecioAlimentoKg()*animal.getPesoKg();
        }
        return peso/cantRegistros;
    }

    //Getters y Setters
    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }
    public double getPrecioAlimentoKg(){
        return this.precioAlimentoKg = precioAlimentoKg;
    }
    public int getCantidadRegistros(){
        return animales.size(); 
    }

    public void setAnimales(ArrayList<Animal> animales){
        this.animales = animales;
    }
    public void setPrecioAlimentoKg(double precioAlimentoKg){
        this.precioAlimentoKg = precioAlimentoKg;
    }
    
}

