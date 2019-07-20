
/**
 * Escreva a descrição da classe MarioCapa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MarioCapa implements MarioState
{
      @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
 
    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com fogo");
        return new MarioFogo();
    }
 
    @Override
    public MarioState pegarPena() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
 
    @Override
    public MarioState levarDano() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }
 
}
