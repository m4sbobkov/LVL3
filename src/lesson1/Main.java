package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       doTask1();
       doTask2();

        Box<Apple> appleBox = new Box (new Apple());
        appleBox.putFruit(5,new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.putFruit(12, new Orange());
        Box<Apple> appleBox2 = new Box<>(new Apple());
        System.out.println("applebox1: " + appleBox.getFruitAmount() + "\nOrangebox: " + orangeBox.getFruitAmount() + "\nappleBox2: " + appleBox2.getFruitAmount());
        appleBox.shiftTo(appleBox2);
        System.out.println();
        System.out.println("applebox1: " + appleBox.getFruitAmount() + "\nOrangebox: " + orangeBox.getFruitAmount() + "\nappleBox2: " + appleBox2.getFruitAmount());
        System.out.println(orangeBox.compare(appleBox2));


    }

    public static void doTask1() {
        List testArray = new ArrayList();
        testArray.add(1);
        testArray.add(2);
        testArray.add("three");
        System.out.println(testArray);

        switchElements(testArray,0,2);
        System.out.println(testArray);

    }

    //element1 и element2 - это индексы значений в массиве, которые необходимо поменять местами
    public static void switchElements (List changingArray, int element1, int element2){
        Object temp1;
        Object temp2;
        if (element1 < changingArray.toArray().length && element2 < changingArray.toArray().length){
            temp1 = changingArray.get(element1);
            temp2 = changingArray.get(element2);
            changingArray.set(element1,temp2) ;
            changingArray.set(element2, temp1);


        }
        else System.out.println("Wrong element's number");


    }

    public static void doTask2(){
        Object[] array = new Object[] {1,'c',"abc",1222};
        System.out.println("Array: " + array.toString());
        ArrayList list = new ArrayList(arrayToList(array));
        System.out.println("ArrayList: " + list);

    }
    public static ArrayList arrayToList (Object[] arr){
        ArrayList testList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            testList.add(arr[i]);


        }

        return testList;
    }




}
