package week7.day2.notepad;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NotePad extends JFrame {

  private JTextField filePathField;
  private JTextArea textArea;
  private JButton loadButton;
  private JButton saveButton;

  public NotePad() {
    super("NotePad");
    init();
  }

  private void init() {
    filePathField = new JTextField("File path:");
    textArea = new JTextArea();
    textArea.setLineWrap(true);
    initButtons();

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(new Dimension(500, 700));

    JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
    bottomPanel.add(loadButton);
    bottomPanel.add(saveButton);

    getContentPane().add(filePathField, BorderLayout.NORTH);
    getContentPane().add(textArea, BorderLayout.CENTER);
    getContentPane().add(bottomPanel, BorderLayout.SOUTH);

  }

  private void initButtons() {
    loadButton = new JButton("LOAD");
    saveButton = new JButton("SAVE");

    loadButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String text = filePathField.getText();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
          builder.append(text);
        }
        textArea.setText(builder.toString());
      }
    });
  }
}
