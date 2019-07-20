
/**
 * Escreva a descrição da classe Radio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class Radio implements Dispositivo {
    private boolean ligado = false;
    private int volume = 30;
    private int canal = 1;

    @Override
    public boolean isAtivado() {
        return ligado;
    }

    @Override
    public void ativado() {
        ligado = true;
    }

    @Override
    public void desativado() {
        ligado = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimaStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Sou o Radio.");
        System.out.println("| Estou " + (ligado ? "ativado" : "desativado"));
        System.out.println("| Volume " + volume + "%");
        System.out.println("| Canal " + canal);
        System.out.println("------------------------------------\n");
    }
}
