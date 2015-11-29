import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Graphics;

public class GUIJuego extends JFrame{

private FichaCabra fichaCabra;
private FichaTigre fichaTigre;
private PanelPantalla panelPantalla;
 

  public GUIJuego()
  {
    super("Bagh Chal");
    initComponents();
    //fichaCabra=new FichaCabra(icono, 4, 6);
    //fichaCabra.fichaCabra.setIconoCabra(new ImageIcon("imagen1.JPG"));
    //fichaTigre=new FichaTigre();
    ManejadorJuego manejador= new ManejadorJuego(fichaCabra, fichaTigre,panelPantalla);
    panelPantalla.setControlador(manejador);
    panelPantalla.setCabra(fichaCabra);
    panelPantalla.setTigre(fichaTigre);
  }
  
  
  public void initComponents()
  {
     
     panelPantalla=new PanelPantalla();
     //panelPantalla.setOvalo(ovalo);
     getContentPane().add(panelPantalla);
     setExtendedState(this.MAXIMIZED_BOTH);
     setVisible(true);
  
  }
  
  public void paint(Graphics g)
  {
    super.paint(g);
    
  }
  
  public static void main (String arg[]){
  
  GUIJuego juego = new GUIJuego();
  }
}
