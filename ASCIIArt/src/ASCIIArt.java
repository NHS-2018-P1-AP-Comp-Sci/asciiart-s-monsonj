/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

public class ASCIIArt {
	
	/* This ASCII Art is meant to depict a patterned sock. */
	public static void main (String [] args) {
		basePattern();
		basePattern();
		zigzag();
		dotPattern();
		basePattern();
		horizontalStripe();
		basePattern();
		horizontalStripe();
		basePattern();
		zigzag();
		basePattern();
		dotPattern();
		basePattern();
		horizontalStripe();
		basePattern();               
		
		/* 
		 * I added most of this bottom section line by line because it
		 * doesn't have enough repetition to warrant the use of methods.
		 */
		System.out.println("|||||||||||||||||||||||||");                
		System.out.println("||||||||||||||||||||||||||");      
		System.out.println("|||||||||||||||||||||||||||||||"); 
		System.out.println("|||||||||||||||||||||||||||||||||||||");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");    
		sockToe();
		sockToe();
		sockToe();
		sockToe();
		sockToe();
		System.out.println(" |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("  |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

	}
	
	public static void basePattern() {
		System.out.println("|||||||||||||||||||||||");
	}
	
	public static void zigzag() {
		System.out.println("\\||||/\\||||/\\||||/\\||||");
		System.out.println("|\\||/||\\||/||\\||/||\\||/");
		System.out.println("||\\/||||\\/||||\\/||||\\/|");
	}
	
	public static void horizontalStripe() {
		System.out.println("-----------------------");
	}
	
	public static void dotPattern() {
		System.out.println("|\"|\"|\"|\"|\"|\"|\"|\"|\"|\"|\"|");
		System.out.println("||'|'|'|'|'|'|'|'|'|'||");
		System.out.println("|\"|\"|\"|\"|\"|\"|\"|\"|\"|\"|\"|");
	}
	
	public static void sockToe() {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	}
}
