
    
    class Student{
        String name;
}
    class Exam{
        Student student;
        
        void printname(){
            System.out.println("student name is: " + student.name);
        }
            int calculateFinal(Calculator c){
                int soft = 45;
                int hard = 67;
                int resault = c.add(soft,hard)/2;
            System.out.println("Total score for " + student.name + " is " + resault);
                return resault;
            }
}
    
    class Board{
        String subject;
        
        Board(String s){
            this.subject = s;
    }
          
        void display(){
            System.out.print("Today lesson: ");
          if(subject.equalsIgnoreCase("math")){
                System.out.println("   Δ = b² - 4ac  ");
            } else if(subject.equalsIgnoreCase("bio")){
                System.out.println(" The study of the basic building blocks ");
            }
        }
    }
    
    class Classroom{
           Teacher teacher;
           String classname;
           Board board;
           
                Classroom(String cn, Teacher t){
                    this.classname = cn;
                    this.teacher = t;
                    this.board = new Board(cn);
                }
                
            void info(){
                System.out.println(classname + " is taught by " + teacher.name);
            }
                
            void useboard(){
                board.display();
            }
    }
        
    class Teacher{
        String name;
            
            Teacher(String t){
                this.name = t;
         }
}   
    class Calculator{
        
        int add(int a,int b){
            int res = a+b;
            return res;
        }
}
    
    public class Main{
        public static void main(String[] args){
           Student s = new Student();
           s.name = "Yamal";
           
            Exam exam = new Exam();
            exam.student = s;
            exam.printname();
           
            Teacher t1 = new Teacher("Cristiano");
            Teacher t2 = new Teacher("Messi");
            
            Classroom c1 = new Classroom("math",t1);
            Classroom c2 = new Classroom("Bio",t2);
            
            Classroom[] c = {c1,c2};
            
            for(int i=0; i<2;i++){
            c[i].useboard();
            c[i].info();
            }
            
             Calculator calc = new Calculator();
             exam.calculateFinal(calc);
        }  
    }
            
    
    
    
    
    
    
    