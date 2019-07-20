
/**
 * Escreva a descrição da classe PicantePizzaBuilder aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class PicantePizzaBuilder extends PizzaBuilder
{
    public void buildMassa() {
        pizza.setMassa("Massa Pan");
    }

    public void buildMolho() {
        pizza.setMolho("Molho de Tomate + Pimenta");
    }

    public void buildCobertura() {
        pizza.setCobertura("Pepperoni + Salame");
    }
}
