
	package konsole;

	import java.io.BufferedReader; 
	import java.io.IOException; 
	import java.io.InputStreamReader; 

	public class KonsolesDialogas  {
		
		public BufferedReader reader;
		
		public KonsolesDialogas() {
			
			reader = new BufferedReader ( new InputStreamReader (System.in ) ); 			
		}
		
		public String ivestiReiksme ( String priminimas, String nutylint ) throws IOException {
		
			System.out.print ( priminimas + " [" + nutylint + "] ? " );	
		
			String reiksme = reader.readLine();
			
			if ( reiksme.length() == 0 ) {
			
				reiksme = nutylint;
			}			
			return reiksme;
		}
	}