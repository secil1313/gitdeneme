package etütEtüt1;

public class OgretimGorevlisi extends Calisan implements IAkademisyenFonksiyonları {

	public OgretimGorevlisi(String ad, String soyad, int telefon, String eposta) {
		super(ad, soyad, telefon, eposta);
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "Asistan [labDersineGir()=" + labDersineGir() + ", yemekhaneyiKullan()=" + yemekhaneyiKullan()
				+ ", deneyYap()=" + deneyYap() + "]";
	}

}
