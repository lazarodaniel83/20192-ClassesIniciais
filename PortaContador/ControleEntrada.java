class ControleEntrada{
    Porta porta = new Porta(false);
    ContadorVolta contador = new ContadorVolta();
    
    void abrir(){
        if(!porta.isAberta())
          contador.contar();
        porta.abrir();  
    };
    
    
    void fechar(){
        porta.fechar();
    };
    
    void reset(){
        porta.fechar();
        contador.zerar();
    };    
    
    int buscarQtdeAberturas(){
        return contador.buscarValor();
    };    
    
}
