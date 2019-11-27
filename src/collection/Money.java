package collection;

public class Money {
	private int value;
	public Money(int value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;	//value가 들어가서 값 기반 해쉬가 나올 수 있게 된다.
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (value != other.value)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Money [value=" + value + "]";
	}

}
