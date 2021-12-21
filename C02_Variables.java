package day01_02Variables;

public class C02_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String  okul="Yildiz Koleji";
		
		//ayni isim ve degisken  turu ile ikini defa variable olusturulamaz
		
		//String okul =Mehmet KOLEJÝ;
		
		//farkli data turu  de olsa ayný isim ile ikinci defa variable olusturulamaz
		
		
		//int okul=20;
		
		
		
		// var olan bir variable'a yeni deger atayabiliriz
		okul="Ankara Koleji";
		System.out.println(okul);
		
		okul="Mehmet Koleji";//Mehmet Koleji
		
		// yazdirma iþleminde acýklama eklemek istersek 
		//mesela okul adý :Mehmet Koleji yazdýralým
		
		
		
		System.out.println(okul);
		
		
		System.out.println("okul adi : "  + okul);
		System.out.println("okul adi : "+"okul");//okul adi:okul
	}

}
