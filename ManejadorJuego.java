import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
//import java.awt.Color;

public class ManejadorJuego implements MouseListener{

   //private Ovalo ovalo;
   private FichaCabra fichaCabra;
   private FichaTigre fichaTigre;
   private PanelPantalla panelPantalla;
 
   
   public ManejadorJuego(FichaCabra fichaCabra,FichaTigre fichaTigre,PanelPantalla panelPantalla )
   {
     this.fichaTigre=fichaTigre;
     this.fichaCabra=fichaCabra;
     this.panelPantalla=panelPantalla; 
   }
   
   public void mouseReleased(MouseEvent evento){

}
public void mousePressed(MouseEvent evento) {

}
public void mouseExited(MouseEvent evento) {

}
public void mouseEntered(MouseEvent evento) {

}
public void mouseClicked(MouseEvent evento) {
  fichaTigre.setX(evento.getX());
  fichaTigre.setY(evento.getY());
  fichaCabra.setX(evento.getX());
  fichaCabra.setY(evento.getY());
  //int rojo=1+(int)(Math.random()*255);
  //int verde=1+(int)(Math.random()*255);
  //int azul=1+(int)(Math.random()*255);
  //Color color=new Color(rojo,verde,azul);
  //ovalo.setColor(color);
  panelPantalla.repaint();
  
}

}//fin de class
