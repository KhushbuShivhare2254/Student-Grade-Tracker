import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name ;
    double grade;
    Student(String name,double grade){
        this.name = name;
        this.grade= grade;

    }
}

public class tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students=new ArrayList<>();
        System.out.println("Enter number of student : "); 
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for(int i =0;i<numStudents;i++){
            System.out.println("Enter name of student"+(i+1)+":");
            String name = scanner.nextLine();

            System.out.println("Enter grade for " +name+" :");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            students.add(new Student(name,grade));
        }
        double total = 0;
        Student highest = students.get(0);
        Student lowest = students.get(0);

        for(Student s : students){
            total +=s.grade;
            if(s.grade>highest.grade) highest =s;
            if(s.grade<lowest.grade) lowest =s;

        }
        double average = total/students.size();
        System.out.println("\n--- Grade Summary ---");
        System.out.printf("Average Grade: %.2f\n",average);
        System.out.println("Highest Grade:"+highest.name+"(" + highest.grade + ")");
        System.out.println("lowest Grade:"+lowest.name+"(" + lowest.grade + ")");
        

    }
    
}
