package dvocas5_utorak.zadatak1;

import java.util.GregorianCalendar;

public class PriemeriDatuma {

	public static void main(String[] args) {
		GregorianCalendar danasnjiDatum = new GregorianCalendar();
		System.out.println(danasnjiDatum.getTime());
		int godina = danasnjiDatum.get(GregorianCalendar.YEAR);
		int mesec = danasnjiDatum.get(GregorianCalendar.MONTH);
		int dan = danasnjiDatum.get(GregorianCalendar.DAY_OF_MONTH);
		
		danasnjiDatum.set(GregorianCalendar.YEAR, 2025);
		System.out.println(danasnjiDatum.getTime());
		
		danasnjiDatum.add(GregorianCalendar.MONTH, 7);
		System.out.println(danasnjiDatum.getTime());		
		

	}

}
