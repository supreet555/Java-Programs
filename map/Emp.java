package map;

import java.util.Objects;

public class Emp implements Comparable {
	int id;
	String name;
	int sal;
	
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public String toString() {
		return id + " " + name + " " + sal;
	}
	
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	
	public int compareTo(Object obj) {
		Emp e = (Emp) obj;
		if(this.id>e.id) {
			return 1;
		} else if (this.id<e.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
