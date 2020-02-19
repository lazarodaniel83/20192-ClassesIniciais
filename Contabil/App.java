public class App{
    
    private void run(){
        RegistroContabil rc = new RegistroContabil("ACME", "000.000.000/0000-00");
        rc.registrarFato(2, "Compra Predio Sede", "CAIXA", "IMOVEIS", 3000);        
        rc.registrarFato(1, "Integralização de Capital", "CAPITAL SOCIAL", "CAIXA", 10000);
        System.out.println(rc);
    }    
    
    
    public static void main(String[] args){
        App app = new App();
        app.run();
    }    
}
