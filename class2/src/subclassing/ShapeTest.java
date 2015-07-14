package subclassing;

class Shape{
	public void draw() {
		System.out.println("Draw shape");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Draw circle");
	}
	
	public void circle() {
		System.out.println("circle()");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Draw rectangle");
	}
	
	public void rectangle() {
		System.out.println("rectangle()");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Draw triangle");
	}
	
	public void triangle() {
		System.out.println("triangle()");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest st = new ShapeTest();
		st.drawShape(new Rectangle());
		st.drawShape(new Triangle());
		st.drawShape(new Circle());
		
		Shape[] sList = {new Circle(), new Rectangle(), new Triangle()};
		for(int i=0; i<sList.length; i++) {
			sList[i].draw();
		}
		
		Circle c;
		if(sList[0] instanceof Circle) {
			c = (Circle)sList[0];
			c.circle();
		}
		
		Rectangle r;
		if(sList[1] instanceof Rectangle) {
			r = (Rectangle)sList[1];
			r.rectangle();
		}
		
		Triangle t;
		if(sList[2] instanceof Triangle) {
			t = (Triangle)sList[2];
			t.triangle();
		}
	
	}
	
	public void drawShape(Shape s){
		s.draw(); //다형성: polymorphism s의 타입에 따라서 함수 실행이 달라진다
	}

}
