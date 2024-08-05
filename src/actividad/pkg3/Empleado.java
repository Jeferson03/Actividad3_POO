
package actividad.pkg3;

public class Empleado {
    int codigo;
    String nombre;
    float horas, valor_h, retencion;
    public Empleado(int codigo, String nombre, float horas, float valor_h, float retencion){
        this.codigo=codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.valor_h =  valor_h;
        this.retencion = retencion;
    }        
public String datosTrabajador(){    
           return " \nCODIGO EMPLEADO: " + codigo  + "\n NOMBRE EMPLEADO: " + nombre   + "\n SALARIO BRUTO: " + salarioBruto() + "\n SALARIO NETO: " + salarioNeto() ;        
    }
public float salarioBruto(){
    return horas*valor_h;
}
public float salarioNeto(){
    return (horas*valor_h)-(horas*valor_h)*(retencion/100);
    }
    }

