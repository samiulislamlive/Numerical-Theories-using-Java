
package numerical;


public class FalsePosition {
    static int MAX_ITER = 1000000; 
  
    static double func(double x) 
    { 
        return (x * x * x - x * x + 2); 
    } 
  
   
    static void regulaFalsi(double a, double b) 
    { 
        if (func(a) * func(b) >= 0)  
        { 
            System.out.println("You have not assumed right a and b"); 
        } 
       
        double c = a;  
  
        for (int i = 0; i < MAX_ITER; i++)  
        { 
            
            c = (a * func(b) - b * func(a))  
                 / (func(b) - func(a)); 
  
            if (func(c) == 0) 
                break; 
  
            else if (func(c) * func(a) < 0) 
                b = c; 
            else
                a = c; 
        } 
        System.out.println("The value of root is : " + (int)c); 
    } 
    
}
