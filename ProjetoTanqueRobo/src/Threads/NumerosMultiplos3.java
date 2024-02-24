package Threads;

public class NumerosMultiplos3  extends Thread
{
    @Override
    public void run() 
    {
        int ii = 0;

        for(int i=0; i<=2000;i+=3){
           ii = i;
        }

        System.out.println("NumerosMultiplos3: " + ii);
    }
}
