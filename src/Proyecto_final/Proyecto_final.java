package Proyecto_final;

import java.util.Scanner;

public class Proyecto_final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el monto de la compra 1: ");
        double compra1 = sc.nextDouble();

        System.out.print("Ingrese el monto de la compra 2: ");
        double compra2 = sc.nextDouble();

        System.out.print("Ingrese el monto de la compra 3: ");
        double compra3 = sc.nextDouble();

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Resultados
        System.out.println("\nCliente: " + nombre);
        System.out.println("Total compras: " + totalCompras);
        System.out.println("Promedio compras: " + promedioCompras);
    }
}