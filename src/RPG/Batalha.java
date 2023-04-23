package RPG;

import Personagens.Heroi;
import Personagens.Inimigo;
import Personagens.Personagem;

public class Batalha {

    public void Batalha(Heroi heroi, Inimigo inimigo){
        boolean batalha = true;
        while (batalha == true){
        if((heroi.getVida() > 0) || (inimigo.getVida() >0)){
            heroi.atacar(heroi,inimigo);
            inimigo.atacar(inimigo,heroi);
            if(heroi.getVida()<=0){
                System.out.println("Você foi morto por um: " + inimigo);
                System.exit(0);
            } else if (inimigo.getVida()<=0) {
                System.out.println("Você venceu a batalha contra: " + inimigo.getNome());
                break;
            }
        }
        }
    }
}
