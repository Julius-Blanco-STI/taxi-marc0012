/**
 * @(#)Taxi.java
 *
 * Taxi application
 *
 * @author 
 * @version 1.00 2019/12/11
 */
 
public class Taxi {

	private int x = 0;
	private int y = 0;
	private int destx = 0;
	private int desty = 0;
	private String plateno = null;

	public Taxi (String plateno){
		this.plateno = plateno;
	}
		
    public void run (String s){
    	for(int i = 0; i < s.length(); i++){
	    	char c = s.charAt(i);
	    	
	    		if (c == 'l'){
	    			x--;
	    		}
	    		else if (c == 'd'){
	    			y--;
	    		}
	    		else if (c == 'r'){
	    			x++;
	    		}
	    		else if (c == 'u'){
	    			y++;
	    		}
	    		else{
	    		}
    	}
    }
    public void book(int x, int y){
		destx = x;
		desty = y;
    }
    
    public void reachedDestination() {
    	if(x == destx && y == desty){
    		System.out.println(true);
    	}
    	else{
    		System.out.println(false);
    	}
    }
    
    public void printCurrentLocation (){
    	System.out.println(x + " " + y);
    }
}
    

    	 
	
