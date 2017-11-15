package com.company;
/*
 Name: Binod Katwal
 Purpose: To understand how to implement color change application using java swings
*/

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class ColorChange extends JFrame {

    JSlider sliderR, sliderB, sliderG;
    JLabel LabelR, LabelB, LabelG;
    JPanel panelColor,sliders, labels;

    public ColorChange() {
        super("ChangeColors");
        sliderColor();
        Colordisplay(this);

    }

    public void Colordisplay(ColorChange display) {
        display.setSize(400, 150);
        display.setBackground(Color.green);

        display.setDefaultCloseOperation(EXIT_ON_CLOSE);
        display.setVisible(true);

    }
    public void sliderColor(){
        sliderB = new JSlider(JSlider.HORIZONTAL, 0,255,0);
        sliderG = new JSlider(JSlider.HORIZONTAL, 0,255,0);
        sliderR = new JSlider(JSlider.HORIZONTAL, 0,255,0);
        LabelB = new JLabel(" BLUE :0");
        LabelG = new JLabel(" GREEN :0");
        LabelR = new JLabel(" RED :0");

        event evn = new event();
        sliderB.addChangeListener(evn);
        sliderG.addChangeListener(evn);
        sliderR.addChangeListener(evn);

        panelColor = new JPanel();
        panelColor.setBackground(Color.BLACK);
        Container store= this.getContentPane();
        store.setLayout(new GridLayout(1, 3, 3, 3));
        sliders = new JPanel();
        labels = new JPanel();
        store.add(sliders);
        store.add(labels);
        store.add(panelColor);

        sliders.setLayout(new GridLayout(3,1,2 ,2));
        sliders.add(sliderB);
        sliders.add(sliderR);
        sliders.add(sliderG);

        labels.setLayout(new GridLayout(3,1,2 ,2));
        labels.add(LabelB);
        labels.add(LabelR);
        labels.add(LabelG);
    }
    public class event implements ChangeListener {
        public void stateChanged(ChangeEvent evn) {
           int red = sliderR.getValue();
           int green = sliderG.getValue();
           int blue = sliderB.getValue();

           LabelB.setText("BLUE =" + blue);
            LabelR.setText("RED =" + red);
            LabelG.setText("GREEN =" + green);
            panelColor.setBackground(new Color(red,green,blue));
        }
    }

public static void main(String[] args) {
        ColorChange display = new ColorChange();

        }
        }