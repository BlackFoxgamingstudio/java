//3
inport static com.blackfox.travel.Flight.resetALLPassengers;
import static com.blackfox.travel.Flight.getAllPassengers;

//2
System.out.printLn(
	Flight.getAllPassengers());

Flight lax045 = new Flight();
lax045.add1passenger();
lax045.add1passenger();

Flight slc015 - new Flight();
slc015.add1passenger();

System.out.println(
	Flight.getAllPassengers());

//1
	CLass FLight {
		// other members elided for clarity
		int passengers;
		void add1Passenger() {
			if(hasSeating()){
				passengers += 1;
				allPassenger += 1;
			} else
			handleTooMany();
		}
		static int allPassengers;
		static int getAllPassengers;
	}
		static int resetALLPassengers(){
			allPassengers =0;
		}
	}