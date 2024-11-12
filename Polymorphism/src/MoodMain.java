 class MoodMain {
	 
	 // METHOD OVERRIDING
	 // we achieve method overriding using inheritance
	 // in method overriding, the same method we changes of parent class
	 // inside child class so we can access child class members using upcasting
	 
	 public static void main(String[] args) {
	Mood mood1 = new Mood();
	mood1.moodSwing();
	
	Mood mood2 = new Happy();
	mood2.moodSwing();
	
	Mood mood3 = new Sad();
	mood3.moodSwing();

}
}
 