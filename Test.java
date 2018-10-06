package registration;



class Student{
	 
     String name;
     int ID;
     
   
	 public Student(String name, int ID) {
	     this.name = name;
	     this.ID = ID;
}
     public String getname() {
	     return this.name;
   }
     
     public int ID() {
    	 return this.ID;
     }
   
     public void setname(String name) {
	     this.name = name;
			   }
 }
 
 
 class course{
	 
	 String title;
	 int numberOfstudent;
	 Student[] array ;
	 
	 public course(String title){
		
		 this.title = title;
		 
		 this.numberOfstudent= 0;
		 this.array = new Student[10];
	 }
	 public Student[] getStudents(){
	     return this.array;
	 }
	 
	 public String gettitle() {
	     return this.title;
   }
	 
	 public int numberOfstudent() {
		 return  this.numberOfstudent;
	 }
	 
	 public boolean isFull() {
		if(this.numberOfstudent >=10)
		 return true;
		else
		 return false;
	 }
	 
	 public void registerStudent (Student student) {
		 if (this.numberOfstudent <10)
			 this.array[this.numberOfstudent] = student;
		 this.numberOfstudent++;
	 }
 
 }
 
   

