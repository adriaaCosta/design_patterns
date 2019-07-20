
/**
 * Escreva a descrição da classe TigreToy aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TigreToy extends Felino
{
    public TigreToy(){
        correrStrategy = new CorrerToy();
        pularStrategy = new PuloToy();
    }
    
   @Override
    public void display() {
        System.out.println("Tigre de borracha na banheira");
    }

    @Override
    public void rugir() {
        System.out.println("Uen! Uen!");
    }
}
