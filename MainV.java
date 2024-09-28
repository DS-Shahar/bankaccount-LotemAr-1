package lotem1;

import java.util.Random;

public class MainV {
	public static void main(String[] args) {
		
		Random random= new Random();
		int random1;
	 Volcano V1= new Volcano("lotem",10);
	 for (int i = 0; i < 7; i++) {
		    int random11 = random.nextInt(2000) + 1;
		    if (V1.Add(random11)) {
		        System.out.println("נוסף: " + random11);
		    } else {
		        System.out.println("נכשל בהוספה: " + random11);
		    }
		    System.out.println(V1); // מציג את המצב הנוכחי של הוולקנו
		}
	 
	 		V1.Print();
	 		System.out.println(V1);
	 		System.out.println(V1.Averege());
	 		V1.Fix(2, 1);
	 		V1.maxUnder(11);
	 		V1.Delete(1);
	 		V1.DeleteAll();
	 		 
	 		

	 
		}}


