package Mision1.Proyecto1.src.com.empresa.gestion.model;

public class Persona {
    
    //Encapsulacion
    private String nombre;
    private int edad;
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        

        }

        public String getNombre() {
            return nombre;

        } public void SetNombre(String nombre) {
            this.nombre = nombre;

        } 
        //metodos
        public void presentarse(){
            system.out.println("hola, soy"+nombre+" y tengo "+edad+" años");
        }

    }

