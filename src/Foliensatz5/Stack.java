package Foliensatz5;

public class Stack {
    private int[] elements;
    private int counter;

    public Stack(int[] elements, int counter) {
        elements[0] = 2;
        elements[1] = 3;
        elements[2] = 4;

        this.counter = -1;
    }
    public int pop(){
        return elements[counter] + counter--;

    }
    public void push(int value){
        counter++;
        value = elements[counter];



    }
//get
    public int[] getElements() {
        return elements;
    }

    public int getCounter() {
        return counter;
    }

//set
    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

