import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelPantalla extends JPanel{

private FichaCabra fichaCabra;
private FichaTigre fichaTigre;
//private Color color;

public PanelPantalla()
{
  super();
  
}
   public void setControlador(MouseListener manejador){
     
     addMouseListener(manejador);
   }


public void setTigre(FichaTigre fichaTigre)
{
   this.fichaTigre=fichaTigre;
}

public void setCabra(FichaCabra fichaCabra)
{
  this.fichaCabra=fichaCabra;
}

public void paint(Graphics g)
{
   super.paint(g);
   //ovalo.dibujar(g);

}

}//fin de class
