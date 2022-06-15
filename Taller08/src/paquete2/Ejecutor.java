
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Docente Nombramiento  [1]");
        System.out.println("Docente Factura       [2]");
        System.out.println("\nIngrese la opcion que desee: ");
        int op = sc.nextInt();
        
        if(op < 1 || op > 2){
            System.out.println("Error, opción no válida.");
        }else{
            sc.nextLine();
            System.out.println("Ingrese los nombres del docente: ");
            String nom = sc.nextLine();
            
            System.out.println("Ingrese la cedula del docente: ");
            String id = sc.nextLine();
            
            switch(op){
                case 1:
                    DocenteNombramiento docNom = new DocenteNombramiento();
                    
                    System.out.println("Ingrese el valor del sueldo: ");
                    double sueldo = sc.nextDouble();
                    System.out.println("Ingrese el valor de la hora extra: ");
                    double horaExtra = sc.nextDouble();
                    System.out.println("Ingrese el numero de horas extras: ");
                    int numHoras = sc.nextInt();
                    
                    docNom.establecerNombre(nom);
                    docNom.establecerCedula(id);
                    docNom.establecerValorSueldo(sueldo);
                    docNom.establecerValorHorasExtra(horaExtra);
                    docNom.establecerNumeroHorasExtra(numHoras);
                    docNom.calcularSueldoFinal();
                    
                    System.out.printf("%s\n", docNom);
                    break;
                case 2:
                    DocenteFactura docFact = new DocenteFactura();
                    
                    System.out.println("Ingrese el valor de la Factura: ");
                    double fact = sc.nextDouble();
                    
                    docFact.establecerNombre(nom);
                    docFact.establecerCedula(id);
                    docFact.establecerValorFactura(fact);
                    docFact.establecerValorIVADescuento();
                    docFact.calcularValorCancelar();
                    
                    System.out.printf("%s\n", docFact);
                    break;
                default: break;
            }
        }
    }
}
