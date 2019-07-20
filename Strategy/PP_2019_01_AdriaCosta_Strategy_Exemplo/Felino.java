
/**
 * Classe abstrata Felino - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
abstract public class Felino{
    protected CorrerStrategy correrStrategy; //campo Strategy
    protected PularStrategy pularStrategy;

    abstract public void display();
    abstract public void rugir();
    
    public void setCorrerStrategy (CorrerStrategy correrStrategy){
        this.correrStrategy = correrStrategy;
    }
    
     public void performarCorrer(){
        correrStrategy.correr();

    }

    public void setPularStrategy (PularStrategy pularStrategy){
        this.pularStrategy = pularStrategy;
    }

    public void performarPular(){
        pularStrategy.pular();
    }
   

}