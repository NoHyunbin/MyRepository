package myExercise;

public class MultiSphere {
	
	public static void main(String[] args) {
		Sphere sp1 = new Sphere();
		Sphere sp2 = new Sphere(5);
		
		System.out.println(sp1);
		sp1.setDiameter(5);
		System.out.println(sp1);
		System.out.println(sp2);
		sp2.setDiameter(7);
		System.out.println(sp2);
	}
}
