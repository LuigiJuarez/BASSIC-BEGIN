// The ElastiGirlApp Program

import learning.business.superAnimals.ElasticHuman;
import learning.basicGUI.BaseAppGUI;
import learning.basicGUI.ImagePanel;
import learning.basicGUI.InternalButton;
import learning.basicGUI.FlowPanel;
import java.awt.TextArea;
import java.awt.event.*;

public class ElastiGirlApp extends BaseAppGUI {

        private class WalkButton extends InternalButton{
                public void pushAction(){
                        walkAction();
                }
        }

        private class MouseStretch extends MouseAdapter {
                public void mousePressed(MouseEvent e){
                              superHero.stretch(space, e.getX(), e.getY() );
                }
        }


        private ElasticHuman	superHero;
        private ImagePanel     	space;
        private FlowPanel       	controlPanel;
        private WalkButton      	walkButton;
        private int	      	spaceWidth;
        private int		spaceHeight;


        public void createComponents(){

                super.createComponents();

                superHero 		= new ElasticHuman();
                space		= new ImagePanel();
                controlPanel	= new FlowPanel();
                walkButton		= new WalkButton();
                spaceWidth		= 600;
                spaceHeight	= 600;
        }

        public void distributeComponents(){

                space.imageX	= 0;
                space.imageY	= 0;
                space.addMouseListener(new MouseStretch());
                space.setImage("C:/oops/resources/images/supers/Incredibles/ElastiGirl.jpg", 70,95);
              

                walkButton.setLabel("Walk");

                controlPanel.add(walkButton);


                frameGUI.setTitle("ElastiGirl !!!");
                frameGUI.setSize(spaceWidth, spaceHeight);
                frameGUI.setResizable(false);
                frameGUI.addNorth(controlPanel);
                frameGUI.addCenter(space);
               
        }

        public void startApplication(){

                frameGUI.setVisible(true);

        }

        public void walkAction(){
               superHero.walk(space, spaceWidth, spaceHeight);
        }

        public static void main(String [] args){
                ElastiGirlApp theTest = new ElastiGirlApp();
                theTest.startApplication();
        }

}
