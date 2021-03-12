package edu.ifunpas.praktikum.daspro.latihan2;

public class PrakB5_203040119 {

	public static void main (String [] args) {
		// Program dalam bahasa java yang menghasilkan output operasi logika.
		
        System.out.println("Operasi AND");
        System.out.println("true&&true = " + (true&&true));
        System.out.println("true&&false = " + (true&&false));
        System.out.println("false&&true = " + (false&&true));
        System.out.println("false&&false = " + (false&&false));
        
        System.out.println("--------------------------------");
        
        System.out.println("Operasi OR");
        System.out.println("true||true = " + (true||true));
        System.out.println("true||false = " + (true||false));
        System.out.println("false||true = " + (false||true));
        System.out.println("false||false = " + (false||false));
        
        System.out.println("--------------------------------");
        
        System.out.println("Operasi XOR");
        System.out.println("true^true = " + (true^true));
        System.out.println("true^false = " + (true^false));
        System.out.println("false^true = " + (false^true));
        System.out.println("false^false = " + (false^false));
        
        System.out.println("--------------------------------");
        
        System.out.println("Operasi NOT");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
    }
}