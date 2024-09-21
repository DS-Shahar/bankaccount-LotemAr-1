package lotem1;

	public class Rectangle {
	    private int length;
	    private int width;

	    // פעולה בונה
	    public Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    // ציור על המסך
	    public void draw() {
	        for (int i = 0; i < width; i++) {
	            for (int j = 0; j < length; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	    // חישוב השטח
	    public int calcArea() {
	        return length * width;
	    }

	    // חישוב ההיקף
	    public int calcPerimeter() {
	        return 2 * (length + width);
	    }

	    // להכפיל את האורך והרוחב ב-factor
	    public void scale(int factor) {
	        this.length *= factor;
	        this.width *= factor;
	    }

	    // פעולה toString
	    @Override
	    public String toString() {
	        return "Rectangle[length=" + length + ", width=" + width + "]";
	    }
	}


