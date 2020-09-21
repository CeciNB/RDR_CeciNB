package dk.kea.assignment;

import java.util.*;

public class Race {
    private ArrayList<DuckQueue> start;
    private ArrayList<DuckQueue> gameList;
    private int timeStep;
    private int iteration;

    public Race(int number) {
        timeStep = number;
        iteration = 1;
        start = new ArrayList<>();
        int count = 1;
        try{
        for (int i = 0; i < timeStep; i++){
            DuckQueue myQueue = new DuckQueue();
            for (int j = 0; j < timeStep; j++){
                myQueue.enqueue(count);
                count++;
            }
            start.add(myQueue);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (DuckQueue duckQueue : start){
            System.out.println(duckQueue);
        }
        System.out.println();
        startRace();
    }

    public void startRace(){
        gameList = new ArrayList<>();
        try{
        for (int i = 1; i < start.size() - 1; i++) {
            DuckQueue myQueue = new DuckQueue();
            for (int j = 0; j < start.size() - 1; j++) {
                Random rand = new Random();
                int randNum = rand.nextInt(start.size());
                while (start.get(randNum).isEmpty()) {
                    randNum = rand.nextInt(start.size());
                }
                myQueue.enqueue(start.get(randNum).dequeue());
            }
            gameList.add(myQueue);
        }}
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Time Step: " + iteration);
        for (DuckQueue duckQueue : gameList) {
            System.out.println(duckQueue);
        }
        System.out.println();
        if (start.size() >= 1) {
            start = gameList;
            iteration++;
            startRace();
        }
    }
}