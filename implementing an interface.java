Passenger bob = Passenger();
bob.setLevelAndDays(1, 180);
Passenger jane = new Passenger();
jane.setLevelAndDays(1, 90);
Passenger steve = new Passenger();
steve.setLevelAndDays(2, 180);
Passenger lisa = new Passenger();
lisa.setLevelAndDays(3, 730);

Passenger[] passengers = {bob, jane, steve, lisa};
Arrays.sort(passengers);

Public Class Passenger implements Comparable {
	// others members elided for clarity
	private int memberlevel; .. 3(1st priority), 2, 1
	private int memmberDays;
	public int compareTo(Object o){
		Passenger p = (Passenger) o;
		if(memberlevel > p.memberlevel)
			return -1;
		else if (memberlevel < p.memberlevel)
			return 1;
		else { 
			if(memberDays > p.memberDays)
				return -1;
			else if (memberDays < p.memberDays)
				return 1;
			else
				return 0;
		}
	}
}