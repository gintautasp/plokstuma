
	package plokstuma;
	
	import java.lang.Math;	

	public class Kreive {
	
		public Taskas[] taskai;
		public int kiek_tasku;
		
		public Kreive ( int max_tasku ) {
			
			taskai = new Taskas [ max_tasku ];
			kiek_tasku = 0;
		}
		
		public void pridetiTaska ( Taskas taskas ) {
			
			taskai [ kiek_tasku ] = taskas;
			kiek_tasku++;
		}
		
		public double ilgis() {
			
			int i = 0;
			double atstumas = 0;
			
			while ( i < ( kiek_tasku - 1 ) ) {
			
				double x_diff =  taskai [ i ].x  - taskai [ i + 1 ].x;
				double y_diff =  taskai [ i ].y -  taskai [ i + 1 ].y;			
				
				atstumas += Math.sqrt ( x_diff  *  x_diff + y_diff * y_diff );
				i++;
			}
			return atstumas;
		}
		
		public String toString() {
			
			String lentele = 
			
				    "-------------------------------\n" 
				+ "|      x       |       y      |\n"
				+ "-------------------------------\n";
			
			int i = 0;
			
			while ( i < kiek_tasku ) {

				lentele +=	 "|" + String.format ( "%10.3f", taskai [ i ].x ) + "    |" + String.format ( "%10.3f", taskai [ i ].y ) + "    |\n"; 
				i++;
			}
			lentele +=  "-------------------------------\n";
			
			return lentele;
		}
	}