package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class VlookUp_Example {

	public static void main(String[] args) {
		ArrayList<String> arV= new ArrayList<String>();
		arV.add("Agya Ram");
		arV.add("Ram Murti");
		arV.add("RAJESH KUMAR ");
		arV.add("TIKKA SINGH");
		arV.add("SEWA SINGH");
		arV.add("Kanta");
		arV.add("Sudarshan Dayal");
		arV.add("Jaiveer Singh");
		arV.add("Raj Kumar");
		arV.add("Sher Singh");
		arV.add("Mam Chand");
		arV.add("Balwinder Singh Khokhar");
		arV.add("RAMAN KUMAR");
		arV.add("RAMANDEEP SINGH");
		arV.add("MANDEEP SINGH");
		arV.add("BALDEV KUMAR");
		arV.add("Charat Singh");
		arV.add("JASVINDR SINGH");
		arV.add("BHUPINDER SINGH");
		arV.add("Pushpinder Kaur");
		arV.add("Ashok Pal");
		arV.add("Sita Ram");
		arV.add("Anil Kumar");
		arV.add("Agya Ram");
		arV.add("Suresh Pal");
		arV.add("Gian Singh");
		arV.add("Jaipal");
		arV.add("MAN SINGH");
		arV.add("Abdul Ahmad");
		arV.add("Tejo Devi");
		arV.add("AJIT SINGH");
		arV.add("Jot Ram");
		arV.add("Usha Saini");
		arV.add("NAJEER AHMAD");
		arV.add("Raghubir Singh");
		arV.add("Moti Ram");
		arV.add("Panch Ram");
		arV.add("Ram Chander");
		arV.add("Shyam Lal");
		arV.add("hoshiar singh");
		arV.add("Hardeep Singh");
		arV.add("Shri Ram");
		arV.add("PARVEEN KUMAR");
		arV.add("CHARANJEET");
		arV.add("CHARANJEET");
		arV.add("Kamaljeet Kaur");
		arV.add("MOHINDER PAL SINGH");
		arV.add("MOHINDER PAL SINGH");
		arV.add("Prem Chand");
		arV.add("Jamshed Ali");
		arV.add("Sher Singh");
		arV.add("Gulzar Singh");
		arV.add("Jal Singh");
		arV.add("Bhagwat Dayal Sharma");
		arV.add("Jagmal");
		arV.add("Rajiv ");
		arV.add("Ram Singh");
		arV.add("SATISH KUMAR");
		arV.add("MANGAT RAM");
		arV.add("SANJEEV KUMAR");
		arV.add("Rameshwar");
		arV.add("Mohan Singh");
		arV.add("LAJJA RAM");
		arV.add("GULAB SINGH ");
		arV.add("Ganga Ram");
		arV.add("Ramesh Kumar");
		arV.add("Rajesh Kumar");
		arV.add("Ram Kumar");
		arV.add("Rameshwar Dass");
		arV.add("Parveen");
		arV.add("Mandeep Singh");
		arV.add("DHARAM PAL");
		arV.add("ASHOK KUMAR");
		arV.add("MANJIT KAUR");
		arV.add("Rameshwar Dass");
		arV.add("Ram Kumar");
		arV.add("Rajeshwar Dyal");
		arV.add("Rohan Tyagi");
		arV.add("Nirmal Kumar");
		arV.add("Ratan Lal");
		arV.add("Narinder Kumar");
		arV.add("Gulab Singh");
		arV.add("Nathi Ram");
		arV.add("Jai Ram");
		arV.add("RAJESH KUMAR");
		arV.add("PAWAN KUMAR");
		arV.add("SHER SINGH");
		arV.add("Jeet Ram");
		arV.add("Pawan Kumar");
		arV.add("Lajja Ram");
		arV.add("Krishna");
		arV.add("Satish Kumar");
		arV.add("Ravinder Kumar");
		arV.add("Sher Jung");
		arV.add("Gurcharan ");
		arV.add("Munni Lal");
		arV.add("Pritam Singh");
		arV.add("Satpal");
		arV.add("Jangpal Singh");
		arV.add("Ram Kumar");
		
		ArrayList<String> VlookUp=new ArrayList<String>();
		
		VlookUp.add("Munni Lal");
		VlookUp.add("Pritam Singh");
		VlookUp.add("Satpal");
		VlookUp.add("Jangpal Singh");
		VlookUp.add("Ram Kumar");
		
		VlookUp.retainAll(arV);
		
		Iterator<String> it3=VlookUp.iterator();
		while(it3.hasNext()) {
			String g=it3.next();
			System.out.println(g);
		}
		


	}

}
