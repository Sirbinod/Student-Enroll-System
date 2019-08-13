
/**
 * This class contaains 10 method .
 *
 * @author-Sarbin Shrestha (ID-17031201) 
 * @version: 
 *      BlueJ:4.0.1
 *      JAVA:8.0
 */
 
//importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TrainingInsitute implements ActionListener {//creating class TraingInsitute that implements
   private JLabel title,lblDes,lblIns,lblCDur,lblFee,lblDHour,lblSName,lblCNo,lblDPay,lblEDate,lblRNo;
   private JLabel title1,lblDes1,lblIns1,lblCDur1,lblFee1,lblCNo1,lblSName1,lblSDate,lblExDate,lblECenter,lblAwBy,lblVDur;
   private JTextField txtDes,txtIns,txtCDur,txtFee,txtDHour,txtDPay,txtCNo,txtSName,txtEDate,txtRNo;
   private JTextField txtDes1,txtIns1,txtCDur1,txtFee1,txtAwBy,txtVDur,txtCNo1,txtSName1,txtSDate,txtExDate,txtECenter; 
   private JFrame frm;
   private JButton btnAdd,btnCom,btnEStud,btnEStud1,btnClear,btnAdd1,btnDAll; 
   private JPanel p1,p2;
    Course co;
    Certification cer;
    Professional pro;
    // Arraylist created
    ArrayList<Course> list = new ArrayList<Course>();
    
    public void Form(){        
        frm = new JFrame("Training Insitute");//creating frame        
        frm.setLayout(null);
        frm.setSize(700,750);//the size of the frame setting
        
        p1 = new JPanel();//creating panel1
        frm.add(p1);
        p1.setLayout(null);
        p1.setVisible(true);
        p1.setBounds(16,10,650,280);       
        p1.setBorder(BorderFactory.createTitledBorder("Professional Course"));
                
        p2 = new JPanel();//creting panel2
        frm.add(p2);
        p2.setLayout(null);
        p2.setVisible(true);
        p2.setBounds(16,300,650,400);        
         p2.setBorder(BorderFactory.createTitledBorder("Certification Course"));
        //creating GUI include Label TextField and Buttons with appropriate bounds
        lblDes = new JLabel("Description :");
        lblIns = new JLabel("Instructor :");
        lblCDur = new JLabel("Course Duration :");
        lblFee = new JLabel("Fee :");
        lblDHour = new JLabel("Daily Hour :");
        lblDPay = new JLabel("Down Payment :");
        lblCNo =new JLabel("Course NO.# :");
        lblSName =new JLabel("Student Name :");
        lblEDate =new JLabel("Enroll Date :");
        lblRNo =new JLabel("Room No.# :");
        
        lblDes1 = new JLabel("Description :");
        lblIns1 = new JLabel("Instructor :");
        lblCDur1 = new JLabel("Course Duration :");
        lblFee1 = new JLabel("Fee :");
        lblAwBy = new JLabel("Awarded By :");
        lblVDur = new JLabel("Valid Duration :");
        lblCNo1 = new JLabel("Course NO.# :");
        lblSName1 = new JLabel("Student Name :");
        lblSDate = new JLabel("Start Date :");
        lblExDate = new JLabel("Exam Date :");
        lblECenter = new JLabel("Exam Center :");
        
         
        txtDes = new JTextField();
        txtIns = new JTextField();
        txtCDur = new JTextField();
        txtFee = new JTextField();
        txtDHour = new JTextField();
        txtDPay = new JTextField();
        txtCNo = new JTextField();
        txtSName = new JTextField();
        txtEDate = new JTextField();
        txtRNo = new JTextField();
        
        txtDes1 = new JTextField();
        txtIns1 = new JTextField();
        txtCDur1 = new JTextField();
        txtFee1 = new JTextField();
        txtAwBy = new JTextField();
        txtVDur = new JTextField();        
        txtCNo1 = new JTextField();
        txtSName1= new JTextField();
        txtSDate = new JTextField();
        txtExDate = new JTextField();
        txtECenter = new JTextField();
       
        
        lblDes.setBounds(10,30,100,20);
        lblIns.setBounds(10,60,100,20);
        lblCDur.setBounds(10,90,100,20);
        lblFee.setBounds(10,120,100,20);
        lblDHour.setBounds(330,90,100,20);
        lblSName.setBounds(10,150,100,20);
        lblDPay.setBounds(330,180,100,20);
        lblCNo.setBounds(10,180,100,20);        
        lblEDate.setBounds(10,210,100,20);
        lblRNo.setBounds(330,210,100,20);
        
        lblDes1.setBounds(10,30,100,20);
        lblIns1.setBounds(10,60,100,20);
        lblCDur1.setBounds(10,90,100,20);
        lblFee1.setBounds(330,90,100,20);
        lblAwBy.setBounds(10,120,100,20);
        lblVDur.setBounds(10,150,100,20);
        lblSName1.setBounds(10,210,100,20);
        lblCNo1.setBounds(10,240,100,20);
        lblSDate.setBounds(330,240,100,20);
        lblExDate.setBounds(10,270,100,20);
        lblECenter.setBounds(10,300,100,20);
       
        txtDes.setBounds(120,30,520,20);
        txtIns.setBounds(120,60,520,20);
        txtCDur.setBounds(120,90,200,20);
        txtFee.setBounds(120,120,200,20);
        txtDHour.setBounds(440,90,200,20);
        txtSName.setBounds(120,150,520,20);
        txtDPay.setBounds(440,180,200,20);
        txtCNo.setBounds(120,180,200,20);       
        txtEDate.setBounds(120,210,200,20);
        txtRNo.setBounds(440,210,200,20);
        
        txtDes1.setBounds(120,30,520,20);
        txtIns1.setBounds(120,60,520,20);
        txtCDur1.setBounds(120,90,200,20);              
        txtFee1.setBounds(440,90,200,20);
        txtAwBy.setBounds(120,120,520,20);
        txtVDur.setBounds(120,150,520,20);             
        txtSName1.setBounds(120,210,520,20);
        txtCNo1.setBounds(120,240,200,20);
        txtSDate.setBounds(440,240,200,20);
        txtExDate.setBounds(120,270,200,20);
        txtECenter.setBounds(120,300,520,20);
       
        
        p1.add(lblDes);
        p1.add(txtDes);
        p1.add(lblIns);
        p1.add(txtIns);
        p1.add(lblCDur);
        p1.add(txtCDur);
        p1.add(lblFee);
        p1.add(txtFee);
        p1.add(lblDHour);
        p1.add(txtDHour);
        p1.add(lblDPay);
        p1.add(txtDPay);
        p1.add(lblCNo);
        p1.add(txtCNo);
        p1.add(lblSName);
        p1.add(txtSName);
        p1.add(lblEDate);
        p1.add(txtEDate);
        p1.add(lblRNo);
        p1.add(txtRNo);
        
        p2.add(lblDes1);
        p2.add(txtDes1);
        p2.add(lblIns1);
        p2.add(txtIns1);
        p2.add(lblCDur1);
        p2.add(txtCDur1);
        p2.add(lblFee1);
        p2.add(txtFee1);
        p2.add(lblAwBy);
        p2.add(txtAwBy);
        p2.add(lblVDur);
        p2.add(txtVDur);
        p2.add(lblCNo1);
        p2.add(txtCNo1);
        p2.add(lblSName1);
        p2.add(txtSName1);
        p2.add(lblSDate);
        p2.add(txtSDate);
        p2.add(lblExDate);
        p2.add(txtExDate);
        p2.add(lblECenter);
        p2.add(txtECenter);
        
       
        
         btnAdd = new JButton("ADD");
         btnCom = new JButton("Complete");
         btnEStud = new JButton("Enroll Student");
         btnAdd1 = new JButton("ADD");
         btnEStud1 = new JButton("Enroll Student");
         btnClear = new JButton("Clear");
         btnDAll = new JButton("Display All");
         
        btnAdd.setBounds(440,120,200,20);
        btnCom.setBounds(220,240,200,20);
        btnEStud.setBounds(440,240,200,20);
        btnAdd1.setBounds(440,180,200,20);
        btnEStud1.setBounds(440,330,200,20);
        btnClear.setBounds(220,360,200,20);
        btnDAll.setBounds(440,360,200,20);
        
        p1.add(btnAdd);
        p1.add(btnCom);
        p1.add(btnEStud);
        p2.add(btnAdd1);
        p2.add(btnEStud1);
        p2.add(btnClear);
        p2.add(btnDAll);
        
        frm.setVisible(true);//the frame to visibility
        
        btnAdd.addActionListener(this);
        btnAdd1.addActionListener(this);
        btnEStud.addActionListener(this);
        btnDAll.addActionListener(this);
        btnEStud1.addActionListener(this);
        btnCom.addActionListener(this);
        btnClear.addActionListener(this);
                
    }
    //overriding the base class method
    public void actionPerformed(ActionEvent e){        
        if (e.getSource() == btnAdd){             
            addCourseToProfessional();
        }        
        if (e.getSource()==btnAdd1){
           addCourseToCertification();
        }
        if (e.getSource() == btnEStud){
            enrollToProfessional();
        }
        if (e.getSource() == btnEStud1){
            enrollToCertification();
        }
        if (e.getSource() == btnDAll){
            displayAll();
        }
        if (e.getSource()==btnCom){
            complete();
        }
        if (e.getSource() == btnClear){
            clear();
        }
    }
                  
    
    //method of addCourseToProfesssional
    public void addCourseToProfessional(){
        try{
           if(txtDes.getText().isEmpty() || txtIns.getText().isEmpty() || txtCDur.getText().isEmpty() || txtFee.getText().isEmpty() || txtDHour.getText().isEmpty()){
                throw new NoSuchFieldException();
           }else{               
                String coursesName = txtDes.getText();
                String instructorsName = txtIns.getText();
                int totalHours = Integer.parseInt(txtCDur.getText());
                int courseFee = Integer.parseInt(txtFee.getText());
                int dailyHour = Integer.parseInt(txtDHour.getText());             
                Professional pro  = new Professional (coursesName, instructorsName,courseFee,totalHours,dailyHour);
                list.add(pro);                
                JOptionPane.showMessageDialog(frm, "Successfull add the course.");
                txtDes.setText("");
                txtIns.setText("");
                txtCDur.setText("");
                txtFee.setText("");
                txtDHour.setText("");
            }
        }                           
        catch(NoSuchFieldException F){
             JOptionPane.showMessageDialog(frm,"Warning! Empty Text Box");
            }
            catch(Exception E){                                
                JOptionPane.showMessageDialog(frm, "input the correct value");
            }
    }
    
        //method of addCourseToCertification
    public void addCourseToCertification(){        
        try{
            if(txtDes1.getText().isEmpty() || txtIns1.getText().isEmpty() || txtCDur1.getText().isEmpty() || txtFee1.getText().isEmpty() ||txtAwBy.getText().isEmpty() || txtVDur.getText().isEmpty()){                
                throw new NoSuchFieldException();
            }else{                
                String coursesName = txtDes1.getText();
                String instructorsName = txtIns1.getText();
                int totalHours = Integer.parseInt(txtCDur1.getText());
                int courseFee = Integer.parseInt(txtFee1.getText());
                String certificateAwardedBy = txtAwBy.getText();
                String validTill = txtVDur.getText();            
                Certification cer = new Certification (coursesName,instructorsName,courseFee,totalHours,certificateAwardedBy,validTill);
                list.add(cer);
                JOptionPane.showMessageDialog(frm, "successfull add the course");
                txtDes1.setText("");
                txtIns1.setText("");
                txtCDur1.setText("");
                txtFee1.setText("");
                txtAwBy.setText("");
                txtVDur.setText("");
            }
        }        
        catch(NoSuchFieldException F){            
            JOptionPane.showMessageDialog(frm,"Warning! Empty Text Box");
        }        
        catch(Exception E){
            JOptionPane.showMessageDialog(frm, "Input the correct value");
        }
    }
    //method of enrollToProfessional
    public void enrollToProfessional(){ 
        try{
            String studentName = txtSName.getText();
            String enrollDate = txtEDate.getText();
            String roomNo = txtRNo.getText();
            int downPayment = Integer.parseInt(txtDPay.getText());
            int courseNo = Integer.parseInt(txtCNo.getText())-1;
            if (courseNo > list.size()){                
                JOptionPane.showMessageDialog(frm, "Invalid");
            }else{                
                Course co = list.get(courseNo);
                if(co instanceof Professional){                    
                    Professional prof = (Professional)co;
                    prof.enrollStudent(studentName,enrollDate,downPayment,roomNo);
                    JOptionPane.showMessageDialog(frm, "Enrolled");
                     txtSName.setText("");
                     txtCNo.setText("");
                     txtDPay.setText("");
                     txtEDate.setText("");
                     txtRNo.setText("");
 
                }else{
                    JOptionPane.showMessageDialog(frm,"Not of Professional");
                                   }
            }
        }catch(Exception E){
                JOptionPane.showMessageDialog(frm, "Input the correct value");
        }                           
    }
    //method of enrollCertification
    public void enrollToCertification(){
        try{  
            String studentName  = txtSName1.getText();
            String startDate = txtSDate.getText();
            String examDate = txtExDate.getText();
            String examCenter = txtECenter.getText();
            int courseNo = Integer.parseInt(txtCNo1.getText())-1;
           
            if (courseNo > list.size()){
                JOptionPane.showMessageDialog(frm, "Invalid");
            }
            else{
                Course co = list.get(courseNo);
                if (co instanceof Certification){
                    Certification cert = (Certification)co;
                    cert.enrollingStudent(studentName,startDate,examDate,examCenter);
                    JOptionPane.showMessageDialog(frm, "enrolled");
                    txtSName1.setText("");
                    txtCNo1.setText("");
                    txtSDate.setText("");
                    txtExDate.setText("");
                    txtECenter.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(frm, "Not of Certification");
                }
            }
       }catch(Exception E){
             JOptionPane.showMessageDialog(frm, "Input the correct value");
       }
   }
   //method of complete
   public void complete(){
        try{
            int courseNo= Integer.parseInt(txtCNo.getText())-1;
            if (courseNo>list.size()||courseNo<0){
                JOptionPane.showMessageDialog(frm,"Course cannot find");
            }else{
                  Course co = list.get(courseNo);
                  if(co instanceof Professional){                  
                      Professional pro = (Professional)co;
                      pro.courseCompleted();
                      JOptionPane.showMessageDialog(frm,"Course complete!","Congratulation",JOptionPane.INFORMATION_MESSAGE);
                  }else{
                        JOptionPane.showMessageDialog(frm,"The course is not of professional");
                  }
            }
        }catch(Exception e){
              JOptionPane.showMessageDialog(frm,e+"Course is not completed","Error",JOptionPane.ERROR_MESSAGE);
        }
   }
   //method of displayAll
   public void displayAll(){       
       if (list.isEmpty()){           
           JOptionPane.showMessageDialog(frm,"Nothing to Display");
       }else{           
            for(Course co:list){                
                if (co instanceof Professional){                   
                    pro = (Professional)co;
                    pro.display();
                }                
                if (co instanceof Certification){
                    Certification c = (Certification)co;
                    c.display();
                }
            }
       }
   }
   //method of clear
   public void clear(){       
       txtDes.setText("");
       txtIns.setText("");
       txtCDur.setText("");
       txtFee.setText("");
       txtDHour.setText("");
       txtSName.setText("");
       txtCNo.setText("");
       txtDPay.setText("");
       txtEDate.setText("");
       txtRNo.setText("");
           
       txtDes1.setText("");
       txtIns1.setText("");
       txtCDur1.setText("");
       txtFee1.setText("");
       txtAwBy.setText("");
       txtVDur.setText("");
       txtSName1.setText("");
       txtCNo1.setText("");
       txtSDate.setText("");
       txtExDate.setText("");
       txtECenter.setText("");   
   }   
   //main method
   public static void main (String []args){       
       TrainingInsitute a = new TrainingInsitute();
       a.Form();
   }
}