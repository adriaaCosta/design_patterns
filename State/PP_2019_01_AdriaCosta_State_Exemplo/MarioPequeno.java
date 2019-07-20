
/**
 * Escreva a descrição da classe MarioPequeno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MarioPequeno implements MarioState
{   
    //implementação das operações de mudança de estado que ocorrerão
    @Override
    public MarioState pegarCogumelo(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    
    @Override
    public MarioState pegarFlor(){
        System.out.println("Mario Fogo");
        return new MarioFogo();
    }
    
    @Override
    public MarioState pegarPena(){
        System.out.println("Mario Capa");
        return new MarioCapa();
    }
    @Override
    public MarioState levarDano(){
        System.out.println("Mario Morto");
        return new MarioMorto();
    }
}
