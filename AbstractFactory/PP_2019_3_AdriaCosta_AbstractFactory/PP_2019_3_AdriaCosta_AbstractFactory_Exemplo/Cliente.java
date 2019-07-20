
/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cliente
{
    private Cadeira cadeira;
    private Mesa mesa;
    
    public Cliente(FabricaMoveis fabrica) {
        cadeira = fabrica.criarCadeira();
        mesa = fabrica.criarMesa();
    }

    public void montar() {
        cadeira.montar();
        mesa.montar();
    }
}
