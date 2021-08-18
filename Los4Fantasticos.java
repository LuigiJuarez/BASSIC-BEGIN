// Los 4 FantasticosApp Program

import learning.business.superAnimals.Superman;
import learning.business.superAnimals.ElasticHuman;
import learning.basicGUI.BaseAppGUI;
import learning.basicGUI.ImagePanel;
import learning.basicGUI.InternalButton;
import learning.basicGUI.FlowPanel;
import learning.basicGUI.GridPanel;
import java.awt.TextArea;
import java.awt.event.*;

public class Los4Fantasticos extends BaseAppGUI {

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
         private class StrechButton extends InternalButton{
                public void pushAction(){
                       superHero.stretch(space, 200, 250 ); 
                }
        }

         private boolean visibleFlag = false;
         private class VisibleButton extends InternalButton{
                public void pushAction(){
                        //flyAction();
                        visibleFlag = !visibleFlag;
                        space2.setVisible(visibleFlag);
                }
        }

        private class MouseStretch extends MouseAdapter {
                public void mousePressed(MouseEvent e){
                              superHero.stretch(space, e.getX(), e.getY() );
                }
        }

        private ElasticHuman	superHero;
        private ImagePanel     	space;

        private ElasticHuman	superHero2;
        private ImagePanel     	space2;
        
        private Superman	superHero3;
        private ImagePanel     	space3;

        private ElasticHuman	superHero4;
        private ImagePanel     	space4;

        private FlowPanel       controlPanel;
        
        private WalkButton      walkButton;
        private FlyButton      	flyButton;
        private StrechButton    strechButton;
        private VisibleButton   visibleButton;
        
        private int	      	spaceWidth;
        private int		spaceHeight;

        private GridPanel       	gridPanel;
        private int	       	renglones;
        private int 	       	columnas;


        public void createComponents(){

                super.createComponents();

                superHero 	= new ElasticHuman();
                space		= new ImagePanel();

                superHero2 	= new ElasticHuman();
                space2		= new ImagePanel();
                
                superHero3 	= new Superman();
                space3		= new ImagePanel();

                superHero4 	= new ElasticHuman();
                space4		= new ImagePanel();

                controlPanel	= new FlowPanel();
                
                walkButton		= new WalkButton();
                flyButton		= new FlyButton();
                strechButton		= new StrechButton();
                visibleButton		= new VisibleButton();

                spaceWidth		= 600;
                spaceHeight	= 600;

                renglones = 2;
                columnas = 2;
                gridPanel 		= new GridPanel(renglones, columnas);

        }

        public void distributeComponents(){

                space.imageX	= 0;
                space.imageY	= 0;
                space.addMouseListener(new MouseStretch());
                space.setImage("C:/oops/resources/images/supers/Fantastic4/Reed Richards.jpg", 200,250);
              
                space2.imageX	= 0;
                space2.imageY	= 0;
                space2.setImage("C:/oops/resources/images/supers/Fantastic4/Sue Storm.jpg", 200,250);
                
                space3.imageX	= 0;
                space3.imageY	= 0;
                space3.setImage("C:/oops/resources/images/supers/Fantastic4/Jhonny Storm.jpg", 200,250);
              
                space4.imageX	= 0;
                space4.imageY	= 0;
                space4.setImage("C:/oops/resources/images/supers/Fantastic4/Ben Grimm.jpg", 200,250);

                walkButton.setLabel("<Walk>");
                flyButton.setLabel("<Fly>");
                strechButton.setLabel("<Strech>");
                visibleButton.setLabel("<Visible>");

                controlPanel.add(strechButton);
                controlPanel.add(visibleButton);
                controlPanel.add(flyButton);
                controlPanel.add(walkButton);

                gridPanel.add(space);
                gridPanel.add(space2);                
                gridPanel.add(space3);
                gridPanel.add(space4);

                frameGUI.setTitle("Los 4 Fantasticos  !!!");
                frameGUI.setSize(spaceWidth, spaceHeight);
                frameGUI.setResizable(false);
                frameGUI.addNorth(controlPanel);
                frameGUI.addCenter(gridPanel);
               
        }

        public void startApplication(){

                frameGUI.setVisible(true);

        }

        public void walkAction(){
               //superHero.walk(space, spaceWidth/2, spaceHeight);
               superHero4.walk(space4, spaceWidth/2, spaceHeight);
        }

        public void flyAction(){
                superHero3.fly(space3, spaceWidth/2, spaceHeight);  
        }

        public static void main(String [] args){
                Los4Fantasticos theTest = new Los4Fantasticos();
                theTest.startApplication();
        }

}
  