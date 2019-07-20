
/**
 * Escreva a descrição da interface Device aqui.
 * 
 * @author (seu nome) 
 * @version (número da versão ou data)
 */

public interface Dispositivo { //camada de implementação
    boolean isAtivado();

    void ativado();

    void desativado();

    int getVolume();

    void setVolume(int percentual);

    int getCanal();

    void setCanal(int canal);

    void imprimaStatus();
}