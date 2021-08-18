public class PoliHerencia {
  public static void main(String[] args) {

    Aracnido 	 superSpider;
    Humano 		doctorPulpo;
    SerVivo 	  criatura; //super refererncia: sirve como un nombre genérico
      
    superSpider		= new Aracnido();
    doctorPulpo		= new Humano();
    
    //Polimorfismo debido a la Herencia entre clases:
    criatura = superSpider; 		   criatura.comer();    criatura.caminar();  //despliega: "Los aracnidos comen moscas" "Este ser camina con 8 extremidades"
    criatura = doctorPulpo; 		   criatura.comer(); 	criatura.caminar();  //despliega  "Los humanos son omnívoros"   "Este ser camina con 2 extremidades"
    
  }
}

abstract class SerVivo {  
  protected int miembros;

  protected SerVivo(int miembros) {
    this.miembros = miembros;
  }

  public abstract void comer();  

  public void caminar() {
    System.out.println("Este ser camina con " + miembros + " extremidades.");
  }

}
 
class Humano extends SerVivo {

  public Humano() {
    super(2); //Invocación al constructor de la súper clase 
  }

  public void comer() { //Esta es la implementación del método abstracto comer de la súper clase
    System.out.println("Los humanos son omnívoros");
  }
  
}


class Aracnido extends SerVivo{

  public Aracnido() {
    super(8); //Invocación al constructor de la súper clase 
  }

  public void comer() {//Esta es la implementación del método abstracto comer de la súper clase
    System.out.println("Los aracnidos comen moscas");
  }
   
}

 