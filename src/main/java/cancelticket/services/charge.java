package cancelticket.services;

public class charge {

	public float cancel(int amt) {
		float charge;
		charge=0.1f*amt;
		System.out.println(charge);
		return charge;
	}
}
