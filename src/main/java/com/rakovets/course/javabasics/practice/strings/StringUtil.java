package com.rakovets.course.javabasics.practice.strings;

 public class StringUtil {

     public String getGlueString(String string1, String string2){
        return string1.concat(string2);
     }
     public int getIndexOfSymbol(String string,String symbol){
         return string.indexOf(symbol);
     }
     public boolean getEqualString(String string1, String string2){
         return string1.equals(string2);
     }
     public String getUpperCaseStringAndTrim(String string){
         return string.toUpperCase().trim();
     }
     public String getSubString(String string){
         int endIndex = string.length() > 23 ? 23 : string.length();
         return string.substring(10, endIndex);
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
     public String getAbbreviation(String name,String surname,String patronymic){
         char firstLetterOfName = name.toUpperCase().charAt(0);
         char firstLetterOfSurname = surname.toUpperCase().charAt(0);
         char firstLetterOfPatronymic = patronymic.toUpperCase().charAt(0);

         String abbreviation = firstLetterOfSurname+"."+firstLetterOfName+"."+firstLetterOfPatronymic;
         return abbreviation;
     }
     public String getDigitSetFromString(String string) {
         String digitSet = "";
         for (int i = 0; i < string.length(); i++) {
             char digit = string.charAt(i);
             if (Character.isDigit(digit)) {
                 digitSet += digit;
             }
         }
         return digitSet;
     }

     public String getUniqueCharacters(String word1, String word2) {
         String uniqueCharacters = "";
         word1 = word1.toLowerCase();
         word2 = word2.toLowerCase();

         for (int i = 0; i < word1.length(); i++) {
             char character = word1.charAt(i);
             if (word2.indexOf(character) < 0) {
                uniqueCharacters += character + " ";
             }
         }

         for (int i = 0; i < word2.length(); i++) {
             char character = word2.charAt(i);
             if (word1.indexOf(character) < 0) {
                 uniqueCharacters += character + " ";
             }
         }
         return uniqueCharacters.trim();
     }

}
