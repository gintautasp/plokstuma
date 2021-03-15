
import java.io.IOException; 

import plokstuma.*;
import konsole.*;

public class KreivesIlgisz {
	
	public static void main(String[] args)  throws IOException  {
		
		System.out.println( "Labas Java pasauli .." );
		System.out.println( "Skaiciuosim kreives ilgi:" );	
		
		KonsolesDialogas konsoles_dialogas = new KonsolesDialogas();

		String vardas_failo = konsoles_dialogas.ivestiReiksme (" kreives tasku failas", "kreives_taskai.csv" );	
		
		KreiveIsFailoXXYY kreive_is_failo_xx_yy = new KreiveIsFailoXXYY ( vardas_failo ); 
		Kreive kreive = kreive_is_failo_xx_yy.gautiKreive();

		System.out.println ( kreive.toString() );
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );
	}	
}