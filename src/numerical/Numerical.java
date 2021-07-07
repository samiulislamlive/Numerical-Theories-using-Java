/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerical;

import java.util.Scanner;


public class Numerical {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int choice;
        Bisection bis=new Bisection();
        FalsePosition fp = new FalsePosition();
        NewtonRhapson nr= new NewtonRhapson();
        Secant s= new Secant();
        Cramer cr= new Cramer();
        NaiveGELIM yo= new NaiveGELIM();
        GJordan m = new GJordan(4);
        double a=-200;
        double b=300;
        double c=-20;
        float z = 0, x = 1, y = 0.0001f;
        double coeff[][] = {{ 2, -1, 3, 9 }, 
                        { 1, 1, 1, 6 }, 
                        { 1, -1, 1, 2 }};
        System.out.println("The choices that you have are:"
                + "1.Bisection Method. \n"
                + "2. False Position\n"
                + "3. Newton Rhapson \n"
                + "4. Secant Method \n"
                + "5. Cremar's Rule \n"
                + "6. Gauss Jordan \n"
                + "7. Naive Gauss Elimination \n");
        System.out.println("Enter your choice:");
        choice=input.nextInt();
        
        switch (choice)
        {
            case 1:
                System.out.println("a=-200 , b=300");
                bis.bisection(a,b);
                break;
            case 2:
                System.out.println("a=-200 , b=300");
                fp.regulaFalsi(a,b);
                break;
            case 3:
                System.out.println("c=-20");
                nr.newtonRaphson(c);
                break;
            case 4:
                System.out.println("z = 0, x = 1, y = 0.0001f");
                s.secant(z,x,y);
                break;
            case 5:
                System.out.println("coeff[][] = {{ 2, -1, 3, 9 }, \n" +
"                        { 1, 1, 1, 6 }, \n" +
"                        { 1, -1, 1, 2 }}");
                cr.findSolution(coeff);
                break;
            case 6:
                 m.process();
                    m.printMatrix();
                    break;
            case 7:
                System.out.println("n=3");
                yo.testNGE();
                break;
                
        }            
        
    }
    
}
