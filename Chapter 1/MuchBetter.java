/*
Write a complete Java program in a class named MuchBetter that prints the following output:

A "quoted" String is
'much' better if you learn
the rules of "escape sequences."
Also, "" represents an empty String.
Don't forget: use \" instead of " !
'' is not the same as "
*/

public class MuchBetter {
	public static void main(String[]args) {
		System.out.println("A \"quoted\" String is");
		System.out.println("'much' better if you learn");
		System.out.println("the rules of \"escape sequences.\"\r\n" +
				"Also, \"\" represents an empty String.\r\n" + 
				"Don't forget: use \\\" instead of \" !\r\n" + 
				"'' is not the same as \"");
	}
}
