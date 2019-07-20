
/**
 * Escreva a descrição da classe FabricaModerna aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class FabricaModerna implements FabricaMoveis
{
  @Override
    public Cadeira criarCadeira(){
        return new CadModerna();
    }
    
    @Override
    public Mesa criarMesa(){
        return new MesaModerna();
    }
}