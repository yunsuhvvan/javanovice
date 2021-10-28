package oop3;

class Cylinder {
	/* 필드와 메소드를 구현하시오. */
	 int radius;
	 int height;
	 
	  public Cylinder() {
		  this(0,0);
	  }
	 
	  public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	
	 
public double getVolume() {
	
  return radius * radius * Math.PI *height;
	
}

public double getArea() {
	
    return (radius * radius * Math.PI *2) + ((radius*2) *Math.PI *height);
	
}
	 
	 
}

public class CylinderTest {
	  public static void main(String[] args) {
	    // 객체 생성
	    Cylinder c = new Cylinder();
	    
	    // 속성 값 입력
	    c.radius = 4;
	    c.height = 5;
	    
	    // 출력
	    System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
	    System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
	  }
	}


//실행 결과
//원기둥의 부피: 251.33
//원기둥의 겉넓이: 226.19

