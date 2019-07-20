
/**
 * Escreva a descrição da classe Mario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Mario
{
    protected MarioState estado; //objeto estado
    public Mario() {
        estado = new MarioPequeno(); //estado inicial - 
        //atualizado de acordo com a troca de estado
    }

    //operacoes de mudança de estado
    public void pegarCogumelo() {
        estado = estado.pegarCogumelo();
    }

    public void pegarFlor() {
        estado = estado.pegarFlor();
    }

    public void pegarPena() {
        estado = estado.pegarPena();
    }

    public void levarDano() {
        estado = estado.levarDano();
    }
}
