
/**
 * Escreva a descrição da classe Garcom aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Garcom
{
   private PizzaBuilder pizzaBuilder;
   
   public void setPizzaBuilder(PizzaBuilder pb){
       pizzaBuilder = pb;
    }
    
    public PizzaProduct getPizza(){
        return pizzaBuilder.getPizza();
    }
    
    public void constructPizza(){
        pizzaBuilder.criarNovaPizzaProduct();
        pizzaBuilder.buildMassa();
        pizzaBuilder.buildMolho();        
        pizzaBuilder.buildCobertura();
    }
}
