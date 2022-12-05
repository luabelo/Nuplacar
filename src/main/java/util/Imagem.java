/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Mathe
 */
public class Imagem {
    public ImageIcon criaIcone(String path) {
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(path));
        Image image = icon.getImage().getScaledInstance(120, 80, Image.SCALE_DEFAULT);
        return new ImageIcon(image);
    }
}
