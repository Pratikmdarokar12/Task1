package Task1;

import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {
    JLabel inputLabel, resultLabel;
    JTextArea inputArea;
    JButton countButton;

    WordCounter() {
        
        setTitle("Word Counter");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        inputLabel = new JLabel("Enter your paragraph:");
        inputLabel.setBounds(20, 20, 150, 30);
        add(inputLabel);

        inputArea = new JTextArea();
        inputArea.setLineWrap(true); 
        JScrollPane scrollPane = new JScrollPane(inputArea); 
        scrollPane.setBounds(20, 50, 350, 150); 
        add(scrollPane);

        countButton = new JButton("Count Words");
        countButton.setBounds(20, 220, 120, 30); 
        countButton.addActionListener(this); 
        add(countButton);

        resultLabel = new JLabel(); 
        resultLabel.setBounds(150, 220, 200, 30); 
        add(resultLabel);

        setVisible(true); 
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) { 
            String inputText = inputArea.getText(); 
            int wordCount = countWords(inputText); 
            resultLabel.setText("Word Count: " + wordCount); 
        }
    }

    
    private int countWords(String text) {
        String[] words = text.split("\\s+"); 
        return words.length; 
    }

    public static void main(String[] args) {
        new WordCounter(); 
    }
}
