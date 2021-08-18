import learning.business.inventos.Inventor;
import learning.business.inventos.Invento;
import learning.basicGUI.FastTester;
	
public class TestInventores extends FastTester{

	public void testAction(){

		Inventor leonardo = new Inventor();
		leonardo.setNombre("Leonardo Da Vinci");
		leonardo.setInventos( new Invento[ 3 ] );

		for (int i = 0; i < 3; i++){
			leonardo.setInvento( new Invento(), i );
			if ( i == 0) {
				leonardo.getInvento( i ).setNombre("Helicoptero");
			} else if ( i == 1) {
				leonardo.getInvento( i ).setNombre("Submarino");
			} else if ( i == 2) {
				leonardo.getInvento( i ).setNombre("Paracaidas");
			}
		}
		
		String reporte = new String("El inventor: ");
		reporte = reporte + leonardo.getNombre() + "\n";
		
		reporte = reporte + "Invento las siguientes maquinas: \n";

		for (int i = 0; i < 3; i++){
			reporte = reporte + leonardo.getInvento( i ).getNombre() + "\n";
		}		

		textAreaGUI.append(reporte);
		System.out.print(reporte);
	}

	public static void main(String [] args){
		TestInventores tester = new TestInventores();
		tester.startApplication();
   	}
}
