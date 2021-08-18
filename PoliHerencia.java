public class PoliHerencia {
  public static void main(String[] args) {

    Aracnido 	 superSpider;
    Humano 		doctorPulpo;
    SerVivo 	  criatura; //super refererncia: sirve como un nombre gen�rico
      
    superSpider		= new Aracnido();
    doctorPulpo		= new Humano();
    
    //Polimorfismo debido a la Herencia entre clases:
    criatura = superSpider; 		   criatura.comer();    criatura.caminar();  //despliega: "Los aracnidos comen moscas" "Este ser camina con 8 extremidades"
    criatura = doctorPulpo; 		   criatura.comer(); 	criatura.caminar();  //despliega  "Los humanos son omn�voros"   "Este ser camina con 2 extremidades"
    
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
    super(2); //Invocaci�n al constructor de la s�per clase 
  }

  public void comer() { //Esta es la implementaci�n del m�todo abstracto comer de la s�per clase
    System.out.println("Los humanos son omn�voros");
  }
  
}


class Aracnido extends SerVivo{

  public Aracnido() {
    super(8); //Invocaci�n al constructor de la s�per clase 
  }

  public void comer() {//Esta es la implementaci�n del m�todo abstracto comer de la s�per clase
    System.out.println("Los aracnidos comen moscas");
  }
   
}

 