

class BancoDados {
    private static BancoDados instance;

    private BancoDados() { }  
    
    public static synchronized BancoDados getInstance(){ 

        if (instance == null){ //verificação se há alguma outra instancia
                instance = new BancoDados(); 
        }
        
        return instance;
    }
    
    public void query(){
        System.out.println("Lógica de negocio");
    }
}