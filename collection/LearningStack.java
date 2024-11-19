package collection;

import java.util.Stack;



public class LearningStack {
    public static void main(String[] args) {
        Stack<String>animal = new Stack<>();
        // push function is basically used to add element into a stack
        animal.push("dog");  
        animal.push("cow");
        animal.push("cat");
        animal.push("tiger");
        System.out.println("stack : " + animal);
        System.out.println(animal.peek());    // peek function sbse top pr element konsa h vo dekhne ke liye use krte h 

        animal.pop();  
        System.out.println("stack :" + animal);                       // pop sbse top ke element ko delete kar deta h 
        System.out.println(animal.peek());
        
    }
    
}
