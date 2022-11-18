package com.bilgeadam.oop;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       //System.out.println("Merhaba Dünya");
		// ClassIsmi nesnemizindAdi = new ClassIsmi();
		   Insan       i            = new Insan();
		   i.ad = "ibrahim";
		   i.soyad = "gökyar";
		   i.yas = 45;
		   i.maas = 5000.0;
		   i.cinsiyet = true;
		   
		   i.Uyu(i.ad,i.soyad); // insan class ı içindeki uyu metodunu çağırdık
		   Matematik m = new Matematik();
		   //1. yöntem
		   int gelenDeger = m.Topla(15, 15);
		   System.out.println("Toplam : "+gelenDeger);
		   
		   System.out.println("Yaşınız : "+i.YasHesapla(1978));
		   
		   //2. yöntem
		   System.out.println("Toplam 2. yöntem : "+m.Topla(25, 25));
		   
		   System.out.println("Çarpım Sonucu : "+m.Carp(25, 25));
		   
		   System.out.println("Bölüm Sonucu  : "+m.Bol(25, 25));
		   
		   System.out.println("Çıkan Sonuc  : "+m.Cikar(25, 25));
	}

}
