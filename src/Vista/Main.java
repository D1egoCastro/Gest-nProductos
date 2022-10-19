
package Vista;

import Modelo.*;

public class Main {
    public static void main(String[] args) {
        double SUMA = 0, SUMA2 = 0;
        
        Producto Arreglo[] = {new Perecedero("Pasta", 1500, 5),
                              new Perecedero("Leche", 3000, 2),
                              new Perecedero("Queso", 5000, 1),
                              new Perecedero("Gaseosa", 5000, 4),
                              new Perecedero("Galleta", 1200, 10)};                               
                                    
        Producto Arreglo2[] = {new NoPerecedero("Camisa", 25000, 19),
                              new NoPerecedero("Pantalon", 30000, 19),
                              new NoPerecedero("Telefono", 500000, 19),
                              new NoPerecedero("Bolsa", 1000, 19),
                              new NoPerecedero("Cuaderno", 1200, 19)};
        
        
        for (int I = 0; I < Arreglo.length; I++){
            SUMA = SUMA + Arreglo[I].Calcular();
        }
        
        for (int I = 0; I < Arreglo2.length; I++){
            SUMA2 = SUMA2 + Arreglo2[I].Calcular();
        }
        
        System.out.println("Precio total de vender 5 productos Perecederos: " + SUMA);
        System.out.println("Precio total de vender 5 productos NO Perecederos: " + SUMA2);
        System.out.println(Arreglo[1].toString());
        System.out.println(Arreglo2[1].toString());
    }
}
