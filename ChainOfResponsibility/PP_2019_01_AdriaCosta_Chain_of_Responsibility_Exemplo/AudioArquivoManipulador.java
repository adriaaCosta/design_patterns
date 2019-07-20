public class AudioArquivoManipulador implements Manipulador {
 
    //Implementa a interface Manipulador e sobrescreve seus 3 metodos
    // possui uma referencia pra o proximo manipulador da cadeia
    
    private Manipulador manipulador;
    private String manipuladorNome;
 
    public AudioArquivoManipulador(){
        this.manipuladorNome = "Audio";
    }
 
    @Override
    public void setManipulador(Manipulador manipulador) {
        this.manipulador = manipulador;
    }
 
    // metodo process: processa ou encaminha para o proximo manipulador
    @Override
    public void processamento(Arquivo arquivo) {
 
        if(arquivo.getTipoArq().equals("audio")){
            System.out.println("Processando e salvando seu ARQUIVO AUDIO... by "+manipuladorNome);
                        System.out.println("/n-------------------------");
        }else if(manipulador!=null){
            System.out.println(manipuladorNome+" encaminhando requisição para "+manipulador.getManipuladorNome());
            manipulador.processamento(arquivo); 
        }else{
            System.out.println("Arquivo não suportado");
        }
 
    }
 
    @Override
    public String getManipuladorNome() {
        return manipuladorNome;
    }
}