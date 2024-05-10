/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*AnasAlamir*/
package cpu.scheduling.pkg2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author USER
 */
public class CpuScheduling2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyFrame myFrame = new MyFrame();
        JLabel label = new JLabel();
        label.setText("Priority (Non-Preemptive) Cpu Scheduling");
        Font labelFont = label.getFont();
        label.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        myFrame.getContentPane().add(label, BorderLayout.NORTH);
        
        JPanel Panel = new JPanel();        
        //Panel.setPreferredSize(new Dimension(10, 50));
        Panel.setLayout(new FlowLayout());
        Panel.setBackground(new Color(213, 213, 220));
        Panel.setBounds(50, 50, 720, 520);
        Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelNumber = new JLabel();
        labelNumber.setText("Enter Number of Processes:");
        labelNumber.setFont(new Font(labelFont.getName(), Font.PLAIN, 18));
        JTextField inputNumber = new JTextField(10);
        JButton buttonNumber = new JButton("Enter");
        int numberOfProcesses = Integer.parseInt(inputNumber.getText());
        buttonNumber.addActionListener(e->System.out.println("w"));
        Panel.add(labelNumber);
        Panel.add(inputNumber);
        Panel.add(buttonNumber);
//        Scanner input = new Scanner(System.in);
//        int numberOfProcesses = getInputInteger(input);

        myFrame.add(Panel);
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Number of Processes: ");
//        int numberOfProcesses = getInputInteger(input);
//        while (numberOfProcesses <= 0) {
//            System.out.println("Invalid input. Please enter a positive integer for the number of processes.");
//            System.out.print("Enter Number of Processes: ");
//            numberOfProcesses = getInputInteger(input);
//        }
//        ArrayList<Process> arrLProcesses = new ArrayList<>();
//        PriorityQueue<Process> processes = new PriorityQueue<>();
//        for (int i = 0; i < numberOfProcesses; i++) {
//            int burstTime, priority, arrivalTime;
//            System.out.println("P[" + (i + 1) + "]");
//            System.out.print("Enter Burst Time: ");
//            burstTime = getInputInteger(input);
//            while (burstTime <= 0) {
//                System.out.println("Invalid input. Burst time must be a positive integer.");
//                System.out.print("Enter Burst Time: ");
//                burstTime = getInputInteger(input);
//            }
//
//            System.out.print("Enter Priority: ");
//            priority = getInputInteger(input);
//            while (priority <= 0) {
//                System.out.println("Invalid input. Priority must be a positive integer.");
//                System.out.print("Enter Priority: ");
//                priority = getInputInteger(input);
//            }
//            System.out.print("Enter Arrival Time: ");
//            arrivalTime = getInputInteger(input);
//            while (arrivalTime < 0) {
//                System.out.println("Invalid input. Arrival time cannot be negative.");
//                System.out.print("Enter Arrival Time: ");
//                arrivalTime = getInputInteger(input);
//            }
//
//            System.out.println("");
//            arrLProcesses.add(new Process(burstTime, priority, arrivalTime));
//            processes.add(arrLProcesses.get(i));
//        }
//
//        int totalTurnaroundTime = 0;
//        int totalWaitingTime = 0;
//        int totalResponseTime = 0;
//        ArrayList<Process> tmpArrLProcesses = new ArrayList<>();
//        boolean executed = false;
//        while (!processes.isEmpty()) {
//            if (executed) {
//                while (!tmpArrLProcesses.isEmpty()) {
//                    processes.add(tmpArrLProcesses.remove(tmpArrLProcesses.size() - 1));
//                }
//            }
//            Process tmpProcess = processes.poll();
//            if (tmpProcess.getArrivalTime() <= Process.programTimeCounter) {
//                tmpProcess.executeProcess();
//                executed = true;
//                totalTurnaroundTime += tmpProcess.turnaroundTime();
//                totalWaitingTime += tmpProcess.waitingTime();
//                totalResponseTime += tmpProcess.responseTime();
//            } else {
//                tmpArrLProcesses.add(tmpProcess);
//                executed = false;
//            }
//        }
//
//        for (Process process : arrLProcesses) {
//            System.out.println(process.toString());
//            System.out.print("order = " + process.getOrder() + "\t");
//            System.out.print("startTime = " + process.startTime + "\t");
//            System.out.println("completionTime = " + process.completionTime);
//        }
//
//        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) Process.numberofProsesses));
//        System.out.println("Average Waiting Time: " + (totalWaitingTime / (double) Process.numberofProsesses));
//        System.out.println("Average Response Time: " + (totalResponseTime / (double) Process.numberofProsesses));
    }

//    private static int getInputInteger(Scanner input) {
//        try {
//            return input.nextInt();
//        } catch (InputMismatchException e) {
//            
//            input.next();
//            return -1; 
//        }
//    }
    

        
    }



    //SwingUtilities.invokeLater(() -> new ProcessGUI());//CHATGPT
        
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter Number of Processes : ");

//        int numberofProcesses = input.nextInt();
//        //Prosess arrProcesses []= new Process[numberofProcesses];
//        PriorityQueue<Process> Processes = new PriorityQueue<>();
//        ArrayList<Process> arrLProcesses = new ArrayList<>();
//        for (int i = 0; i < numberofProcesses; i++) {
//            int burstTime, priority, arrivalTime;
//            System.out.println("P[" + (i + 1) + "]");
//            System.out.print("Enter Burst Time : ");
//            burstTime = input.nextInt();
//            System.out.print("Enter priority : ");
//            priority = input.nextInt();
//            System.out.print("Enter Arrival Time : ");
//            arrivalTime = input.nextInt();
//            System.out.println("");
//            arrLProcesses.add(new Process(burstTime, priority, arrivalTime));
//            Processes.add(arrLProcesses.get(i));
//        }
//        int totalTurnaroundTime = 0;
//        int totalWaitingTime = 0;
//        int totalResponseTime = 0;
//        ArrayList<Process> tmpArrLProcesses = new ArrayList<>();
//        boolean executed = false;
//        while (!Processes.isEmpty()) {
//            if (executed) {
//                while (!tmpArrLProcesses.isEmpty()) {
//                    Processes.add((Process) tmpArrLProcesses.remove(tmpArrLProcesses.size() - 1));
//                }
//            }
//            Process tmpProcess = Processes.poll();
//            if (tmpProcess.getArrivalTime() <= Process.programTimeCounter) {
//                tmpProcess.executeProcess();
//                executed = true;
//                totalTurnaroundTime += tmpProcess.turnaroundTime();
//                totalWaitingTime += tmpProcess.waitingTime();
//                totalResponseTime += tmpProcess.responseTime();
//            } else {
//                tmpArrLProcesses.add(tmpProcess);
//                executed = false;
//            }
//        }
//        for (int i = 0; i < arrLProcesses.size(); i++) {
//            System.out.println(arrLProcesses.get(i).toString());
//            System.out.print("order = " + arrLProcesses.get(i).getOrder() + "\t");
//            System.out.print("startTime = " + arrLProcesses.get(i).startTime + "\t");
//            System.out.println("completionTime = " + arrLProcesses.get(i).completionTime);
//        }
//        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) Process.numberofProsesses));
//        System.out.println("Average Waiting Time: " + (totalWaitingTime / (double) Process.numberofProsesses));
//        System.out.println("Average Response Time: " + (totalResponseTime / (double) Process.numberofProsesses));