
package Capitulo4_Ejercicio_Resuelto7;

public class Quien_es_mayor {
    float A;
    float B;
    public Quien_es_mayor(float A, float B){
            this.A = A;
            this.B = B; 
    }
    public String A_es(){
        if (A > B){
            return "A es mayor que B";  
        }else if (A == B){
            return "A es igual a B";
        }else{
            return "A es menor que B";
        }
        
    }
}
