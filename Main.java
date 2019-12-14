/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2019/12/11
 */


public class Main {
    	public static void main(String[] args){
    		Taxi x = new Taxi("AMR1221");
    		x.book(10,1);
    		//x.run("i am leaving in a helicopter");
    		x.run("rrrrrrrrrru");
    		x.printCurrentLocation();
    			//X:0 , Y:0\	
    		x.book (10,10);
    		x.reachedDestination();

    	}
}