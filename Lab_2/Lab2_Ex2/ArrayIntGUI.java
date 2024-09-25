package ArrayInt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayIntGUI extends JFrame {

    private ArrayInt array;
    private JTextArea displayArea;
    private JTextField inputField;
    private JButton insertButton, deleteButton, searchButton, deleteElementButton, maxEvenButton;
    private JButton isEmptyButton, isFullButton, displayButton;

    public ArrayIntGUI() {
        // Ask the user for the size of the array at the start
        int size = askArraySize();
        array = new ArrayInt(size);

        // Create and set up the window
        setTitle("ArrayInt GUI");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input field
        inputField = new JTextField(10);
        add(new JLabel("Enter Element:"));
        add(inputField);

        // Buttons
        insertButton = new JButton("Insert");
        deleteButton = new JButton("Delete From Bottom");
        searchButton = new JButton("Search Element");
        deleteElementButton = new JButton("Delete Element");
        maxEvenButton = new JButton("Max Even");
        isEmptyButton = new JButton("Is Empty?");
        isFullButton = new JButton("Is Full?");
        displayButton = new JButton("Display Array");

        add(insertButton);
        add(deleteButton);
        add(searchButton);
        add(deleteElementButton);
        add(maxEvenButton);
        add(isEmptyButton);
        add(isFullButton);
        add(displayButton);

        // Display area
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane);

        // Button actions
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    array.insertElementAtTop(value);
                    displayArray();
                } catch (NumberFormatException ex) {
                    showMessage("Invalid input. Please enter a number.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array.DeleteFromBottom();
                displayArray();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    int index = array.searchForElement(value);
                    if (index != -1) {
                        showMessage("Element found at index: " + index);
                    } else {
                        showMessage("Element not found.");
                    }
                } catch (NumberFormatException ex) {
                    showMessage("Invalid input. Please enter a number.");
                }
            }
        });

        deleteElementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    array.DeleteElement(value);
                    displayArray();
                } catch (NumberFormatException ex) {
                    showMessage("Invalid input. Please enter a number.");
                }
            }
        });

        maxEvenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxEven = array.maxEven();
                if (maxEven != -1) {
                    showMessage("Maximum even number: " + maxEven);
                } else {
                    showMessage("No even numbers found.");
                }
            }
        });

        // Additional button actions

        isEmptyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (array.isEmpty()) {
                    showMessage("The array is empty.");
                } else {
                    showMessage("The array is not empty.");
                }
            }
        });

        isFullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (array.isFull()) {
                    showMessage("The array is full.");
                } else {
                    showMessage("The array is not full.");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArray();
            }
        });
    }

    // Method to ask the user for the array size
    private int askArraySize() {
        String input = JOptionPane.showInputDialog(this, "Enter the size of the array:", "Array Size",
                JOptionPane.QUESTION_MESSAGE);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            showMessage("Invalid input. Defaulting to size 10.");
            return 10; // Default size if invalid input
        }
    }

    // Display array elements
    private void displayArray() {
        displayArea.setText(""); // clear display area
        StringBuilder sb = new StringBuilder();
        sb.append("Array Elements: \n");
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.getA()[i]).append(" ");
        }
        displayArea.setText(sb.toString());
    }

    // Show message dialog
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        ArrayIntGUI gui = new ArrayIntGUI();
        gui.setVisible(true);
    }
}
