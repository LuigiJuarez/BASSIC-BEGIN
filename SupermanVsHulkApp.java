// The SupermanVsHulkApp Program

import learning.business.superAnimals.Superman;
import learning.business.superAnimals.ElasticHuman;
import learning.basicGUI.BaseAppGUI;
import learning.basicGUI.ImagePanel;
import learning.basicGUI.InternalButton;
import learning.basicGUI.FlowPanel;
import learning.basicGUI.GridPanel;
import java.awt.TextArea;
import java.awt.event.*;

public class SupermanVsHulkApp extends BaseAppGUI {

        private class WalkButton extends InternalButton{
                public void pushAction(){
                        walkAction();
                }
        }

        private class FlyButton extends InternalButton{
                public void pushAction(){
                        flyAction();
                }
        }

        private class MouseStretch extends MouseAdapter {
                public void mousePressed(MouseEvent e){
                              superHero2.stretch(space2, e.getX(), e.getY() );
                }
        }

        private Superman	superHero;
        private ImagePanel     	space;

        private ElasticHuman	superHero2;
        private ImagePanel     	space2;

        private FlowPanel       	controlPanel;
        private WalkButton      	walkButton;
        private FlyButton      	flyButton;
        private int	      	spaceWidth;
        private int		spaceHeight;

        private GridPanel       	gridPanel;
        private int	       	renglones;
        private int 	       	columnas;


        public void createComponents(){

                super.createComponents();

                superHero 		= new Superman();
                space		= new ImagePanel();

                superHero2 		= new ElasticHuman();
                space2		= new ImagePanel();

                controlPanel	= new FlowPanel();
                walkButton		= new WalkButton();
                flyButton		= new FlyButton();

                spaceWidth		= 600;
                spaceHeight	= 600;

                renglones = 1;
                columnas = 2;
                gridPanel 		= new GridPanel(renglones, columnas);

        }

        public void distributeComponents(){

                space.imageX	= 100;
                space.imageY	= 100;
                space.setImage("C:/oops/resources/images/supers/Superman/superman4.jpg", 70,95);
              
                space2.imageX	= 0;
                space2.imageY	= 0;
                space2.addMouseListener(new MouseStretch());
                space2.setImage("C:/oops/resources/images/supers/Marvel/Hulk.jpg", 70,95);

                walkButton.setLabel("Walk");
                flyButton.setLabel("Fly");

                controlPanel.add(walkButton);
                controlPanel.add(flyButton);

                gridPanel.add(space);
                gridPanel.add(space2);

                frameGUI.setTitle("Superman VS Hulk  !!!");
                frameGUI.setSize(spaceWidth, spaceHeight);
                frameGUI.setResizable(false);
                frameGUI.addNorth(controlPanel);
                frameGUI.addCenter(gridPanel);
               
        }

        public void startApplication(){

                frameGUI.setVisible(true);

        }

        public void walkAction(){
               superHero.walk(space, spaceWidth/2, spaceHeight);
               superHero2.walk(space2, spaceWidth/2, spaceHeight);
        }

        public void flyAction(){
                superHero.fly(space, spaceWidth/2, spaceHeight);  
        }

        public static void main(String [] args){
                SupermanVsHulkApp theTest = new SupermanVsHulkApp();
                theTest.startApplication();
        }

}
