import java.util.Scanner;
public class Main
{
    public static int soma (int x,int y){
        int s = x+y;
        
        return s;
    }
     public static int multiplicação (int x,int y){
        int u = x*y;
        
        return u;
    }
     public static int subtracao (int x,int y){
        int o = x-y; 
        
        return o;
    }
       public static int divisao (int x,int y){
        int z = x/y;
        
        return z;
    }
    
         public static double raiz (double x){
         double r = Math.sqrt(x);
        
        return r;
    }
         public static double potencia (double x, double y){
         double p = Math.pow(x,y);
        
        return p;
    }
 
 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char operacao;
        
        System.out.println("CALCULADORA: Selecione a operação:\nA ADIÇÃO \nB SUBTRAÇÃO \nC MULTIPLICAÇÃO \nD DIVISÃO \nE RAIZ \nF POTÊNCIA");
        operacao = sc.nextLine().charAt(0);
        System.out.println("");
        
        System.out.println("Digite um valor para X: ");
	    int x = sc.nextInt();
	    System.out.println("Digite um valor para Y: ");
	    int y = sc.nextInt();
	    System.out.println("");
	    
	     int s = soma(x,y);
	     int m = multiplicação(x,y);
	     int su = subtracao(x,y);
	     int d = divisao(x,y);
	     double r = raiz(x);
	     double p = potencia(x,y);
	     
        
   
    switch(operacao){
        case 'A':
        case 'a':
            System.out.println("O Resultado da Soma é: "+s);
            break;
            
        case 'B':
        case 'b':
              System.out.println("O Resultado da Subtração é: "+su);
              break;
              
        case 'C':
        case 'c':
            System.out.println("O Resultado da Multiplicação é: "+m);
            break;
            
        case 'D':
        case 'd':
            System.out.println("O Resultado da Divisão é: "+d);
            break;
            
        case 'E':
        case 'e':
            System.out.println("O Resultado da Raiz é: "+r);
            break;
            
        case 'F':
        case 'f':
            System.out.println("O Resultado da Potência é: "+p);
            break;
            
        default :
            System.out.println("Codigo Invalido");
    }     
     }
}
	  

