public class ExcelArquivoManipulador implements Manipulador{
 
    //Implementa a interface Handler e sobrescreve seus 3 metodos
    // possui uma referencia pra o proximo manipulador da cadeia
    // metodo process: processa ou encaminha para o proximo manipulador
    
    private Manipulador manipulador;
    private String manipuladorNome;
 
    public ExcelArquivoManipulador(){
        this.manipuladorNome = "Excel";
    }
 
    @Override
    public void setManipulador(Manipulador manipulador) {
        this.manipulador = manipulador;
    }
 
    @Override
    public void processamento(Arquivo arquivo) {
 
        if(arquivo.getTipoArq().equals("excel")){
            System.out.println("Processando e salvando seu ARQUIVO EXCEL... by "+manipuladorNome);
                        System.out.println("/n-------------------------");
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