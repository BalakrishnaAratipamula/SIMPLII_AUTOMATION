package Object_nd_Instance;

public class InstanceEx {
	int radius;

	public double areaCalculator() {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		InstanceEx inst1 = new InstanceEx();
		inst1.radius = 5;
		double area1 = inst1.areaCalculator();
		System.out.println("Inst2 calculator result " + area1);

		InstanceEx inst2 = new InstanceEx();
		inst2.radius = 10;
		double area2 = inst2.areaCalculator();
		System.out.println("Inst2 calculator result " + area2);
	}
}
