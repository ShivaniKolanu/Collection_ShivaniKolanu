package com.epam.task6;

public class Main {
	public static void main(String[] args) 
    {
        CustomList<Integer> list = new CustomList<>();
 
        //Add elements
        list.add(15);
        list.add(30);
        list.add(45);
       
         
        //Remove elements from index
        list.remove(2);
       
         
        //Get element with index
        System.out.println( list.Get_element(0) );
        System.out.println( list.Get_element(1) );
 
        //List Size
        System.out.println(list.get_size());
    }
}


