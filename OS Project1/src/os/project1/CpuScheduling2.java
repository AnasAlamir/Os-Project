
package os.project1;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CpuScheduling2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Processes : ");
        int numberofProsesses = input.nextInt();
        //Prosess arrProsesses []= new Prosess[numberofProsesses];
        PriorityQueue<Process> Prosesses = new PriorityQueue<>();
        ArrayList<Process> arrLProsesses = new ArrayList<>();
        for (int i = 0; i < numberofProsesses; i++) {
            int burstTime,priority,arrivalTime;
            System.out.println("P["+(i+1)+"]");
            System.out.print("Enter Burst Time : ");
            burstTime=input.nextInt();
            System.out.print("Enter priority : ");
            priority=input.nextInt();
            System.out.print("Enter Arrival Time : ");
            arrivalTime=input.nextInt();           
            System.out.println("");
            arrLProsesses.add(new Process(burstTime,priority,arrivalTime));
            Prosesses.add(arrLProsesses.get(i));          
        }        
        
            while(!Prosesses.isEmpty()){
                Process tmpProsess = Prosesses.poll();
                tmpProsess.executeProcess();
        }
            for (int i = 0; i < arrLProsesses.size(); i++) {
                System.out.println(arrLProsesses.get(i).toString());
        }
        
    }       
}
