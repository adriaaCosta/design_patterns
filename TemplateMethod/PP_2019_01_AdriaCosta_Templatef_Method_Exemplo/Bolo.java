
/**
 * Classe abstrata Bolo - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Bolo {
  
      public void fazerBolo(){
            separaIngredientes();
            preparaMassa();
            assaBolo();
            System.out.println("Servindo o bolo");
      }
      public abstract void assaBolo();
      public abstract void preparaMassa();
      public abstract void separaIngredientes();
}