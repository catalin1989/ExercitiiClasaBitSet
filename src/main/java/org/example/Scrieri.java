package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Scrieri extends Frame implements ActionListener {

    private TextArea intrareArieText;
    private Button butonSalvare;

    public Scrieri(){
        super("Scrieri");
    }

    public void interfataGrafica(){
        butonSalvare= new Button("save");
        add("North", butonSalvare);
        butonSalvare.addActionListener(this);
        intrareArieText=new TextArea(10,50);
        add("Center", intrareArieText);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==butonSalvare){
            PrintWriter fisierIesire=null;
            try {
                fisierIesire =new PrintWriter(new FileWriter("fisier.txt"),true);
                fisierIesire.println(intrareArieText.getText());
            }
            catch(IOException e){
                System.err.println("Eroare de fisier: "+e.toString());
                System.exit(1);
            }
            finally{
                if( fisierIesire!=null)
                    fisierIesire.close();
            }
        }

    }
}
