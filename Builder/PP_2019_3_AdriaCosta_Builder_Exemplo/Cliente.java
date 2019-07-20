
/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */


public class Cliente {
    Garcom garcom = new Garcom();
    
    PizzaBuilder pizzaCalabresa = new CalabresaPizzaBuilder();
    PizzaBuilder pizzaPicante = new PicantePizzaBuilder();
    
    public PizzaProduct escolher(PizzaBuilder pizzaB){
        garcom.setPizzaBuilder(pizzaB);
        garcom.constructPizza();
        return garcom.getPizza();
    }
    


}

