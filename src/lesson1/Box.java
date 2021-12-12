package lesson1;

import java.util.ArrayList;
import java.util.Collection;

public class Box <F extends Fruit>{
    private F fruit;
    private ArrayList<F> box = new ArrayList<>();
    public Box(F fruit){

        this.fruit = fruit;

    }
    public F getFruit(){
        return fruit;
    }

    public int getFruitAmount(){
        return box.size();
    }

    public void putFruit(int n, F fruit){
        for (int i = 0; i < n; i++) {
            box.add(fruit);
        }

    }

    public float getWeight(){
        if(box.size()==0){
            return 0.0f;
        }
        if (box.get(0) instanceof Apple){
            return box.size()*1.0f;
        }
        else if (box.get(0) instanceof Orange){
            return box.size()*1.5f;
        }
        else return 0.0f;
    }

    public boolean compare(Box<?> compareBox){
        return getWeight() == compareBox.getWeight();
    }

    public void shiftTo(Box<F> exBox){
        exBox.putFruit(box.size(), exBox.getFruit());
        box.clear();
        }

    }


