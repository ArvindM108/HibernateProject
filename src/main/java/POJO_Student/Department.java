package POJO_Student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	
	@Id
	int dept_Id;
	String dept_name;
	
	@OneToOne
	Student std;
	
	public int getDept_Id() {
		return dept_Id;
	}
	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
}
