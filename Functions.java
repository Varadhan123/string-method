class Functions
{
public static void main(String [] args)
{
 String name =" arullll";
 String firstname = "raj";
 String lastname = " kumar";
 char position = firstname.charAt(2);
 System.out.println( "The third letter in the name raj is: "  + position );
 System.out.println ("The concat of first and last name is:  " + firstname.concat(lastname));
 System.out.println("First name starts with r:  " + firstname.startsWith("r"));
 System.out.println("Lastname ends with ar:  " + lastname.endsWith("ar"));
 System.out.println("The first name is equal to last name: " + firstname.equals(lastname));
 System.out.println("THe position of m in last name is: " +lastname.indexOf("m"));
 System.out.println("The position of j in first name is: " +firstname.lastIndexOf("j"));
 System.out.println("Total letters in last name is : " +lastname.length());
 System.out.println("L replacing letter r in last name: " +lastname.replace('r','l'));
 System.out.println("Replace all l to n "  + name.replaceAll("l","n" ));
 System.out.println("Last name in upper case: " + lastname.toUpperCase());
 System.out.println("last name in lower case: " + lastname.toLowerCase());
 System.out.println("After trim  " +name);
 }
}