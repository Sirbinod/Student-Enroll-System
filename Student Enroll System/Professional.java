/**
 * Write a description of class Professional here.
 * @author (Sarbin Shrestha)
 * @id 17031201
 */

public class Professional extends Course{
    private int courseFee;
    private String enrollDate;
    private String roomNo;
    private int dailyHour;
    private int downPayment;
    private boolean started;
    private boolean completed;
    public Professional(String coursesName,String instructorsName,int courseFee,int totalHours,int dailyHour){
        
        super(coursesName,instructorsName,totalHours);//call super class method
        this.courseFee=courseFee;
        this.totalHours=totalHours;
        this.dailyHour=dailyHour;
        enrollDate="";
        roomNo="";
        downPayment=0;
        started=false;
        completed=false;
    }
    
    public int getCourseFee(){//access the course fee
        return courseFee;
    }
    public String getEnrollDate(){
        return enrollDate;
    }
    public String getRomNo(){
        return roomNo;
    }
    public int getDailyHour(){
        return dailyHour;
    }
    public int getDownPayment(){
        return downPayment;
    }
    public boolean getStarted(){
        return started;
    }
    public boolean getCompleted(){
        return completed;
    }
    public void setCourseFee(int courseFee){
        this.courseFee=courseFee;
    }
    public void setDailyHour(int dailyHour){
        this.dailyHour=dailyHour;
    }
    public void setEnrollDate(String enrollDate){//set the enroll date
        this.enrollDate=enrollDate;
    }
    public void setRoomNo(String roomNo){
        this.roomNo=roomNo;
    }
    public void setDownPayment(int downPayment){
        this.downPayment=downPayment;
    }
    public void enrollStudent(String studentsName, String enrollDate, int downPayment, String roomNo){
        if(started==true){
            System.out.println("class already started.");
            System.out.println("Instructor's Name: "+instructorsName);
            System.out.println("Room number is: "+roomNo);
            
        }else{
            setStudentsName(studentsName);
            setEnrollDate(enrollDate);
            setRoomNo(roomNo);
            setDownPayment(downPayment);
            started=true;
            completed=false;
        }
    }
    public void courseCompleted(){//course completed method
if (completed==true){
              System.out.println("course completed");
            }else{
                setStudentsName("");
                enrollDate="";
                downPayment=0;
                started=false;
                completed=true;
               
            }
        }
        public void printout(){//printout method
            System.out.println("Course's Name: "+coursesName);
            System.out.println("Instructor's Name: "+instructorsName);
            System.out.println("Course Fee: "+courseFee);
        }
        //display method
        public void display(){
            super.display();
            if(started==true){
                System.out.println("Completed Status: "+completed);
                System.out.println("Enroll Date: "+enrollDate);
                System.out.println("Down Payment: "+downPayment);
        }
    }
}
              
        
                
        
            
    
    
    