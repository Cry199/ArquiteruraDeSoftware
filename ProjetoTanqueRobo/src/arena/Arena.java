package arena;

import roboTanque.CoresRGB;
import roboTanque.TankRobo;

public class Arena 
{
    public static void main(String[] args) 
    {
        TankRobo robo1 = new TankRobo(0, 0, CoresRGB.BLUE, CoresRGB.RED, "Robo1");
        
        robo1.movNorte();
        robo1.movLeste();
    
        System.out.println(robo1);
    }
}
