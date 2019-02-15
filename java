package desktop;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class desktop {

	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int ectsSum = 0;
	    int sum = 0;
	    int size = 0;
	    float ds = 0;
	    
	    System.out.print( "Moechten Sie die Anzahl Faecher eingeben? (ja/nein):" );
	    boolean contains = S.next().toLowerCase().contains("ja");
	    
	    if( contains ) {
		    System.out.print( "Anzahl Faecher: ");
		    size = S.nextInt();
		    int[] noten = new int [size]; 
		    int[] ects = new int [size];
		    for( int i = 0; i < noten.length ; i++){
		    	System.out.print( "Note " + (i+1) + ": " );
		        noten[i] = S.nextInt();
		    }
		    for( int i = 0; i < ects.length ; i++){
		    	System.out.print( "Gewichtung/ECTS " + (i+1) + ": " );
		        ects[i] = S.nextInt();
		        sum += noten[i] * ects[i];
		    } 
		    for (int i = 0; i < ects.length; i++) {
		        ectsSum += ects[i];
		    }
		    ds = sum / ectsSum;
		    System.out.println( "Durchschnitt: " + ds );
	    } else if( !contains ) {
	    	ArrayList<Integer> noten = new ArrayList<Integer>(Arrays.asList());
	    	ArrayList<Integer> ects = new ArrayList<Integer>(Arrays.asList());
	    	System.out.print( "Geben Sie alle Noten ein: ");
	    	while( S.hasNext() ) {
	    		noten.add( Integer.parseInt(br.readLine().trim().split( "\\s+" ) ) );
	    		if( S.hasNextLine() ) { break;}
	    	}
	    	System.out.print( "Geben Sie alle Gewichtungen/ECTS ein: ");
	    	while( S.hasNextInt() ) {
	    		ects.add(S.nextInt());
	    		if( S.hasNextLine() ) { break;}
	    	}
	    	if( ects.size() == noten.size() ) {
	    		for( int i = 0; i < ects.size() ; i++ ) {
			        sum += noten.get( i ) * ects.get( i );
			    } 
			    for (int i = 0; i < ects.size(); i++ ) {
			        ectsSum += ects.get( i );
			    }
	    	}
		    ds = sum / ectsSum;
		    System.out.println( "Durchschnitt: " + ds );
	    } 
		System.exit(0);
	}
}
