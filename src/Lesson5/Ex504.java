package Lesson5;

public class Ex504 {
	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height * 1/2;
		return ans;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double ans = calcTriangleArea(bottom, height);
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + ans + "cm2");
		
		double radius = 5.0;
		double area = calcCircleArea(radius);
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + area + "cm2");
	}
}
