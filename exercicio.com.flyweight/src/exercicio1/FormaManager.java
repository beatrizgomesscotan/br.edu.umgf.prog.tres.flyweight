package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas;

    public FormaManager() {
        this.formas = new ArrayList<>();
    }

    public void addForma(String nomeCor, String posicao, int tamanho){
        Cor cor = CorFactory.getCor(nomeCor);
        formas.add(new Forma(cor,posicao,tamanho));
    }

    public void apresetar(){
        for(Forma formaAux : formas){
            System.out.println(formaAux.toString());
        }
    }

}
