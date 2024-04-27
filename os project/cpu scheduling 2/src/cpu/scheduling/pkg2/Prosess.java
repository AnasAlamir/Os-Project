/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpu.scheduling.pkg2;

/**
 *
 * @author USER
 */
public class Prosess implements Comparable <Prosess>{

    private int  burstTime;
    private int priority;
    private int arrivalTime;
    private int ProsesseId;
    public static int numberofProsesses = 0;
    public static int programTimeCounter = 0;
    public int startTime;
    public int completionTime;  
    Prosess(){
    }
    Prosess(int burstTime,int priority,int arrivalTime){
        this.setBurstTime(burstTime);
        this.setPriority(priority);
        this.setArrivalTime(arrivalTime);
        this.numberofProsesses++;
        this.setProsesseId();
    }
    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getProsesseId() {
        return this.ProsesseId;
    }

    public void setProsesseId() {
        this.ProsesseId= numberofProsesses;
    }
    
    @Override
    public int compareTo(Prosess o) {
        return Integer.compare(this.priority, o.getPriority()); 
    }
    public void executeProcess(){
        this.startTime = programTimeCounter;
        for (int i = 0; i < this.burstTime; i++) {
            programTimeCounter++;
        }
        this.completionTime = programTimeCounter;
    }
    public int turnaroundTime(){
        return this.completionTime - this.arrivalTime;
    }
    public int responseTime(){
        return this.startTime - this.arrivalTime;
    }
    public int waitingTime(){
        return this.turnaroundTime() - this.burstTime;
    }
    @Override
    public String  toString(){
        return ("P[" + this.getProsesseId() + "] " + 
                "Turnaround Time = " + this.turnaroundTime() + 
                "\tWaiting Time = " + this.waitingTime() + 
                "\tResponse Time = " + this.responseTime());
    }       
 }
