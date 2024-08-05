
package Capitulo4_Ejercicio_Propuesto23;


public class Ecuacion_segundo_grado {
    float A, B, C;
    public Ecuacion_segundo_grado(float A, float B, float C){
        this.A = A;
        this.B = B;
        this.C = C;
        
    }
    public String posibles_soluciones(){
            float determinante = (float) (Math.pow(B, 2)-4*(A)*(C));
            float solucion1 = (float) ((-B+(Math.sqrt(determinante)))/(2*A));
            float solucion2 = (float) ((-B-(Math.sqrt(determinante)))/(2*A));
         if (determinante<0){
            return "El sistema no tiene posibles soluciones ya que su determinante es menor que 0";
         } else {
             return "X = " + solucion1 + "\nX = " + solucion2;
         }
    }
}
