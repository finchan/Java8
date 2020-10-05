package com.tasche.parameterization.predefined;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISample {
    public static void main(String[] args) {
        Button button = new Button("Send");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("");
            }
        });
    }
}
