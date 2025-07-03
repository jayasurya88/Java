public class Student {
    private String name ;
    private int marks ;
    public Student(String name ){
        this.name = name;
        this.marks=0;
    }
    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;

    }
    public void setMarks(int marks){
        this.marks = marks;

    }
    public char calculateGrade(){
        if (marks >= 90){
            return 'A';
        }else if(marks >=75 && marks <= 89){
            return 'B';
        }else if(marks >= 60 && marks<=74 ){
            return 'C';
        }else if (marks >= 40 && marks<=59){
            return 'D';
        }else{
            return 'F';
        }
    }
    public void displayResult(){
        System.out.println("Student Name : "+name);
        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+calculateGrade());
    }
    public static void main(String[] args) {
        Student s1 = new Student("Rohit");

        s1.setMarks(85);
        Student s2 = new Student("Jayasurya",92);
        s1.displayResult();
        s2.displayResult();



    }
}

