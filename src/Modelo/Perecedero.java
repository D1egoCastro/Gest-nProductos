
package Modelo;

public class Perecedero extends Producto {
    // ** Atributos **
    private int diasCaducar;
    
    // ** Métodos **
    // Método constructor 1
    public Perecedero() {
        super();
    }
    
    // Método constructor 2
    public Perecedero(String nombre, double precio, int diasCaducar) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }
    
    // Getter y Setter de Días a Caducar
    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    @Override
    public String toString() {
        return "\nPERECEDERO = " + "\nNombre: " + super.getNombre() +
                                "\nPrecio: " + super.getPrecio() +
                                "\nDias a caducar: " + diasCaducar +
                                "\nPrecio con descuento: " + Calcular();
    }

    // Métoddo Calcular en Productos Perecederos
    @Override
    public double Calcular() {
        double precioFinal = 0;
        if (diasCaducar == 1){ // Si le queda 1 día para caducar, se reducirá 4 veces el precio final
            precioFinal = super.getPrecio()/4;
        }
        if (diasCaducar == 2){ // Si le quedan 2 días para caducar, se reducirá 3 veces el precio final
            precioFinal = super.getPrecio()/3;
        }
        if (diasCaducar == 3){ // Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final
            precioFinal = super.getPrecio()/2;
        }
        if (diasCaducar > 3){ // Si le quedan mas de 3 días para caducar, su precio final no varia
            precioFinal = super.getPrecio();
        }
        return precioFinal;
    }
    
}
