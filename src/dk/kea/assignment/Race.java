package dk.kea.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Race {
    DuckQueue ducks;
    ArrayList<Integer> numbers;

    //add all ducks to an ArrayList, numbers so we can utilize Collection.shuffle(); to then add them to the queue
    public Race(int numberOfDucks) {
        ducks = new DuckQueue();
        numbers = new ArrayList();
        for(int i = 1; i <= numberOfDucks; i++){
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for(int i : numbers){
            ducks.enqueue(i);
        }
    }

    //add all ducks to an ArrayList, numbers so we can utilize .shuffle to then add them to the queue
}
