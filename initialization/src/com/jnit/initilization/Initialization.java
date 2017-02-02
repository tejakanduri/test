/**
 * 
 */
package com.jnit.initilization;

/**
 * @author tejak
 *
 */
public class Initialization {
	private String name = "Fluffy";
	{
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
	

	public Initialization() {
		
		this.name = "Tiny";
		System.out.println("Setting field constructor");
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Initialization i = new Initialization();
		System.out.println(i.name);

	}

}
