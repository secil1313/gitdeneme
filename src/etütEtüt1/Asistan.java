package etütEtüt1;

public class Asistan extends Calisan implements IAkademisyenFonksiyonları {

	public Asistan(String ad, String soyad, int telefon, String eposta) {
		super(ad, soyad, telefon, eposta);
	}

	@Override
	public void derseGir() {
System.out.println("Derse gir");		
	}

	@Override
	public void quizYap() {
System.out.println("Quiz yap");		
	}

	@Override
	public void sınavYap() {
System.out.println("Sınav yap");		
	}

	@Override
	public String toString() {
		return "Asistan [ad=" + ad + ", soyad=" + soyad + ", telefon=" + telefon + ", eposta=" + eposta + ", bolum="
				+ bolum + ", unvan=" + unvan + ", kapiNo=" + kapiNo + "]";
	}
	

}
