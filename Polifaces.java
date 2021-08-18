public class Polifaces {
  public static void main(String[] args) {

    Aracnido 	 superSpider;
    Humano 		doctorPulpo;
    SerVivo 	  criatura;
      
    superSpider		= new Aracnido();
    doctorPulpo		= new Humano();
    
    criatura = superSpider; 		   criatura.comer();    criatura.caminar();  //despliega: "Los aracnidos comen moscas" "Este ser camina con 8 extremidades"
    criatura = doctorPulpo; 		   criatura.comer(); 	criatura.caminar();  //despliega  "Los humanos son omnívoros"   "Este ser camina con 2 extremidades"
    
    SpiderMan 		   peterParker;
    Escalador			trepador;
    
    peterParker  = new SpiderMan();

    //Polimorfismo mediante la interface Escalador:
    trepador = superSpider; 	  	   trepador.trepar(); 	trepador.brincar(); 	//despliega: "Este aracnido trepa paredes" "Este aracnido brinca mueblas" 
    trepador = peterParker; 		   trepador.trepar();   trepador.brincar();    //despliega: "SpiderMan trepa edificios"       "SpiderMan brinca torres" 
    
  }
}

abstract class SerVivo {
  protected  int miembros;

  protected SerVivo(int miembros) {
    this.miembros = miembros;
  }

  public abstract void comer();

  public void caminar() {
    System.out.println("Este ser camina con " + miembros + " extremidades.");
  }

}


interface Escalador {
  public void trepar();
  public void brincar();
}

class Humano extends SerVivo {

  public Humano() {
    super(2);
  }

  public void comer() {
    System.out.println("Los humanos son omnívoros");
  }
  
}


class Aracnido extends SerVivo implements Escalador{

  public Aracnido() {
    super(8);
  }

  public void comer() {
    System.out.println("Los aracnidos comen moscas");
  }
  
  public void trepar(){
  	 System.out.println("Este aracnido trepa paredes");
  }
  
  public void brincar(){
  	 System.out.println("Este aracnido brinca mueblas");
  }
}

class SpiderMan extends Humano implements Escalador{
  
  public void trepar(){
  	 System.out.println("SpiderMan trepa edificios");
  }
  
  public void brincar(){
  	 System.out.println("SpiderMan brinca torres");
  }
	
}



