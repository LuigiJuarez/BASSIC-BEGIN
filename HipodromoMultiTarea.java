 class TestCarreras {
  public static void main(String args[]) {
    Caballo caballo1 = new Caballo("Silver");
    Thread t1 = new Thread(caballo1);
    t1.start(); 
    Caballo caballo2 = new Caballo("Rayo");
    Thread t2 = new Thread(caballo2);
    t2.start();
    Caballo caballo3 = new Caballo("Arabela");
    Thread t3 = new Thread(caballo3);
    t3.start();
  }
}

class Caballo implements Runnable{
	
  String nombre;
  int metrosRecorridos;
    
  public Caballo(String n){
  	nombre = n;
  }
  public void carrera() {
    metrosRecorridos = 0;

    while (true) {
      System.out.println("Caballo " + nombre + " -> " + metrosRecorridos + " metros");
      if ( metrosRecorridos++ == 50 ) {
		break;
      }
    }
  }
  
  public void run(){  this.carrera(); }

}
