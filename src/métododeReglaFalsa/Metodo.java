/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package métododeReglaFalsa;

/**
 *
 * @author hecto
 */
public class Metodo {
    public double raiz(Funcion f, double x0, double x1,int n, double error){
        double r=Double.NaN;
        double x=x0;
        int k=0;
        while(Math.abs(f.eval(x))>error&&k<n){
            x=(x0*f.eval(x1)-x1*f.eval(x0))/(f.eval(x1)-f.eval(x0));
            if(f.eval(x0)*f.eval(x)<0){
                x1=x;
            }else{
                x0=x;
            }
            k++;
        }
        if(k<n)r=x;
        return r;
    }
}
