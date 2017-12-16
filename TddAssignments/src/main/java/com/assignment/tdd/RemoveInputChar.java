package com.assignment.tdd;

public class RemoveInputChar {

       public String removeInputChar ( String str, char undesiredChar ) {

           StringBuilder updatedStr = new StringBuilder();
           int index = 0;
           int desiredIndex = 4;

           while (index < str.length()){
               if (index < desiredIndex -1 && str.charAt(index) != undesiredChar ) {
                   updatedStr.append(str.charAt(index));
               } else if (index >= desiredIndex -1) {
                   updatedStr.append(str.charAt(index));
               }
               index++;
           }
           return updatedStr.toString();
       }
}
