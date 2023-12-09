package datedemos;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class date1 {

	public static void main(String[] args) {
		
   Date d=new Date();
		   System.out.println(d);
		   
		   Date d1=new Date(9999999l);
		   System.out.println(d);
		   
		   Date d2=new Date(2023-12-12);
		   System.out.println(d);
		   
		   Locale l=Locale.getDefault();//to know i which place we are
		   System.out.println(l);
		   
		   Currency c=Currency.getInstance(l);
		   System.out.println(c);
		   System.out.println(c.getCurrencyCode());
		   System.out.println(c.getDisplayName());
		   System.out.println(c.getSymbol());
	}

}
