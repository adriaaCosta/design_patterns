public class Arquivo {
    
    // essa classe cria objetos de arquivos que contêm o nome, o tipo e caminho do arquivo
    //tipo do arquivo: usado pelo HANDLER para verificar se o arquivo pode ser manipulado por eles ou nao
    // se puder, vai ser processado e salvo ou encaminhar pra o proximo
    private final String nomeArq;
    private final String tipoArq;
    private final String caminhoArq;
 
    public Arquivo(String nomeArq, String tipoArq, String caminhoArq){
        this.nomeArq = nomeArq;
        this.tipoArq = tipoArq;
        this.caminhoArq = caminhoArq;
    }
   // public Arquivo(){}
 
    public String getNomeArq() {
        return nomeArq;
    }
 
    public String getTipoArq() {
        return tipoArq;
    }
 
    public String getCaminhoArq() {
        return caminhoArq;
    }
 
}
