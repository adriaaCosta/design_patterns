
/**
 * Escreva a descrição da classe CalabresaPizzaBuilder aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
class CalabresaPizzaBuilder extends PizzaBuilder
{
     public void buildMassa() {
        pizza.setMassa("Massa Comum");
    }

    public void buildMolho() {
        pizza.setMolho("Molho de Tomate");
    }

    public void buildCobertura() {
        pizza.setCobertura("Calabresa+Muçarela");
    }
}
