package it.castelli.impiccato.styles;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 * Rounded Border for buttons<br><br>
 * Constructors:
 * <ul>
 * 	<li>RoundedBorder(radius : int)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>getBorderInsets(c : Component) : public Insets</li>
 * 	<li>isBorderOpaque() : public boolean</li>
 * 	<li>paintBorder(c : Component, g : Graphics, x : int, y : int, width : int, height : int) : public void</li>
 * </ul>
 * @see Border
 * @see Component
 * @see Graphics
 * @see Insets
 * @author Maltempi Elisabetta 4CI
 * @version 1.2
 */
public class RoundedBorder implements Border {

    private int radius;


    public RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}