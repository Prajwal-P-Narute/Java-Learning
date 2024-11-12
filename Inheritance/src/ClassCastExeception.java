
class ClassCastExeception {
	public static void main(String[] args) {
     Mango1 mango = new Mango1();
     Fruit1 fruit1 = mango;
     
     Fruit1 fruit2 = new Fruit1();
     Mango1 mango4 = (Mango1)fruit2; // gets runtime ClassCastException
}
}
