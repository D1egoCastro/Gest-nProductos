
package Modelo;

public abstract class Producto {
    // ** Atributos **
    private String nombre;
    private double precio;
    
    // ** Métodos ** 
    // Método constructor 1
    public Producto(){
    }
    
    // Método constructor 2
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getter y Setter de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter y Setter de Precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     public abstract double Calcular();
}
