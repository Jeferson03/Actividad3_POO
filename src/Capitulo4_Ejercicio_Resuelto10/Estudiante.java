
package Capitulo4_Ejercicio_Resuelto10;


public class Estudiante {
    int inscripcion;
    String nombres;
    float patrimonio;
    int estrato;
    float valor = 50000;
    public Estudiante(int inscripcion, String nombres, float patrimonio, int estrato){
        this.inscripcion = inscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        }
    public float matricula(){
        if (patrimonio>2000000 && estrato>3){
            valor = (float) (valor + (patrimonio*0.03));
            return valor;
        } else{
            return valor;
        }
    }
    public String datos(){
        return "Numero de inscripcion: " + inscripcion + "\n" + "Nombres: " + nombres +"\n"+ "Valor de la matricula: " + matricula();
    }
    
}
