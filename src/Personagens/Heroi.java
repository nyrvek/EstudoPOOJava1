package Personagens;

public class Heroi {
    private String Nome;
    private int Vida;
    private boolean EstaVivo;
    private int Ataque;
    private String Arma;
    private int DanoArma;


    public Heroi(String Nome,int Vida, boolean EstaVivo, int Ataque,
                 String Arma,int DanoArma) {
        this.Nome = Nome;
        this.Vida = Vida;
        this.EstaVivo = EstaVivo;
        this.Ataque = Ataque;
        this.Arma = Arma;
        this.DanoArma = DanoArma;
    }
    public Heroi(){}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public boolean isEstaVivo() {
        return EstaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        EstaVivo = estaVivo;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String arma) {
        Arma = arma;
    }

    public int getDanoArma() {
        return DanoArma;
    }

    public void setDanoArma(int danoArma) {
        DanoArma = danoArma;
    }

    public void ExibirPersonagem(){
        System.out.println("*-*-*-*-*-*-*-*-*-*");
        System.out.printf("Nome: %s\nVida: %d\nVivo: %b\nDano: %d\nArma: %s\nDano da arma: %d\n",
        Nome,Vida,EstaVivo,Ataque,Arma,DanoArma);
        System.out.println("*-*-*-*-*-*-*-*-*-*");
    }

    public void Batalha(Heroi heroi,Heroi inimigo){

    }
}
