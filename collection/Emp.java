package collection;
import java.util.Objects;

public class Emp implements Comparable {
	int id;
	String name;
	double sal;
	
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public String toString() {
		return id + " " + name + " " + sal;
	}
	
	public boolean equals(Object obj) {
		Emp e = (Emp) obj;
		return this.id == e.id &&
			   this.name == e.name &&
			   this.sal == e.sal;
	}
	
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	
	public int compareTo(Object obj) {
		Emp e = (Emp) obj;
		if(this.id > e.id)
			return 1;
		else if(this.id < e.id)
			return -1;
		else
			return 0;
	}
}
