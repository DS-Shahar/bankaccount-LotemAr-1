package lotem1;

public class Volcano {
    private String name;
    private int[] degrees;
    private int count;

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    // Setter עבור name
    public void setName(String name) {
        this.name = name;
    }

    // Getter עבור degrees
    public int[] getDegrees() {
        return this.degrees;
    }

    // Setter עבור degrees
    public void setDegrees(int[] degrees) {
        this.degrees = degrees;
        this.count = degrees.length; // עדכן את ה-count לפי המערך החדש
    }

    public Volcano(Volcano other) {
        count = other.count;
        this.degrees = new int[other.degrees.length];
        for (int i = 0; i < count; i++) {
            degrees[i] = other.degrees[i];
        }
        this.name = other.name;
    }

    public Volcano(String name, int size) {
        this.name = name; // תיקון כאן
        this.count = 0;
        this.degrees = new int[size];
    }

    public boolean Add(int measurement) {
        if (this.count == this.degrees.length) {
            return false; // המערך מלא
        } else {
            this.degrees[count] = measurement;
            count++;
            return true;
        }
    }

    public void Delete(int index) {
        if (index < 0 || index >= count) {
            System.out.println("אינדקס לא חוקי.");
            return; // לא למחוק אם האינדקס לא חוקי
        }
        for (int i = index; i < count - 1; i++) {
            degrees[i] = degrees[i + 1]; // העבר את הערכים למעלה
        }
        degrees[count - 1] = 0; // לנקות את המקום האחרון
        count--; // עדכן את הספירה
    }

    public void DeleteAll() {
        this.count = 0; // לא מחק את המערך, רק את הספירה
    }

    public void Fix(int measurement, int index) {
        if (index >= 0 && index < count) {
            this.degrees[index] = measurement; // ודא שהאינדקס קיים
        } else {
            System.out.println("אינדקס לא חוקי.");
        }
    }

    public int Averege() {
        if (this.count == 0) {
            System.out.println("אין מדידות לחשב ממוצע.");
            return 0; // או זרוק חריגה
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += this.degrees[i];
        }
        return sum / this.count;
    }

    public int maxUnder(int x) {
        int max = x;
        int maxi = Integer.MIN_VALUE; // התחלה מאפס מינימלי
        int pointer = -1; // אם לא נמצא ערך
        for (int i = 0; i < this.count; i++) {
            if (this.degrees[i] < max) {
                if (this.degrees[i] > maxi) {
                    maxi = this.degrees[i];
                    pointer = i;
                }
            }
        }
        return pointer; // אם לא נמצא, יחזור -1
    }

    public void Print() {
        for (int i = 0; i < this.count; i++) { // השתמש ב-count במקום ב-degrees.length
            System.out.println((i + 1) + ") " + this.degrees[i]);
        }
    }

    @Override
    public String toString() {
        return "The amount of measurements are " + this.count + " The size of the array is " + this.degrees.length;
    }
}
