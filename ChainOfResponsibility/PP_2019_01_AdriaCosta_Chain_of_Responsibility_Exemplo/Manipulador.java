public interface Manipulador {
 
    public void setManipulador(Manipulador manipulador); //define o proximo manipulador da cadeira
    public void processamento(Arquivo arquivo); //usado para processar a solicitação, somente se o manipulador puder processar a solicitacao
    public String getManipuladorNome(); //opcionalmente ~ usado para retornar o nome do manipulador
}