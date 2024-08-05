
package Capitulo4_Ejercicio_Propuesto22;

public class Empleado {
    String nombre;
    float valor_h, horas;
    public Empleado(String nombre, float valor_h, float horas){
        this.nombre = nombre;
        this.valor_h = valor_h;
        this.horas = horas;                      
    }
    public String datosEmpleado(){
        if (valor_h*horas > 450000){
            return ("NOMBRE: " + nombre  + "\n\nSALARIO MENSUAL: " + valor_h*horas);
        } else{
            return "NOMBRE: " + nombre;
        }
    }
}
