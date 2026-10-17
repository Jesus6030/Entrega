package modelo;

public class Cuidador {
    //Atributos
    private String nombreCuidador;
    private String apellidos;
    private Boolean formacion;

    //Constructores
    public Cuidador(){
        this.nombreCuidador = nombreCuidador;
        this.apellidos = apellidos;
        this.formacion = formacion;
    }

    //Getters y setters
    public String getNombreCuidador(){
        return this.nombreCuidador;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public Boolean getFormacion(){
        return this.formacion;
    }

    public void setNombreCuidador(String nombreCuidador){
        this.nombreCuidador = nombreCuidador;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setFormacion(Boolean formacion){
        this.formacion = formacion;
    }
}
