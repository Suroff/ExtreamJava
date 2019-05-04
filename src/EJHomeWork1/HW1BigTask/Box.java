package EJHomeWork1.HW1BigTask;


import java.util.ArrayList;
import java.util.Arrays;

public class Box<F extends Fruit> {
    ArrayList<F> box = new ArrayList();

    public Box(F... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));

    }

    public ArrayList<F> getBox(){
        return box;
    }

    public void addFruit(F fruit){
        box.add(fruit);
    }

    public float getBoxWeight(){
        float boxWeight = 0.0f;
        for (int i = 0; i < box.size(); i++){
            boxWeight = boxWeight + box.get(i).GetFruitWeight();
        }
        return boxWeight;
    }

    public boolean compBox(Box<? extends Fruit> boxOfFruit){
        return Math.abs(getBoxWeight() - boxOfFruit.getBoxWeight()) < 0.0001f;
    }

    public void putFruitToABox(Box<F> aBox){
        aBox.box.addAll(this.box);
        this.box.clear();
    }
}
