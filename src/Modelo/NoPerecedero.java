
package Modelo;

public class NoPerecedero extends Producto{
    // ** Atributos **
    private double IVA;
    
    // ** Métodos **
    // Método constructor 1
    public NoPerecedero() {
        super();
    }
    
    // Método constructor 2
    public NoPerecedero(String nombre, double precio, double IVA) {
        super(nombre, precio);
        this.IVA = IVA;
    }
    
    // Getter y Setter de IVA
    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }
    
    @Override
    public String toString() {
        return "\nNO PERECEDERO = " + "\nNombre: " + super.getNombre() +
                                "\nPrecio: " + super.getPrecio() +
                                "\nIVA: " + IVA + "%" +
                                "\nPrecio con IVA: " + (super.getPrecio() + (super.getPrecio()*(IVA/100)));
    }
    
    // Métoddo Calcular en Productos No Perecederos
    
    @Override
    public double Calcular() {
        double precioFinal = (super.getPrecio() + (super.getPrecio()*(IVA/100)));
        return precioFinal;
    }
}
