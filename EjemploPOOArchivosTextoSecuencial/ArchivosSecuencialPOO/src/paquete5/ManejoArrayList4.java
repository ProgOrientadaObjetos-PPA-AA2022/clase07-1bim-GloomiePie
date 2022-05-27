/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

public class ManejoArrayList4 {

    public static void main(String[] args) {
        Empresa emp1 = new Empresa("Zapatos inc", "Loja");
        Empresa emp2 = new Empresa("KFC", "Quito");
        Empresa emp3 = new Empresa("Marathon", "Cuenca");

        // ArrayList
        ArrayList<Empresa> empresa = new ArrayList<>();
        empresa.add(emp1);
        empresa.add(emp2);
        empresa.add(emp3);

        for (int i = 0; i < empresa.size(); i++) {
            System.out.printf("%s - %s\n", empresa.get(i).obtenerNombre(), 
                    empresa.get(i).obtenerCiudad());
        }

        System.out.println("-----------------------------");

    }
}
