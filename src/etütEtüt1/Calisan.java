package etütEtüt1;

public class Calisan extends Akademisyen {
	public String ad;
	public String soyad;
	public int telefon;
	public String eposta;
	public Calisan(String ad, String soyad, int telefon, String eposta) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}
	@Override
	public String labDersineGir() {
		// TODO Auto-generated method stub
		return "Lab dersine gir";
	}
	@Override
	public String yemekhaneyiKullan() {
		// TODO Auto-generated method stub
		return "Yemekhaneyi kullan";
	}
	@Override
	public String deneyYap() {
		// TODO Auto-generated method stub
		return "Deney yap";
	}
	
	

}
