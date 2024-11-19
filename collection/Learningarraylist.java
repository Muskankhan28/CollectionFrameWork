package collection;
import java.util.*;

public class Learningarraylist {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
    
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);

        // list.add(4);    // this will add 4 at the end of the list      
        // System.out.println(list);


        // list.add(2, 78);     //  this will add 78 at index 2
        // System.out.println(list);

        // List<Integer>newlist = new ArrayList<>();
        // newlist.add(909);
        // newlist.add(456);

        // list.addAll(newlist);              // this will add all the elements of newlist into a exisiting list
        // System.out.println(list);


        // System.out.println(list.get(2));


        // list.remove(5);              //  this will remove the element at a particular index 
        // System.out.println(list);

    
        // list.remove(Integer.valueOf(78));        // this will remove the element 
        // System.out.println(list);


        // list.clear();    // this will remove all the element form the list 
        // System.out.println(list);



        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // System.out.println(list);
        // list.set(2, 1000);     // this will add 1000 at index 2
        // System.out.println(list);


        // System.out.println(list.contains(40));     // this will check that the particular number exist in the list or not it will return output in the form of true and false
        


        // how to iterate on the list 

        //  -- > using for loop 
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


         
        // -- > using foreach loop
        for(Integer i : list){
            System.out.print(i+ " ");
        }
        System.out.println();

        // -- > using iterator

        Iterator<Integer>i = list.iterator();
        while(i.hasNext()){
            System.out.print(i.next() +" ");
        }


        

       

    }
}
