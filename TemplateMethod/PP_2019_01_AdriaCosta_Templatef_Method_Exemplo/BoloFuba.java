
/**
 * Escreva a descrição da classe BoloFuba aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class BoloFuba extends Bolo{
      @Override
      public void separaIngredientes() {
        System.out.println("*Separa Ingredientes*");
        System.out.println("separando farinha");
        System.out.println("separando ovos");
        System.out.println("separando manteiga");
        System.out.println("separando leite");
        System.out.println("separando fubá");
    
      }
      
      @Override
      public void preparaMassa() {
        System.out.println("*Prepara Massa*");  
        System.out.println("Preparando a massa do bolo de fubá....");
      }
  
      @Override
      public void assaBolo() {
            System.out.println("*Assa Bolo*"); 
            System.out.println("Assando o bolo em 180 °C, preaquecido por 30 minutos");
      }
}
