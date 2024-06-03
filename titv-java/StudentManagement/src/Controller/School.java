package Controller;

import Model.BitzStudent;
import Model.ITStudent;
import Model.Student;
import View.Validation;
import java.util.*;
import Model.ITStudent;

public class School {
    ArrayList<Student> list = new ArrayList<>();
    Validation valid;

    public School() {
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    public boolean isEmptyList(){
        if (list.isEmpty()){
            System.out.println("empty");
        }
        return false;
    }
    public void addNew(){
        ITStudent itStudent = new ITStudent();
        BitzStudent bitzStudent = new BitzStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of student ");
        System.out.println("1.IT Student ");
        System.out.println("2.Biz Student ");
        System.out.println("Choose: ");
        int a = sc.nextInt();
        sc.nextLine();
        if (a==1){
            list.add(itStudent.addNewOne());
        }
        if (a==2){
            list.add(bitzStudent.addNewOne());
        }
    }
    public void printList(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFullName().compareTo(s2.getFullName());
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }
    }
    public void check() {
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Student student1 = list.get(i);
                Student student2 = list.get(j);

                if (student1.getAddress().getCity().equals(student2.getAddress().getCity())) {

                    System.out.println("City with the same student "+student1.getAddress().getCity());
                    System.out.println("Student with the same CITY ");
                    System.out.println(student1);
                    System.out.println(student2);
                }
            }
        }
    }


    public void findByID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        String id = sc.nextLine();
        BitzStudent bitzStudent;
        ITStudent itStudent;
        for(Student studentList.list) {
            if (studentList.getId().equals(id)){
            	
            }
        }
    }
    public void report(){
        Scanner sc = new Scanner(System.in);
        for (Student student:list){
            BitzStudent bitzStudent;
            ITStudent itStudent;
            if (student instanceof BitzStudent){
                bitzStudent = (BitzStudent) student;
               if (bitzStudent.calculateAverageScore() >=5){
            	   System.out.println(bitzStudent);
                   System.out.println("GPA of biz student: "+ bitzStudent.calculateAverageScore());
               }
            }
            if (student instanceof ITStudent){
                itStudent = (ITStudent) student;
                if (itStudent.calculateAverageScore() >=5){
                    System.out.println(itStudent);
                    System.out.println("GPA of  IT : "+ itStudent.calculateAverageScore());
                }
            }
        }

    }}
    
    
    
    
    
    
    

