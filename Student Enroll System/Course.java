
/**
 * Write a description of class Course here.
 * @author (Sarbin Shrestha)
 * @id 17031201
 */ 
public class Course{
    String coursesName;
    String instructorsName;
    int totalHours ;
    String studentsName;
    public Course(String coursesName,String instructorsName, int totalHours){
        this.coursesName=coursesName;
        this.instructorsName=instructorsName;
        this.totalHours=totalHours;
        studentsName="";
    }
public String getCoursesName(){//access the course name
    return coursesName;
}
public String getInstrucutorsName(){
    return instructorsName;
}
public int getTotalHours(){
    return totalHours;
}
public String getStudentsName(){
    return studentsName;
}
public void setStudentsName(String studentsName){//set the student name
    this.studentsName=studentsName;
}
public void display(){//display method
    System.out.println("Course Name: "+coursesName);
    System.out.println("Instruction's Name: "+instructorsName);
    System.out.println("Total Hours: "+totalHours);
    if(!studentsName.equals("")){
        System.out.println("Student's Name: "+studentsName);
    }
}
}

    
        
    