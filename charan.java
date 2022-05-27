class captain{

	void practice () {

		System.out.println("he made them practice");

	}

}



class players extends captain{

	void won() {

		System.out.println("they won the game");

	}

}



class oppositeplayers extends players{

	void wellplayed() {

		System.out.println("they said well played");

	}

}



class coach extends opposite players{

	void called() {

		System.out.println("he had called them");

	}

}

class Main{

	public static void main (String args[]) {

		captain obj  = new captain ();

		players charan = new players();

		oppositeplayers rt = new oppositeplayers();

		coach r2 = new coach();

		

		obj.practice ();

		charan.won();A

		rt.wellplayed ();

		r2.called();

		System.out.println("By using multiple inheritance");

		r2.practice ();

		r2.won();

		r2.wellplayed();

		r2.called();

	}

	}

	