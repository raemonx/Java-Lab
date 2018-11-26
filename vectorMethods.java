import java.util.*;
class vectorMethods
{
    public static void main(String[] arg)
    {

        // create default vector
        Vector v = new Vector();


        v.add(1);
        System.out.println(v);
        v.add(2);
               
        v.add("new");
                
        v.add("Text");
                
        v.add(3);
                
        v.add(0, 1);
                System.out.println(v);
        v.add(1, 2);
                
        v.add(7, "Hello");
                
        v.add(3, "World");
                
        v.add(4, 3);
                System.out.println(v);


          //vector with inc size
         Vector vec = new Vector(4,10);

         vec.add("your");
         vec.add("doll");
         vec.add("Charlie");
         vec.add("copyr");

         System.out.println("Size is: "+vec.size());
         System.out.println("Default capacity is: "+vec.capacity());

         System.out.println("Vector element is: "+vec);
         vec.addElement("Echo");
         vec.addElement("rukamu");
         vec.addElement("Golf");

         System.out.println("Size after addition: "+vec.size());
         System.out.println("Capacity after addition is: "+vec.capacity());

         System.out.println("Elements are: "+vec);

           if(vec.contains("Zulu"))
           {
              System.out.println("Zulu is present at the index " +vec.indexOf("Zulu"));
           }
           else
           {
              System.out.println("Zulu is not present in the list.");
           }

         System.out.println("The first phonetic name of the vector is = "+vec.firstElement());

         System.out.println("The last phonetic name of the vector is = "+vec.lastElement());


      System.out.println("Vector is " + vec);

      ArrayList arr = new ArrayList();
       arr.add(3);
       arr.add("file");
       arr.add("argument");
       arr.add(4);


       //collection constructor
       Vector colvec = new Vector(arr);
       System.out.println("Vector is " + colvec);

      }
    }