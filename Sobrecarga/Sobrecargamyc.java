package Sobrecarga;

/*No� Jonat�n G�mez Hern�ndez 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

public class Sobrecargamyc {
    
    private double x;
    private double y;
    private double z;

    public Sobrecargamyc (double x, double y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double operar(){
        
        z=x+y;
        
        return z;        
    }
    
    public double operar(double x, double y){
        
        z=Math.pow(y,1/x);
        
        return z;        
    }  
}
