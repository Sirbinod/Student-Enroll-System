/**
 * Write a description of class Certification here.
 * @author (Sarbin Shrestha)
 * @id 17031201
 */
public class Certification extends Course{
    int courseFee;
    String startDate;
    String examDate;
    String examCenter;
    String certificateAwardedBy;
    String validTill;
    boolean started;
    public Certification(String coursesName,String instructorsName,int courseFee,int totalHours,String certificateAwardedBy,String validTill){
        super(coursesName,instructorsName,totalHours);//call super class method
        this.courseFee=courseFee;
        this.certificateAwardedBy=certificateAwardedBy;
        this.validTill=validTill;
        startDate="";
        examDate="";
        examCenter="";
        started=false;
        
    }
    public int getCourseFee(){//access the course fee
        return courseFee;
    }
    public String getStartDate(){
        return startDate;
    }
        
    public String getExamDate(){
        return examDate;
    }
    public String getExamCenter(){
        return examCenter;
    }
    public String getCertificateAwardedBy(){
        return certificateAwardedBy;
    }
    public String getValidTill(){
        return validTill;
    }
    public boolean getStarted(){
        return started;
    }
    public void setCourseFee(int courseFee){//set the course fee
        if(started==false){
            this.courseFee=courseFee;
        }else{
            System.out.println("The certification course is already started.");
        }
    }
    //enrolling student method
    public void enrollingStudent(String studentsName,String startDate,String examDate,String examCenter){
        if(started==false){
            super.setStudentsName(studentsName);
            this.startDate=startDate;
            this.examDate=examDate;
            this.examCenter=examCenter;
            started=true;
        }else{
            System.out.println("The certificatioin course start is "+startDate);
           
        }
    }
    //display method
    public void display(){
        super.display();
        if(started==true){
            System.out.println("Name of certificate awarding body: "+certificateAwardedBy);
            System.out.println("Certification validity duration: "+validTill);
            System.out.println("Start Date: "+startDate);
            System.out.println("Exam Date: "+examDate);
            System.out.println("Exam Center: "+examCenter);
           
        }
     }
}

    
    
            
            
        
    