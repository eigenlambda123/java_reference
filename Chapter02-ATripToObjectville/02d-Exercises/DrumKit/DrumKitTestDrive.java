class DrumKit {
	
	boolean topHat = true;
	boolean snare = true;

	// playSnare method
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	// playTopHat methpd
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

class DrumKitTestDrive {
	public static void main(String [] args) {
		
		
		DrumKit d = new DrumKit();
		

		
		if (d.snare == true) {
			d.playSnare();
			d.snare = false;
		}

		d.playTopHat();

	}
}