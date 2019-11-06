class ControleEntrada{
    Porta porta = new Porta();
    ContadorVolta contador = new ContadorVolta();
    
    void abrir(){
        if(!porta.estaAberta())
          contador.contar();
        porta.abrir();  
    };
    
    
    void fechar(){
        porta.fechar();
    };
    
    int buscarQtdeAberturas(){
        return contador.buscarValor();
    };    
    
}
