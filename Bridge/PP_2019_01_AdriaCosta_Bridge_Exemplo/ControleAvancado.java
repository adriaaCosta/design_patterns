
/**
 * Escreva a descrição da classe ControleAvancado aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class ControleAvancado extends ControleBasico {

    public ControleAvancado(Dispositivo dispositivo) {
        super.dispositivo = dispositivo;
    }

    public void mute() {
        System.out.println("Controle: mudo");
        dispositivo.setVolume(0);
    }

}
