public class TesteGene{
    public void run(){
        
        Cromossomo c1 = new Cromossomo("02468642024680");
        Cromossomo c2 = new Cromossomo("135797531");  
        Cromossomo c3 = new Cromossomo(); 
        
        
        for(int i = 9; i >= 0; i--)
            c3.adicionarGene(new Gene(i));
        c3.adicionarGene(null);    
        
        
        
        System.out.println(c1.getSimilaridade(c2));
        System.out.println(c2.getSimilaridade(c1));        
        
        System.out.println("C1:" + c1); 
        System.out.println("C2:" + c2); 
        System.out.println("C3:" + c3); 
        
        c1.singlePointCrossover(3, c2);
        
        System.out.println(c1); 
        System.out.println(c2); 
        
        
    }    
}
