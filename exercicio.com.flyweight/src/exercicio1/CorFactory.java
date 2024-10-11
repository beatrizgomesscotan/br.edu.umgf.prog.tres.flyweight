package exercicio1;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {

    //Map é a interface
    //HashMao() implementa a interface
    private static Map<String, Cor> map = new  HashMap<>();

    public static Cor getCor(String nome){

        Cor corFlyweight = map.get(nome);

        if (corFlyweight != null) {
            return corFlyweight;
        }else {
            corFlyweight = new Cor(nome);
            map.put(nome,corFlyweight);// aqui estou adicionando minha nova cor no map (preciso por minha PK NOME, e objeto corFlyweight que está meu valor)
            return corFlyweight;
        }
    }


}
