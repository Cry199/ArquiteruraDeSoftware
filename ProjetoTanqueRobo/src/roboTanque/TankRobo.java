package roboTanque;

public class TankRobo implements Posicao, Cor, Canhao{

    private int x, y;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private String nome;

    public TankRobo(){
    }

    public TankRobo (int x, int y, CoresRGB corTanque, CoresRGB corCanhao, String nome){
        this.x = x;
        this.y = y;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.nome = nome;
    }

    @Override
    public void atirar() {
       for(int i = 1; i <=5; i++){
        System.out.println("A BALA TA COMENDO");
       }
    }

    @Override
    public void atirar(long cadencia) 
    {
        for(int i = 1; i <=5; i++){
            esperar(cadencia * 1000);
            System.out.println("A BALA TA COMENDO");
        }
    }

    private void esperar(long cadencia)
    {
        try 
        {
            if(cadencia> 5000)
            {
                throw new IllegalArgumentException("Cadencia muito alta");
            }

            Thread.sleep(cadencia);
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
      this.corTanque = corTanque;
    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
       return corCanhao;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
       x--;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "\nPosição: (" + x + ", " + y + ")\nCor do Tanque: " + corTanque + "\nCor do Canhão: " + corCanhao;
    }
}
