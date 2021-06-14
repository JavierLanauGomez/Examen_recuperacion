
package calculadoras;


public class Calculadoras {

    public int multiplica (int a, int b){
        
        return a*b;
    }
   
    public int divide (int a,int b)throws Exception{
        if (b==0)
            throw new Exception("no se puede dividor entre 0");
            
            return a/b;
        }
    
    public int factorial (int numero) throws Exception{
        
        if (numero<0){
            throw new IllegalArgumentException("Factorial negativo");
            
        }
        int factorial =numero;
        for(int i=(numero-1);i>1;i--){
            factorial = factorial*i;}
        return factorial;
        }
    }

