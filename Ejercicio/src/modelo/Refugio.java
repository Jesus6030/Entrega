package modelo;

public class Refugio {
    //Atributos
    private Animal[] animales;
    private double precioAlimentoKg = 3;
    private int cantRegistros = 0;
    
    //Constructores
    //Por defecto
    public Refugio(){}
    //con parámetro
    public Refugio(int cantRegistros, double precioAlimentoKg){
        this.animales = new Animal[cantRegistros];
        this.precioAlimentoKg = precioAlimentoKg;
        this. cantRegistros = cantRegistros;
    }
    
    // 1) Método para crear un nuevo registro
    public void crearNuevoregistro(int cantRegistros){
        if (cantRegistros <= 0){
            throw new IllegalArgumentException("La cantidad de registros debe ser mayor a 0.");
        }
        this.animales = new Animal[cantRegistros];
    }

    //Métodos (cálculos)
    public double costeAnimal(double alimentokg){
        return getPrecioAlimentoKg()*alimentokg;
    }
    public double costeDiarioTotal(Animal[] animales){
        if (animales == null || cantRegistros == 0) return 0.0; //Para huecos vacíos
        double coste = 0;
        for (Animal animal : animales){
            if (animal != null){
                coste += getPrecioAlimentoKg()*animal.getAlimentoKg();
            }        
        }
        return coste;
    }
    public double pesoMedio(Animal[] animales){
        if (animales == null || cantRegistros == 0) return 0.0; //Para huecos vacíos
        double peso = 0;
        for (Animal animal : animales){
            if (animal != null){
            peso = peso + animal.getPesoKg();
            }
        }
        return peso;
    }

    //Getters y Setters
    public Animal[] getAnimales(){
        return this.animales;
    }
    public double getPrecioAlimentoKg(){
        return this.precioAlimentoKg;
    }
    public int getCantidadRegistros(){
        return this.cantRegistros; 
    }

    public void setAnimales(Animal[] animales){
        this.animales = animales;
    }
    public void setPrecioAlimentoKg(double precioAlimentoKg){
        if (precioAlimentoKg <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        this.precioAlimentoKg = precioAlimentoKg;
    }
    public void setCantidadRegistros(int cantRegistros){
        this.cantRegistros = cantRegistros; 
    }
    
}

