 class TestCarreras {
  public static void main(String args[]) {
    Caballo caballo1 = new Caballo("Silver");
    caballo1.carrera();
    Caballo caballo2 = new Caballo("Pinto");
    caballo2.carrera();
    Caballo caballo3 = new Caballo("Tornado");
    caballo3.carrera();
  }
}

class Caballo{
	
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
  
  
  
}
