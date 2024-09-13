import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist{
    public static void main(String[] args) {
        //ARRAYLIST
        // ArrayList<String> StudentName = new ArrayList<>();
        // StudentName.add("ADnan");

        List<Integer> List = new ArrayList();
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println(List);
        // List.add(4); //this will add 4 at end index
        // System.out.println(List);


        // List.add(1, 50);
        // System.out.println(List);

        // //to add two Arraylist
        // List<Integer> newList = new ArrayList();
        // newList.add(78);
        // newList.add(95);
        // // to add two list

        // List.addAll(newList);
        // System.out.println(List);


        // //TO get any element
        // System.out.println(List.get(1));


        //To Remove a element
        // List.remove(1); //This will remove element by its index value
        // System.out.println(List);

        // List.remove(Integer.valueOf(3)); // will remove value by the value only
        // System.out.println(List);

        // List.clear(); // remove all the elements from list
        // System.out.println(List);

        // To set/change the element of list
        // List.set(2, 10002);
        // System.out.println(List);

        // //to check presence or not
        // System.out.println(List.contains(500));


        //To Traverse through the list
        for (int i = 0; i < List.size(); i++) {
            System.out.println("the elements is "+ List.get(i));
        }

        //foreach loop

        for (Integer element : List) {
            System.out.println("The element is "+element);
        }

        Iterator<Integer> it = List.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+ it.next());
        }




    }
}