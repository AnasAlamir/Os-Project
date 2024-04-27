/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpu.scheduling.pkg2;
import java.util.*; 
/**
 *
 * @author USER
 */
public class CpuScheduling2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Processes : ");
        int numberofProsesses = input.nextInt();
        //Prosess arrProsesses []= new Prosess[numberofProsesses];
        PriorityQueue<Prosess> Prosesses = new PriorityQueue<>();
        ArrayList<Prosess> arrLProsesses = new ArrayList<>();
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
            arrLProsesses.add(new Prosess(burstTime,priority,arrivalTime));
            Prosesses.add(arrLProsesses.get(i));          
        }        
        
            while(!Prosesses.isEmpty()){
                Prosess tmpProsess = Prosesses.poll();
                tmpProsess.executeProcess();
        }
            for (int i = 0; i < arrLProsesses.size(); i++) {
                System.out.println(arrLProsesses.get(i).toString());
        }
        
    }       
}




