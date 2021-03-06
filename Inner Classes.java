public class FlightIterator
	implements Iterator<Person> {
		private CrewMember[] crew;
		private Passenger[] roster;
		private int index = 0;
	public FlightIterator(
		CrewMember[] crew, Passenger[] roster) {
		this.crew = crew;
		this.roster = roster;

	}
	public boolean hasNext(){
		return index < (crew.lenght + roster.length);
	}
	public Person next(){
	Person p = (index < crew.length) ?
	crew[index] : roster[index - crew.length];
	index++;
	return p;
	}
}

//2
public class FlightIterator
implements Comparable<flight>, Iterable<person> {
// other members elided for clearity
	private CrewMember[] crew;
	private Passenger[] roster;
	public Iterator<Person> iterator(){
		return new FlightIterator(crew, roster);
	}
	private class FlightIterator
		implements Iterator<Person> {
			private int index = 0;
			public boolean hasNext(){
				return index < (crew.length + roster.lenghth);
			}
			public Person next() {
				Person p = (index< crew.length) ?
				crew[index] : roster[index - crew.length];
				index++;
				return p;
			}
	}
}