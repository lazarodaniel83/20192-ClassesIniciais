public class App{
    private void run(){
      //ContaEspecial c = new ContaEspecial("0001-0", 5000);
        ContaCorrente c = new ContaCorrente("0001-0");
        c.depositar(5000);
        System.out.println(c);
        c.sacar(3000);
        System.out.println(c);     
        c.sacar(3000);
        System.out.println(c);          
    }   
    
    
    public static void main(String[] args){
        App app = new App();
        app.run();
    }    

}
