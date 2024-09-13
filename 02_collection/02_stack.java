import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        //STACK

        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stck: " + animals);
        //to get topmost elements
        System.out.println(animals.peek());
        //To remove the element from topmost
        animals.pop();
        System.out.println(animals.peek());
    }
}