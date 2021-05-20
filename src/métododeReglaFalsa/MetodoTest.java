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
public class MetodoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcion f=new Funcion() {
            @Override
            public double eval(double x) {
                return Math.sin(x)*x;
            }
        };
        Metodo met=new Metodo();
        double raiz=met.raiz(f, 1, 4, 100, 1e-6);
        System.out.println("raíz: "+raiz);
    }
    
}
