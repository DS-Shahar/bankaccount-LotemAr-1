package lotem1;

import java.util.Scanner;

public class Mשןמ {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // קלט מידות עבור שני מלבנים
	        System.out.print("Enter length and width for Rectangle 1: ");
	        int length1 = scanner.nextInt();
	        int width1 = scanner.nextInt();
	        Rectangle rectangle1 = new Rectangle(length1, width1);

	        System.out.print("Enter length and width for Rectangle 2: ");
	        int length2 = scanner.nextInt();
	        int width2 = scanner.nextInt();
	        Rectangle rectangle2 = new Rectangle(length2, width2);

	        // ציור המלבנים
	        System.out.println("\nDrawing Rectangle 1:");
	        rectangle1.draw();
	        
	        System.out.println("\nDrawing Rectangle 2:");
	        rectangle2.draw();

	        // הגדלת rectangle1 פי 2
	        rectangle1.scale(2);

	        // הצגת סכום ההיקפים והשטחים
	        int totalPerimeter = rectangle1.calcPerimeter() + rectangle2.calcPerimeter();
	        int totalArea = rectangle1.calcArea() + rectangle2.calcArea();

	        System.out.println("\nTotal Perimeter: " + totalPerimeter);
	        System.out.println("Total Area: " + totalArea);

	        // הדפסת המידע של המלבנים
	        System.out.println("\nRectangle 1: " + rectangle1);
	        System.out.println("Rectangle 2: " + rectangle2);
	    }
	}

