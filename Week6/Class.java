import java.util.*;
/**
 *
 * @author ginaanifahchoirunnisa
 * @modified by Deo
 */
public class Class {
    private String className;
	///Association
    private ArrayList<Students> studentlist;
	
    public Class(String className, ArrayList<Students> student) {
	this.className = className;
	this.studentlist = student;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Students> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Students> studentlist) {
        this.studentlist = studentlist;
    }


 
   
	
	
}
