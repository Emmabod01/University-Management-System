
import java.util.*;

/*
 * A University Managament System
 * that can perform the following functions:
 * - Get a student details
 * - Add a new student
 * - Edit  student details
 * - Search for students
 * - Delete a student details
 * 
 */



// Student class
class Student{
	
	Scanner scan = new Scanner(System.in);
	
	// delcare instance vriable
    private String studentId, firstName, password, userName, lastName, email, phone, address, gender, dob, year, curriculumID;
    
    
    // initiatlize 
    public Student (String studentId, String userName, String password, String firstName, String lastName, String email, String phone, String address, String gender, String dob, String year, String curriculumID) {
		this.studentId = studentId;
        this.userName = userName; 
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.year = year;
        this.curriculumID = curriculumID;
 }
    
    // Generate getter & setters
    public String getStudentId(){  
        return this.studentId;
    }
    public String getYear(){
        return this.year;
    }
    public String getfirstName(){
        return this.firstName;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getlastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getAddress(){
        return this.address;
    }
    public String getGender(){
        return this.gender;
    }
    public String getDob(){
        return this.dob;
    }
        public String getCurriculumID(){
        return this.curriculumID;
    }
    public void setStudentId( String studentId){   
        this.studentId = studentId;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
     public void setDob(String dob){
        this.dob = dob;
    }
    public void setcurriculumID(String curriculumID){
        this.curriculumID = curriculumID;
    }
    
    
    
    // gets specific student details 
    public void getStudent()
    {
        System.out.println("Student Id: " + getStudentId() + "\n" + "Username: " + getUserName() + "\n" + "Password: " + getPassword() + "\n" + "Student Name: " + getfirstName() + "\n" + "Father Name: " + getlastName() + "\n" + "E-mail: " + getEmail() + "\n" + "Phone: " + getPhone() +  "\n" + "Address: " + getAddress() + "\n"  + "Gender: " + getGender() + "\n" + "DOB: " + getDob() + "\n" + "Year: " + getYear() + "\n" + "Curriculum ID: " +  getCurriculumID());  
        System.out.println();
    }
    
    
    //Adds the students' details to the database
   public void addStudent (){
	  
        System.out.println("Please enter username: ");  //display
        String userName1 = scan.nextLine();  // input
        setUserName(userName1); // set
        
        System.out.println("Password: ");
        String pw = scan.nextLine();
        setPassword(pw);
        
        System.out.println("Please enter your first name: ");
        String yourName = scan.nextLine();
        setfirstName(yourName);
        
        System.out.println("Please enter your last name: ");
        String surname = scan.nextLine();
        setlastName(surname);
        
        System.out.println("Please enter Email: ");
        String yourEmail = scan.nextLine();
        setEmail(yourEmail);
        
        System.out.println("Please enter phone number: ");
        String PhoneNumber = scan.nextLine();
        setPhone(PhoneNumber);
        
        System.out.println("Please enter Address: ");
        String homeAddress = scan.nextLine();
        setAddress(homeAddress);
        
        System.out.println("Please enter Gender: ");
        String sexualOrientation = scan.nextLine();
        setGender(sexualOrientation);
        
        System.out.println("Please enter Date of Birth: ");
        String DateOfBirth = scan.nextLine();
        setDob(DateOfBirth);
        
        System.out.println("Please enter Year: ");
        String schoolYear = scan.nextLine();
        setYear(schoolYear);
        
        System.out.println("Please enter Curriculum Id: ");
        String courseId = scan.nextLine();
        setcurriculumID(courseId);        
   }   
   
   
   
   
    //deletes student's details
   public void deleteStudent(){
       setStudentId("");  // set all variables to empty
       setUserName("");
       setPassword("");
       setfirstName("");
       setlastName("");
       setEmail("");
       setPhone("");
       setAddress("");
       setGender("");
       setDob("");
       setYear("");
       setcurriculumID("");
   }
   
   
   
   // display student's details based on search criteria
   public void searchStudent() {    
    
       System.out.println("Student Id: " + getStudentId() + " ; " + " First Name: " + getfirstName() +  " ; "  + " Surname: " + getlastName());
   }
   
   

   // edit student's details - choose th
   public void editStudent(){      
       
       System.out.println("Press 1 edit to Email");
       System.out.println("Press 2 to edit Phone number");
       String tempPress = scan.nextLine();
       
        if (tempPress.equals("1")){      
            System.out.println("OldEmail: " + getEmail());   
            System.out.println( "Please enter new email:");
            String newEmail = scan.nextLine();             
            setEmail(newEmail);
            System.out.println("NewEmail: " + getEmail());        
        }
   

        else if (tempPress.equals("2")){
            System.out.println("Old Phone: " + getPhone());
            System.out.println( "Please enter new phone number: ");
            String newPhone = scan.nextLine();
            setPhone(newPhone);
            System.out.println("New Phone: " + getPhone()); 
        }

       else 
       System.out.println("Please enter a valid number");
   } 
}


    
public class UnivMgtSys {
    
    public static void main(String[] args) {
    	
    	 Scanner scan = new Scanner(System.in);     	 
    	 boolean flag = false;    	 
    	 int count = 0;
    	
    	 // creating objects of the class student
    	Student student1 = new Student("1","katiew","katie1234","Kate","Walters","katwal@aol.com","3342522374","P.0. Box 100","F","01/01/2001","2001","GCSE");
    	Student student2 = new Student("2", "lawry", "lawduck44", "Lawrence", "Duck", "larry@aol.com", "0725223344", "P.0. Box 101", "M", "01/01/2002","2001","EECE");
    	Student student3 = new Student("3", "Chardon", "chaliedon653", "Charlie", "Donald", "charl@aol.com", "0725246344", "P.0. Box 102", "M", "01/01/2003","2003","GCSE");
    	Student student4 = new Student("", "", "", "", "", "", "", "", "", "", "", "");
    	Student student5 = new Student("5", "SanB", "sandBuk232", "Sandie", "Buck", "sanB@aol.com", "4572522365", "P.0. Box 103", "M", "01/01/2004","2004","EECE");
    	Student student6 = new Student("", "", "", "", "", "", "", "", "", "","","");
    	Student student7 = new Student("7", "Annpak", "park392", "Anne", "Parker", "anne@aol.com", "4385550871", "P.0. Box 104", "M", "01/01/2005","2005","GCSE");
    	
    	// creating an Arraylist and adding objects to it
    	ArrayList<Student>studentList = new ArrayList<Student>();
    	
    	studentList.add(student1);
    	studentList.add(student2);
    	studentList.add(student3);
    	studentList.add(student4);
    	studentList.add(student5);
    	studentList.add(student6);
    	studentList.add(student7);

    	

    	
           //University Managment System Main Menu display
    	
           System.out.println("******** University Management System *********"+ "\n" 
           +"*1 Get Student                                       *" + "\n" + "*2 Add student                                       *" + "\n" + "*3 Edit student                                      *" + "\n" +"*4 Search student                                    *" + "\n" + "*5 Delete student                                    *"+ "\n" + "*6 Exit                                              *"+ "\n" + "*Please select an option between 1-6. Thank you      *"+ "\n" + "******************************************************");

           int selection = scan.nextInt();
            
           //start a switch case
           switch (selection) {

            case 1: // Get details of  a student
            System.out.println("Get Student"); 
            System.out.println("Please enter the student ID: ");
            
            Scanner scanId = new Scanner(System.in);
            
            String studentID = scanId.nextLine();            
            
           
            while(count < studentList.size()){             	
            
            	if (studentList.get(count).getStudentId() .equals(studentID)){ //to compare the input studentID with available ones
            			studentList.get(count).getStudent();   // if matches, get the student and perform the fucntion getStudent
            			flag = true;
            	}
            	count++;
            } 
            if (flag == false)
            System.out.println("Student ID not exist, Thank You!");   
            
            scanId.close();

            break;
            

            
            case 2: // to add a new student
            System.out.println("Add student");        
          
            try {    	// applying the try catch block to handle exceptions
            	
	          while(count < studentList.size()){        	
	            	
	            	if (studentList.get(count).getStudentId().equals("")) { // to check for exisitng space
	            		flag = true;
	            		System.out.println("Adding student to an existing index");
	            		String lastStudentId = studentList.get(studentList.size()-1).getStudentId();
		            	Integer newStudId = (Integer.parseInt(lastStudentId)) + 1; 
		            	String newStudentId = newStudId.toString();           	
	            		studentList.get(count).addStudent();
	            		studentList.get(count).setStudentId(newStudentId); // set new student ID
		            	System.out.println("Successful submission! Your Student ID is: " + newStudentId + "; Please keep for future reference");
	            		studentList.get(count).getStudent();
	            		
	            		break;
	            	}
	            	count++;
	            }
	         
            
	           if (flag == false) {   // adding to the last index if no emptyh space found
	            	System.out.println("Adding student to the last index");
	            	String lastStudentId = studentList.get(studentList.size()-1).getStudentId();
	            	Integer newStudId = (Integer.parseInt(lastStudentId)) + 1;
	            	String newStudentId = newStudId.toString();
	            	
	            	Student newStudent = new Student("", "", "", "", "", "", "", "", "", "","","");          	
	            	studentList.add(newStudent);
	            	studentList.get(count).addStudent();
	            	studentList.get(count).setStudentId(newStudentId); // set new student ID
	            	System.out.println("Successful submission! Your Student ID is: " + newStudentId + "; Please keep for future reference");
	            	studentList.get(count).getStudent();          	
	            } 
	           
            }
            catch (IndexOutOfBoundsException | NullPointerException e ) {
        		System.out.println("We do not posses that capacity at our school!!");    
        	}
            
            break;
            
            
           

            case 3:// edit an existing student
            System.out.println("Edit student");
            System.out.print("Please enter the student ID:");
            

            Scanner scanEdit = new Scanner(System.in);
            
            String idEdit = scanEdit.nextLine();
            
            while(count < studentList.size()){              	 
            	          		
            		if (studentList.get(count).getStudentId() .equals(idEdit)){ //to compare the input studentID with available ones
            			studentList.get(count).editStudent();   // if matches, perform the edit fucntion editStudent
            			flag = true;
            		}            		
            		
            		count++;
            }
            if(flag == false)
            System.out.println("Student ID not exist, Thank You!");
            
            scanEdit.close();

            break;
            
        

            case 4: //search students with a category or criteria
            System.out.println("Search students");
            System.out.println("Enter your search criteria (1 for search by year, 2 for search by curriculumId: ");
            
            Scanner scanSearch = new Scanner(System.in);
            String searchCriteria = scanSearch.nextLine();
           
                                           
            if (searchCriteria.equals("1")) { // search  using criteria  year
                System.out.println("Enter the year: ");
                
                String year = scanSearch.nextLine();
                
                while(count < studentList.size()){
            
                    if (studentList.get(count).getYear().equals(year)){
                      studentList.get(count).searchStudent();  
                      flag = true;
                    }
                    count++;                   
                } 
                if(flag == false)
                System.out.println("This year is not available");
                
            }
            else if (searchCriteria.equals("2")) {   // search using criteria  curriculum ID
                System.out.println("Enter the Curriculum Id: ");
                
               String currId = scanSearch.nextLine();
                
                while(count < studentList.size()){
                    
                    if (studentList.get(count).getCurriculumID().equals(currId)){
                      studentList.get(count).searchStudent();  
                      flag = true;
                    }
                    count++;                   
                } 
                if(flag == false)
                System.out.println("This Curriculum is not available");
            }
            else
            	
            	System.out.println("Please enter a valid number: " + "\n");
            
            scanSearch.close();
            
            break;

            
            
            case 5: // to delete a student details
            System.out.println("Delete student");
            System.out.println("Enter student ID to be deleted: ");        
            
            Scanner scanDel = new Scanner(System.in);
            String idDel = scanDel.nextLine();
            
            
            while(count < studentList.size()){
                
                if (studentList.get(count).getStudentId().equals(idDel)){  // check if student ID exist
                	studentList.get(count).getStudent();
                	flag = true;
                	
                	System.out.println("Are you sure you want to delete this student? If YES enter 1, or any button to continue");
                    String answer = scanDel.nextLine();
                    
                    if (answer.equals("1")) {                
                    	studentList.get(count).deleteStudent(); 
                        System.out.println("The student has been removed."); 
                        }                    
                    else
                    	 System.out.println("The student deletion canceled.");
                }
                count++;
            }     
                   
            if(flag == false)
            System.out.println("Please the entered ID is not valid");   
            
            scanDel.close();
          
            break;
            
            
                   
            case 6:
            System.out.println("Exit");
            System.out.println( "Thank you for using U.M.S.");
            System.exit(0); // UMS exits   
            break; 
            
            
            default:
    			System.out.println("Please enter a valid option");  		
    		
    		scan.close();    		
           }                 
      }
}
       
  
          

