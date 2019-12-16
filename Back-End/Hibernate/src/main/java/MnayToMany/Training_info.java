package MnayToMany;

import java.util.List;

import javax.persistence.*;

import com.cap.onetoone.Employee_info;

@Entity
@Table
public class Training_info {
	@Id
	@Column
private int tId;
	@Column
private String tName;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="training_employee",joinColumns=@JoinColumn(name="tid"),inverseJoinColumns=@JoinColumn(name="eid"))
private List<Employee_info> eList;
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
public List<Employee_info> geteList() {
	return eList;
}
public void seteList(List<Employee_info> eList) {
	this.eList = eList;
}
@Override
public String toString() {
	return "Training_info [tId=" + tId + ", tName=" + tName + ", eList=" + eList + "]";
}


}
