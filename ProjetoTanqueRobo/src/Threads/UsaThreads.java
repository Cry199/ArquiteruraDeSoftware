package Threads;

public class UsaThreads 
{
    public static void main(String[] args) 
    {
        NumerosImpares numerosImpar = new NumerosImpares();
        NumerosPares numerosPares = new NumerosPares();
        NumerosMultiplos3 numerosMult3 = new NumerosMultiplos3();
        numerosImpar.start();
        numerosPares.start();
        numerosMult3.start();        
    }
}
