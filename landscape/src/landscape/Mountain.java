package landscape;

public class Mountain {
	private String name;
	private float height;
	
	Mountain(String s, float h) {
		this.height = h;
		this.name = s;
	}
	
	public void alg1 (int sum, int[] a){
		for (int i = 0; i < a.length-1; i++){
			for (int j=i+1; j < a.length; j++){
				if (a[i]+a[j] == sum){
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "Mountain " + name + " is big and strong. It's " + height + " meters high.";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
}
