
/**
 * Escreva a descrição da classe FabricaClassica aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class FabricaClassica implements FabricaMoveis
{
    @Override
    public Cadeira criarCadeira(){
        return new CadClassica();
    }
    
    @Override
    public Mesa criarMesa(){
        return new MesaClassica();
    }
}
