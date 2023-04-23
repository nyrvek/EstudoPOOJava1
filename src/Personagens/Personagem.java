package Personagens;

public class Personagem {
    private String nome;
    private int vida;
    private boolean estaVivo;
    private int ataque;
    private String arma;
    private int danoArma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getDanoArma() {
        return danoArma;
    }

    public void setDanoArma(int danoArma) {
        this.danoArma = danoArma;
    }

    public void exibirPersonagem(){
        System.out.println("*-*-*-*-*-*-*-*-*-*");
        System.out.printf("Nome: %s\nVida: %d\nVivo: %b\nDano: %d\nArma: %s\nDano da arma: %d\n",
                nome,vida,estaVivo,ataque,arma,danoArma);
        System.out.println("*-*-*-*-*-*-*-*-*-*");
    }

    public void atacar(Personagem causaDano,Personagem recebeDano){
        int dano = causaDano.getAtaque();
        int danoRecebido = recebeDano.getVida();
        danoRecebido -= dano;
        recebeDano.setVida(danoRecebido);
    }
}
