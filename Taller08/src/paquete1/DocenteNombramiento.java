
package paquete1;

public class DocenteNombramiento extends Docente{
    
    double valorSueldo;
    double valorHorasExtra;
    int numeroHoraExtra;
    double sueldoFinal;
    
    public void establecerValorSueldo(double n){
        valorSueldo = n;
    }
    
    public void establecerValorHorasExtra(double n){
        valorHorasExtra = n;
    }
    
    public void establecerNumeroHorasExtra(int n){
        numeroHoraExtra = n;
    }
    
    public void calcularSueldoFinal(){
        sueldoFinal = valorSueldo + (valorHorasExtra * numeroHoraExtra);
    }
    
    
    public double obtenerValorSueldo(){
        return valorSueldo;
    }
    
    public double obtenerValorHorasExtra(){
        return valorHorasExtra;
    }
    
    public int obtenerNumeroHoraExtra(){
        return numeroHoraExtra;
    }
    
    public double obtenerSueldoFinal(){
        return sueldoFinal;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("\nNombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Sueldo: %.2f\n"
                + "Valor Horas Extra: %.2f\n"
                + "Numero de Horas Extra: %d\n"
                + "Sueldo Final: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                valorSueldo,
                valorHorasExtra,
                numeroHoraExtra,
                obtenerSueldoFinal());
        return reporte;
    }
}
