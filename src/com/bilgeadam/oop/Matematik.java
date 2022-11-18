package com.bilgeadam.oop;

public class Matematik {
	
	
	public int Topla(int sayi1,int sayi2)
	{
		//local variable
		int sonuc = 0;
		
		sonuc = sayi1+ sayi2;
		
		return sonuc;
	    //return sayi1 + sayi2;
	}
	
	public int Carp(int sayi1,int sayi2)
	{
	
	    return sayi1 * sayi2;
	}
	
	
	public int Bol(int sayi1,int sayi2)
	{
	    return sayi1 / sayi2;
	}
	
	public int Cikar(int sayi1,int sayi2)
	{
	    return sayi1 - sayi2;
	}

	//2 tane int parametre alan ve geriye int tipinde deger dönen bir metot
	
	int a = 5;
}
