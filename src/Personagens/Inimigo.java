package Personagens;

public class Inimigo extends Heroi{

    private String Nome;
    private int Vida;
    private boolean EstaVivo;
    private int Ataque;
    private String Arma;
    private int DanoArma;


    public Inimigo(String Nome,int Vida, boolean EstaVivo, int Ataque,
                 String Arma,int DanoArma) {
        this.Nome = Nome;
        this.Vida = Vida;
        this.EstaVivo = EstaVivo;
        this.Ataque = Ataque;
        this.Arma = Arma;
        this.DanoArma = DanoArma;
    }

}
