//9

public class Hangar {	
	
	public static void main(String[] args) {

//10		
//11
		
		Boat titanic = new Boat("Titanic");
		titanic.setKilometers(1515745151);
		System.out.println("Je suis le " + titanic.getBrand() + titanic.doStuff());
		
		
		Car audiRs5 = new Car("AudiRs5");
		audiRs5.setKilometers(0);
		System.out.println("Je suis une " + audiRs5.getBrand() + audiRs5.doStuff());		
	}

}