/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpu.scheduling.pkg2;

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ProcessGUI extends JFrame implements ActionListener {
    // Declare GUI components
    private JLabel burstLabel, priorityLabel, arrivalLabel, processesLabel;
    private JTextField burstField, priorityField, arrivalField, processesField;
    private JButton addButton, calculateButton;
    private JTextArea resultArea;

    // Constructor
    public ProcessGUI() {
        // Set frame properties
        this.setSize(720,620);
        this.setTitle("Priority (Non-Preemptive)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("D:/anas/os-project-and-task-main/cpu scheduling 2/cpu.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(213, 213, 220));
        setLayout(new FlowLayout());

        // Initialize GUI components
        burstLabel = new JLabel("Burst Time:");
        priorityLabel = new JLabel("Priority:");
        arrivalLabel = new JLabel("Arrival Time:");
        processesLabel = new JLabel("Number of Processes:");
        burstField = new JTextField(10);
        priorityField = new JTextField(10);
        arrivalField = new JTextField(10);
        processesField = new JTextField(10);
        addButton = new JButton("Add Process");
        calculateButton = new JButton("Calculate");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false); // Make result area read-only

        // Add components to the frame
        add(processesLabel);
        add(processesField);
        add(burstLabel);
        add(burstField);
        add(priorityLabel);
        add(priorityField);
        add(arrivalLabel);
        add(arrivalField);
        add(addButton);
        add(calculateButton);
        add(resultArea);

        // Add action listeners to buttons
        addButton.addActionListener(this);
        calculateButton.addActionListener(this);

        // Display the frame
        setVisible(true);
    }

    // Action performed when buttons are clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // Add process to the list
            // Implement this logic based on your data structure for processes
        } else if (e.getSource() == calculateButton) {
            // Calculate and display results
            // Implement this logic based on your process scheduling algorithm
        }
    }
     public void processDataAndDisplayResults(ArrayList<Process> processes) {
        int totalTurnaroundTime = 0;
        int totalWaitingTime = 0;
        int totalResponseTime = 0;

        PriorityQueue<Process> Processes = new PriorityQueue<>(processes);

        while (!Processes.isEmpty()) {
            Process tmpProcess = Processes.poll();
            if (tmpProcess.getArrivalTime() <= Process.programTimeCounter) {
                tmpProcess.executeProcess();
                totalTurnaroundTime += tmpProcess.turnaroundTime();
                totalWaitingTime += tmpProcess.waitingTime();
                totalResponseTime += tmpProcess.responseTime();
            } else {
                Processes.add(tmpProcess);
            }
        }

        resultArea.setText(""); // Clear previous text
        for (Process process : processes) {
            resultArea.append(process.toString() + "\n");
            resultArea.append("Order = " + process.getOrder() + "\t");
            resultArea.append("Start Time = " + process.startTime + "\t");
            resultArea.append("Completion Time = " + process.completionTime + "\n");
        }

        double averageTurnaroundTime = totalTurnaroundTime / (double) Process.numberofProsesses;
        double averageWaitingTime = totalWaitingTime / (double) Process.numberofProsesses;
        double averageResponseTime = totalResponseTime / (double) Process.numberofProsesses;

        resultArea.append("\nAverage Turnaround Time: " + averageTurnaroundTime + "\n");
        resultArea.append("Average Waiting Time: " + averageWaitingTime + "\n");
        resultArea.append("Average Response Time: " + averageResponseTime + "\n");
    }

}
