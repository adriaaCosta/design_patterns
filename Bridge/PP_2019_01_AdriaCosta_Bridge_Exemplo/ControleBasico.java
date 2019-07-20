
/**
 * Escreva a descrição da classe ControleBasico aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class ControleBasico implements Controle {

    protected Dispositivo dispositivo; // referencia ao dispositivo

    public ControleBasico() {}

    public ControleBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void power() {
        System.out.println("Controle: botão power pressionado");
        if (dispositivo.isAtivado()) {
            dispositivo.desativado();
        } else {
            dispositivo.ativado();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Controle: volume down");
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Controle: volume up");
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Controle: canal down");
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Controle: canal up");
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }
}
