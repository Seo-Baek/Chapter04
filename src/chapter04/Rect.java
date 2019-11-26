package chapter04;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (height*width);
		return result;									//메소드가 내용 기반으로 돌아가도록 오버라이딩한것!
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		
		if (height*width != other.height * other.width) 
			return false;

		return true;
	}


	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}
	
}