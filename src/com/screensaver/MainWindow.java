package com.screensaver;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        super.setBounds(0,0,100,100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        super.getContentPane().setBackground(Color.BLACK);
//        super.setUndecorated(true);
        super.setVisible(true);

        Container container = super.getContentPane();
        container.setLayout(new BorderLayout());
        JTextArea mainTextArea = new JTextArea();//Основное текстовое поле
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        JScrollPane mainScroll = new JScrollPane(mainTextArea);
        JButton button = new JButton("нажми меня");
        container.add(button, BorderLayout.NORTH);
//        container.add(mainScroll, BorderLayout.CENTER);
        JTextArea leftTextArea = new JTextArea();
        leftTextArea.append("Просто текст");
        leftTextArea.append("ещё текст");
        JScrollPane leftScroll = new JScrollPane(leftTextArea);
//        leftTextArea.setPreferredSize(new Dimension(300,50));
        container.add(leftTextArea, BorderLayout.WEST);
        container.add(mainScroll, BorderLayout.CENTER);
for(int i = 0; i < 400; i++){
    mainTextArea.append("Новая строка с номером: " + i + "\n");
}
        mainTextArea.append("Количество занятых строк " + String.valueOf(mainTextArea.getLineCount()) + "\n");
        System.out.println(mainTextArea.getLineCount());
//        textArea.append(String.valueOf(textArea.getTabSize()));
//        textArea.append(String.valueOf(textArea.getPreferredSize()));
        mainTextArea.append("Количество строк " + String.valueOf(mainTextArea.getRows()) + "\n");
        mainTextArea.append("Количество строк " + String.valueOf(mainTextArea.getRows()) + "\n");
//        System.out.println(textArea.);
    }
}
