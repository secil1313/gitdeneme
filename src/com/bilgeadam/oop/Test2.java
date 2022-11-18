package com.bilgeadam.oop;

public class Test2 {

	public static void main(String[] args) {
		
		Anne a = new Anne();
		a.ad = "Fahriye";
		a.soyad = "Gökyar";
		a.yas = 65;
		a.maas = 33.0;
		a.cinsiyet = true;
		System.out.println("Yaşınız : "+a.YasHesapla(1954));
		a.Uyu(a.ad, a.soyad);
		a.EkranaYaz(a.ad, a.soyad);
		
		Baba b = new Baba();
		b.ad = "Kasım";
		b.soyad = "Gökyar";
		b.EkranaYaz(b.ad, b.soyad);
	
		Cocuk c = new Cocuk();
		c.ad = "İbrahim";
		c.soyad= "Gökyar";
		c.EkranaYaz(c.ad, c.soyad);
		
		AkilliCocuk ak = new AkilliCocuk();
		ak.ad="Hakan";
		ak.soyad = "Yılmaz";
		ak.sifat = "Akıllıdır";
		ak.AdSoyadSifatYaz(ak.ad, ak.soyad, ak.sifat);
		
		UsluCocuk us = new UsluCocuk();
		us.AdSoyadSifatYaz("Mehmet", "Yılmaz", "Usludur");
		
		

	}

}
