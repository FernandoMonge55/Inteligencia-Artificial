
package com.mycompany.examendiagnosticoia;

public class ExamenDiagnosticoIA {

    public static void main(String[] args) {
        Arbol miArbol = new Arbol();

        miArbol.insertar("Marco");    
        miArbol.insertar("Juanito");  
        miArbol.insertar("Zelda");    
        miArbol.insertar("Delfina");   
        miArbol.insertar("Linda");   

        miArbol.imprimirArbol();

        System.out.println("\n --Busqueda--");
        String nombreABuscar = "Linda";
        Nodo resultado = miArbol.buscarNodo(nombreABuscar);
        
        if (resultado != null) {
            System.out.println("Si se encontro: " + resultado.nombre);
        } else {
            System.out.println("No se encontro a: " + nombreABuscar);
        }

    }
    }

