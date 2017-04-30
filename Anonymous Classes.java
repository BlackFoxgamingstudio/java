public class Flight
implements Comparable<Flight>, Iterable<Person> {
	// others memvers elided for clarity
	private CrewMember[] crew;
	private Passenger[] roster;
	public Iterator<Person> iterator() {
		return new FlightIterator();
	}
	private class FlightIterator
		implements Interator<Person> {
			private int index = 0;
			public boolean has Next() {
				return index < )crew.lenght + roster.length);
			}
			public Person next(){
				Person p = (index < crew.length)? 
				Crew[index] : roster[index - crew.length];
				index++;
				return p;
			}
			}
		}
	}