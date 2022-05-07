/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Barnery
 */
public class EventosRaton implements MouseInputListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("hola click de raton");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("boton precionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Cursos entro al componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("el cursor salio del componente");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
