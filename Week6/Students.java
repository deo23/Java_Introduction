import java.util.*;
/**
 *
 * @author ginaanifahchoirunnisa
 * @modified by Deo
 */
public class Students {
        private String name;
	private String id;
	private Class nameClass;
	private ArrayList<Contact> phone;
	
	private Major major;
	
	

    public Students(String name, String id, Class className) {
		this.name = name;
		this.id = id;
		this.nameClass = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Class getNameClass() {
        return nameClass;
    }

    public void setNameClass(Class className) {
        this.nameClass = className;
    }

    public ArrayList<Contact> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<Contact> phone) {
        this.phone = phone;
    }
	
	
	// --> dependency 
	public void Adviser(Adviser academicAdviser) {
		System.out.println("Academic Adviser : " + academicAdviser.getAdviser());
	}
	


	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
}
