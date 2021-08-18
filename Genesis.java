import java.awt.*;
import java.awt.event.*;

public class Genesis {

  private TextArea escritorio;
  private Button controlPersonas;
  private Button controlSalida;
  
  private Humano padre;
  private Humano madre;
  private Humano hija;
  
  private int cuenta; 

  public Genesis() {
       escritorio = new TextArea(10,50);
       controlPersonas = new Button("Oprimeme");
       controlSalida = new Button("Salir");
           
       padre = new Humano("Bruce Wayne", "castaño", "negros");
       madre = new Humano("Selina Kyle", "rubio", "azules");
       hija = madre.concebir(padre,"Helena Wayne");
       
       Escritor escribiente = new Escritor();
       controlPersonas.addActionListener(escribiente);
       
       controlSalida.addActionListener(
	      	new ActionListener() {
		  			public void actionPerformed(ActionEvent e) {
		  						System.exit(0);
		  			}
	      	}
       );
         
  }

  public void desplegar() {
    Panel tablero = new Panel(); 
    tablero.add(controlPersonas);
    tablero.add(controlSalida);
    
    BorderLayout formato;
    
    Frame ventana = new Frame("Programa Genesis");
    ventana.setLayout(formato = new BorderLayout());
    ventana.add(escritorio,BorderLayout.WEST);
    ventana.add(tablero,BorderLayout.CENTER);
    ventana.addWindowListener(new Portero());
    ventana.setSize(500,210);
    ventana.setVisible(true);
  }

  private void escribir(int cuenta) {
    if (cuenta == 1) {
        escritorio.setText("Padre de " + padre.perfil()+ "\n\n");
    } else if (cuenta == 2) {
        escritorio.append("Madre de " + madre.perfil() + "\n\n");
    } else if (cuenta == 3) { 
       escritorio.append("Hija de "  + hija.perfil()+ "\n\n");
    }
  }

  private class Escritor implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if ( (++cuenta) > 3){
      	cuenta = 1;
      }
      escribir(cuenta);
    }
  }

  private class Portero extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }
    
  public static void main(String[] args) {
    Genesis x = new Genesis();
    x.desplegar();
  }
}

class Humano{
  private String nombre;
  private String cabello;
  private String ojos;

  public Humano(String nombre, String cabello, String ojos){
      this.nombre = nombre;
      this.ojos = ojos;
      this.cabello = cabello;
  }
  public Humano(Humano ella, Humano el, String nombre){
      this.nombre = nombre;
      this.cabello = ella.cabello;
      this.ojos = el.ojos;
  }
  public String perfil(){
      return "Nombre: "+nombre+" Ojos: "+ojos+" Cabello: "+cabello;
  }
  public Humano concebir(Humano conyuge, String nombreHijo){
      Humano nuevoSer = new Humano(this, conyuge, nombreHijo);
      return nuevoSer;
  }
}



