package object;

class Mydate{
	int day;
	int month;
	int year;
	
	public Mydate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mydate) {
			Mydate d = (Mydate)obj;
			if(day == d.day & month == d.month & year == d.year) 
				return true;
			else
				return false;
			}	
			return false;
	}

	@Override
	public int hashCode() {
		return year;
		
	}
	
	
		
}



public class MyDateTest {

	public static void main(String[] args) {
		
		Mydate d1 = new Mydate(15, 9, 1997);
		Mydate d2 = new Mydate(15, 9, 1997);
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		

	}

}
