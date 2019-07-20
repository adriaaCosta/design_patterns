






  //Implementa a interface Handler e sobrescreve seus 3 metodos
    // possui uma referencia pra o proximo manipulador da cadeia
    // metodo process: processa ou encaminha para o proximo manipulador
    
    public class DocArquivoManipulador implements Manipulador{
    private Manipulador manipulador;
    private String manipuladorNome;
 
    public DocArquivoManipulador(){
        this.manipuladorNome = "Doc";
    }
 
    @Override
    public void setManipulador(Manipulador manipulador) {
        this.manipulador = manipulador;
    }
 
    @Override
    public void processamento(Arquivo arquivo) {
 
        if(arquivo.getTipoArq().equals("doc")){
            System.out.println("Processando e salvando seu ARQUIVO DOC... by "+manipuladorNome);
                        System.out.println("-------------------------");
        }else if(manipulador!=null){
            System.out.println(manipuladorNome+" encaminhando requisição para "+manipulador.getManipuladorNome());
            manipulador.processamento(arquivo);

        }else{
            System.out.println("Arquivo não suportado/n-------------------------");
        }
 
    }
 
    @Override
    public String getManipuladorNome() {
        return manipuladorNome;
    }
 
}