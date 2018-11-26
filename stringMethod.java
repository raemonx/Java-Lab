public class stringMethod{
   public static void main(String args[]){

	String str = "Beginnersbook";
	char arrch[]={'h','e','l','l','o'};
	String str2 = new String(arrch);
	String str3 = new String("Java String Example");
  String str4 = new String("beginnersbook");
  String str5 = new String("beginnersbook");
  String str6 = new String("    How are you??   ");

	System.out.println(str);
	System.out.println(str2);
	System.out.println(str3);

  char ch1 = str.charAt(7);
  System.out.println(ch1);
  System.out.println(str.equals(str4));
  System.out.println(str.equals(str3));
  System.out.println(str.equalsIgnoreCase(str5));

  int var1 = str.compareTo(str4);
  System.out.println(var1);

  int var2 = str4.compareTo(str5);
  System.out.println(var2);

  int var3 = str.compareToIgnoreCase(str5);
  System.out.println(var3);

  System.out.println(str3.startsWith("String"));
  System.out.println(str3.startsWith("String",5));
  System.out.println(str3.endsWith("Example"));

  System.out.println("String before trim: "+str6);
  System.out.println("String after trim: "+str6.trim());
  System.out.println("Hash Code for String str6: "+str6.hashCode());

  System.out.println("Index of E in str3: "+str3.indexOf('E'));
  System.out.println("Index of E in str3 after index 13: "+str3.indexOf('E',13));
  System.out.println("Last index of E in str3: "+str3.lastIndexOf('E'));

  System.out.println(str3.substring(5));
  System.out.println(str3.substring(11));

  str5 = str5.concat(" String handling ");
  System.out.println(str5);

  System.out.println(str.replace('o', 'e'));
	System.out.println(str.contains("book"));

  System.out.println(str.toUpperCase());
	System.out.println(str.isEmpty());

  String str1=String.join("+","this","is","added","text");
  System.out.println(str1);

  String str7 = new String("welcome to Guwahati");
       System.out.println("split(String regex):");
       String array1[]= str7.split(" ");
       for (String temp: array1){
          System.out.println(temp);
       }

   String str8 = new String("Welcome");
           char[] array= str8.toCharArray();
           System.out.print("Content of Array:");
           for(char c: array){
               System.out.print(c);
               System.out.print(" ");

           }
           System.out.println("");

   System.out.println("length if string str1 is : "+str1.length());

   String str9 = new String("Hello");
       byte[] array2 = str9.getBytes();
       System.out.print("\nDefault Charset encoding:");
       for(byte b: array2){
           System.out.print(b);
       }

   }
}