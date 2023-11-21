package org.example.recordPatterns;

public class RecordPatterns {

    // To create a record:
   public static <T> String asStringValue(T anyValue) {
       return switch (anyValue){
              case String s -> s;
              case Integer i -> i.toString();
              case Double d -> d.toString();
              default -> "Unknown";
         };
       }

       record Point(double x, double y){}

       public static <T> void checkIfObjectIsPoint(T o){
           if(o instanceof Point p){
               System.out.println("Point x: " + p.x() + " y: " + p.y());
           }else{
               System.out.println("Not a point");
           }
       }
   }



