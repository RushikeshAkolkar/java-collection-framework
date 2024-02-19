import java.util.Objects;

public class Students {
	int sid;
	String name;
	long number;
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", number=" + number + "]"+"\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, number, sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(name, other.name) && number == other.number && sid == other.sid;
	}
	public Students(int sid, String name, long number) {
		super();
		this.sid = sid;
		this.name = name;
		this.number = number;
	}
}
