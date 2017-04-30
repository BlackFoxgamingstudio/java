Flight lax045 = new Flight(45);
// Add crew members;
// pilot Paty, CoPilot Karl, Marshal Mary
// Add Passengers:
// Bob, Jane, Steve, Lisa

For*person p: lax045)
Sytem.out.println(p.getName());

Iterable<Person> laxIterable = lax045;
Iterator<person> = laxIterable.iterator();
while(persons.hasNext()){
	person p = persons.next();
	Sytem.out.println(p.getName());
}

Public class FlightIterator
implements Iterator<Person> {
	private CrewMember[] crew;
	private Passenger[] roster;
	private int index = 0;
	Public FlightIterator(
		CrewMember[] crew, Passenger[] roster){
		this.crew = crew;
		this.roster = roster;
	}
	boolean hasNext(){
		return index < (crew.length + roster.length);

	}

	Public Person next(){
		Person p = (index < crew.length) ?
		crew[index] : roster[index - crew.lenght];
		index++;
		return p;
	}
	public class Person {
		// other members elided for clarity
		private String name;
	}
	public class CrewMember extends Person{
		//members elided for clearity
	}

	public class Passenger extends Person
	implements Comparable<passenger>{
		// members elided for clarity
	}
}


public class Flightimplements Comparable<Flight>, Iterable<Person> {
	// others members elided for clarity
	private int flightTime;
	private CrewMember[] crew;
	private Passenger[] roster;

	public int compareTo(flight f) {
		Flight f = (Flight) o;
		return flightTime - f.flightTime;
	}
	public Iterator<Person> iterator() {
		return new FlightIterator(crew, roster);
	}

}
