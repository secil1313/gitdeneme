package com.bilgeadam.oop;

public class Insan 
{   //Başlangıç Scope
   //access modifiers   VeriTipi   DeğişkenAdi 
	//global variable
	public String  ad = null;
	public String  soyad = null;
	public int     yas = 0;// Tamsayısal verileri saklayabiliriz
	public double  maas = 0.0 ; //.Noktalı kesirli ifadelerde double kallanırı 
	public boolean cinsiyet = false; // true yada false şeklinde değer saklarız
	
	//Metotlar 2 ye ayrılırlar
	//Değer Döndüren Metotlar
	//Değer Döndürmeyen Metotlar
	
   //access modifiers dönüştipi metotAdi() {  }
	//Geriye değer döndürmeyen Adı Uyu olan bir metot tanımladık
	  public    void      Uyu(String adi,String soyadi)
	  {
		   System.out.println(adi +" "+ soyadi +" Uyuyor");
	  }
	  
	  public int YasHesapla(int dogumYili)
	  {
		  int sonuc= 0;
		  sonuc =  2022 - dogumYili;
		  return sonuc;
	  }
	  
	  public void EkranaYaz(String adi,String soyadi)
	  {
		  System.out.println("Kişinin Adı : "+adi+" Kişinin Soyadı : "+soyadi);
	  }
	
	
}  // Bitiş Scope
