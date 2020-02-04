public class App{
    
    public void run(){
        ContaCorrente conta = new ContaCorrente();
        ContaEspecial contaEsp = new ContaEspecial();
        contaEsp.setLimite(10000);
        
        System.out.println(conta.getSaldo());
        conta.depositar(1000);
        conta.sacar(1500);
        System.out.println(conta.getSaldo());
        System.out.println("*********************");
        System.out.println(contaEsp.getSaldo());
        contaEsp.depositar(1000);
        contaEsp.sacar(1500);
        System.out.println(contaEsp.getSaldo());        
    }    

}
