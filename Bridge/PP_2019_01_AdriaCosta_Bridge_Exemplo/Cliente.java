
/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cliente
{
        
    public static void testDispositivo(Dispositivo dispositivo) {
        System.out.println("Teste com Controle básico.");
        ControleBasico controleBasico = new ControleBasico(dispositivo);
        controleBasico.power();
        dispositivo.imprimaStatus();

        System.out.println("Teste com Controle Avançado.");
        ControleAvancado controleAvancado = new ControleAvancado(dispositivo);
        controleAvancado.power();
        controleAvancado.mute();
        dispositivo.imprimaStatus();
    }
}
