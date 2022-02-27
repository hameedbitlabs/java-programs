

class NarrowCast {
	public static void main(String args[]){
		int radius=3;
		float pie=3.14f;
		float area=2*pie*radius;
		System.out.println(area);
		int newarea=(int)area;
		System.out.println(newarea);
	}
}