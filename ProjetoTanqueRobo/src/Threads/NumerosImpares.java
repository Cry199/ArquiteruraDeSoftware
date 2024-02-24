package Threads;

public class NumerosImpares extends Thread{
        
        public void run() 
        {
            int ii = 0;
    
            for(int i=1; i<=2000;i+=2){
            ii = i;
            }
    
            System.out.println("NumerosImpares: " + ii);
        }
}
