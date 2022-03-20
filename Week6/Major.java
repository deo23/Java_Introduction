import java.util.*;
/**
 *
 * @author ginaanifahchoirunnisa
 * @modified by Deo
 */
public class Major {
    private String majorName;
    private Program program;
	
    public Major(String majorName, Program program) {
		this.majorName = majorName;
		this.program= program; 
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

	

}
