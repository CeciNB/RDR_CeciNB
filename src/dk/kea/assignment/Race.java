package dk.kea.assignment;

import java.util.*;

public class Race {
    private ArrayList<DuckQueue> startList;
    private int iteration;

    public Race(int number) {
        iteration = 1;
        startList = new ArrayList<>();
        int count = 1;
        try{
        for (int i = 0; i < number; i++){
            DuckQueue myQueue = new DuckQueue();
            for (int j = 0; j < number; j++){
                myQueue.enqueue(count);
                count++;
            }
            startList.add(myQueue);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Time Step: " + iteration);
        for (DuckQueue duckQueue : startList){
            System.out.println(duckQueue);
        }
        System.out.println();
        iteration++;
        startRace();
    }

    public void startRace(){
        ArrayList<DuckQueue> tempList = new ArrayList<>();
        try{
        for (int i = 0; i < startList.size() - 1; i++) {
            DuckQueue myQueue = new DuckQueue();
            for (int j = 0; j < startList.size() - 1; j++) {
                Random rand = new Random();
                int randNum = rand.nextInt(startList.size());
                while (startList.get(randNum).isEmpty()) {
                    randNum = rand.nextInt(startList.size());
                }
                myQueue.enqueue(startList.get(randNum).dequeue());
            }
            tempList.add(myQueue);
        }}
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Time Step: " + iteration);
        for (DuckQueue duckQueue : tempList) {
            System.out.println(duckQueue);
        }
        System.out.println();
        if (tempList.size() > 1) {
            startList = tempList;
            iteration++;
            startRace();
        }
    }
}