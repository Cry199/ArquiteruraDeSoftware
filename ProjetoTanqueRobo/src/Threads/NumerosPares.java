package Threads;

public class NumerosPares extends Thread
{
    @Override
    public void run() 
    {
        int ii = 0;

        for(int i=0; i<=2000;i+=2){
           ii = i;
        }

        System.out.println("NumerosPares: " + ii);
    }
}