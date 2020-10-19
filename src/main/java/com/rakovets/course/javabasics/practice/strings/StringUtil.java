package com.rakovets.course.javabasics.practice.strings;

 public class StringUtil {
     public String getGlueString(String string1, String string2){
        return string1.concat(string2);
     }
     public int getIndexOfSymbol(String string){
         return string.indexOf(string);
     }
     public boolean getEqualString(String string1, String string2){
         return string1.equals(string2);
     }
     public String getUpperCaseStringAndTrim(String string){
         return string.toUpperCase().trim();
     }
     public String getSubString(String string){
         return string.substring(9,23);
     }
     public String changeSmile(String string){
         return string.replace(":(",":)");
     }
     public boolean isWordBeginAndEndOfString(String string, String word){
       return (string.startsWith(word) && string.endsWith(word));
     }

     public int getCountOfVowels(String string){
         int counter = 0;
         for (int i = 0; i < string.length(); i++){
             char symbol = string.charAt(i);
             if(symbol == 'a'|| symbol == 'e'|| symbol == 'i' || symbol == 'o' || symbol == 'u'|| symbol == 'y'){
                 counter ++;
             }
         }
         return counter;
     }
     public int getCountOfSymbols(String string){
         int counter = 0;
         for (int i = 0; i<string.length();i++){
             char symbol = string.charAt(i);
             if(symbol == '.'|| symbol == ','|| symbol == '!' ){
                 counter ++;
             }
         }
         return counter;
     }
     public boolean isWordPalindrome(String string){
         String string1 = new StringBuffer(string).reverse().toString();
         return string.equalsIgnoreCase(string1);
     }
     public String[] getStringArray(String string, int n){
         int lengthOfArray = (int) Math.floor(string.length() / n);
         String[] strToArray = new String[lengthOfArray];
         for (int i = 0; i < lengthOfArray; i ++) {
             int beginIndex = i * n;
             int endIndex = beginIndex + n;
             strToArray[i] = string.substring(beginIndex, endIndex);
         }
         return strToArray;
     }
}
