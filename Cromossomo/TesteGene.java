public class TesteGene{
    public void run(){
        
        Cromossomo c1 = new Cromossomo("02468642024680");
        Cromossomo c2 = new Cromossomo("135797531");  
        
        
        System.out.println(c1.getSimilaridade(c2));
        System.out.println(c2.getSimilaridade(c1));        
        
        System.out.println(c1); 
        System.out.println(c2); 
        
        c1.singlePointCrossover(3, c2);
        
        System.out.println(c1); 
        System.out.println(c2); 
        
        
    }    
}
