
/**
 * Classe abstrata PizzaBuilder - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class PizzaBuilder
{
    protected PizzaProduct pizza;
    
    public PizzaProduct getPizza(){
        return pizza;
    }
    public void criarNovaPizzaProduct(){
        pizza = new PizzaProduct();
    }
    public abstract void buildMassa();
    public abstract void buildMolho();
    public abstract void buildCobertura();
    
}
