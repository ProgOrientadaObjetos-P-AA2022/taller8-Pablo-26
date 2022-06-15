
package paquete1;

public class DocenteFactura extends Docente{
    
    double valorFactura;
    double valorIVADescuento;
    double valorCancelar;
    
    public void establecerValorFactura(double n){
        valorFactura = n;
    }
    
    public void establecerValorIVADescuento(){
        valorIVADescuento = valorFactura * 0.12;
    }
    
    public void calcularValorCancelar(){
        valorCancelar = valorFactura + valorIVADescuento;
    }
    
    
    public double obtenerValorFactura(){
        return valorFactura;
    }
    
    public double obtenerValorIVADescuento(){
        return valorIVADescuento;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("\nNombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Factura: %.2f\n"
                + "Descuento del IVA: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                valorFactura,
                valorIVADescuento,
                obtenerValorCancelar());
        return reporte;
    }
}
