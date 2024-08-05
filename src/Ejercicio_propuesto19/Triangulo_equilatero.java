package Ejercicio_propuesto19;

public class Triangulo_equilatero {
    float lado;
    public Triangulo_equilatero(float lado){
    this.lado = lado;
}
public float perimetro(){
    return 3*lado;
}         
public float altura(){
    return (float) (Math.sqrt(3)*lado)/2;
}
public float area(){
           return (float) (((Math.sqrt(3))*(Math.pow(lado,2)))/4);
}
}
