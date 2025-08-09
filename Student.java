public class Student {
    private String name;
    private String address;
    private int numCourse=8;
    //define array varaible
    private String [] courses = new String[30];
    private int [] grades = new int[30];

    //constructor
    public Student(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String getName() { //vs code command typing an class then press tab select the constructor and enter
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;

    }@Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + "("+getAddress()+")";
    }
    public void addCourseGrade(String course,int grade){
        if(numCourse<30){
            courses[numCourse] = course;
            grades[numCourse] = grade;
            numCourse++;//use ++ 
        }else{
            System.out.print("Cannot add more than 30 courses"); //display 
        }

    }  
    public void printGrades(){
      System.out.print(this.name+"");
      for(int i=0; i<numCourse;i++){
        System.out.print(courses[i]+":"+grades[i]);
        if(i<numCourse-1) System.out.print(",");
      }
 }
    public double getAverageGrade(){
       if(numCourse==0) return 0.0;
       int sum =0;
    for(int i=0; i<numCourse;i++){
        sum += grades[i];//calculate the grades
     }
     return sum/numCourse;
 }

    
}
