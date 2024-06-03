package Controller;

import Model.Address;
import Model.BitzStudent;
import Model.ITStudent;
import Model.Student;
import View.Validation;

import java.util.*;

public class School {
    ArrayList<Student> studentList = new ArrayList<>();
    private Validation validation;
 
    public School(String id, String fullName, Address address,  ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

	public School() {
        validation = new Validation();
		studentList = new ArrayList<>();
		
		
		studentList.add(new Student("1","Long", new Address("USA", "DaNang", "Downtown", "ChuPah")));
		studentList.add(new Student("2","Hoa", new Address("Korea", "DaNang", "Downtown", "ChuPah")));
		studentList.add(new Student("3","Cunny", new Address("China", "LosAngles", "Downtown", "ChuPah")));
		studentList.add(new Student("4","Chovy", new Address("Uc", "usa", "Downtown", "ChuPah")));
		studentList.add(new Student("5","Xuho", new Address("Brazil", "California", "Downtown", "ChuPah")));
		studentList.add(new Student("6","ViciNeko", new Address("USA", "Rio", "Downtown", "ChuPah")));
		studentList.add(new Student("7","Thanh",new Address("Korea", "Rio", "Downtown", "ChuPah")));
		studentList.add(new Student("8","Tung",new Address("VietNam", "DaNang", "Downtown", "ChuPah")));
		studentList.add(new Student("9","Jinx",new Address("VietNam", "DaNang", "Downtown", "ChuPah")));
		studentList.add(new Student("10","Varus",new Address("VietNam", "DaNang", "Downtown", "ChuPah")));
	}
	
	 public ArrayList<Student> getStudentList() {
	        return studentList;
	    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public boolean isEmptyList(){
        if (studentList.isEmpty()){
            System.out.println("List empty");
        }
        return false;
    }
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose type of student:");
        System.out.println("1. IT Student");
        System.out.println("2. Bitz Student");
        int choice = validation.inputInt("Choose: ", 1, 2);

        switch (choice) {
            case 1:
                ITStudent itStudent = new ITStudent();
                itStudent.addNewOne();
                studentList.add(itStudent);
                System.out.println("IT Student added successfully.");
                break;
            case 2:
                BitzStudent bitzStudent = new BitzStudent();
                bitzStudent.addNewOne();
                studentList.add(bitzStudent);
                System.out.println("Bitz Student added successfully.");
                break;
        }
    }

    public void printStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            Collections.sort(studentList, Comparator.comparing(Student::getFullName));
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    	public void findStudentsByCity() {
    		    Set<String> citySet = new HashSet<>();
    		    HashMap<String, Integer> cityCountMap = new HashMap<>();
    		    for (int i = 0; i < studentList.size(); i++) {
    		        String city = studentList.get(i).getAddress().getCity();

    		        if (!citySet.contains(city)) {
    		            citySet.add(city);
    		            cityCountMap.put(city, 1);
    		        } else {
    		            cityCountMap.put(city, cityCountMap.get(city) + 1);
    		        }
    		    }

    		    for (String city : citySet) {
    		        if (cityCountMap.get(city) > 1) {
    		            System.out.println("Thanh pho co trung sinh vien la: " + city);
    		            System.out.println("Cac sinh vien co trung thanh pho la: ");
    		            for (Student student : studentList) {
    		                if (student.getAddress().getCity().equals(city)) {
    		                    System.out.println(student);
    		                }
    		            }
    		            System.out.println("Số lượng sinh viên thuộc thành phố " + city + ": " + cityCountMap.get(city));
    		            System.out.println("=============================================");
    		        }
    		    }
    		}

    	public void findByID() {
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("Enter ID: ");
    	    String id = sc.nextLine();

    	    BitzStudent bitzStudent;
    	    ITStudent itStudent;

    	    for (Student student : studentList) {
    	        if (student.getId().equals(id)) {
    	            System.out.println("Do you want to update (U) or delete (D) the student?");
    	            String choice = sc.nextLine();

    	            if (choice.equals("U")) {
    	                System.out.println("Enter the field you want to edit: ");
    	                System.out.println("1. ID");
    	                System.out.println("2. Name");
    	                System.out.println("3. Account");
    	                System.out.println("4. Marketing");
    	                System.out.println("5. Java Score");
    	                System.out.println("6. CSS Score");
    	                System.out.println("7. Country");
    	                System.out.println("8. City");
    	                System.out.println("9. District");
    	                System.out.println("10. Street");
    	                System.out.println("11. Cancel");

    	                int fieldChoice = sc.nextInt();
    	                sc.nextLine();

    	                switch (fieldChoice) {
    	                    case 1:
    	                        System.out.println("Enter new ID: ");
    	                        String newId = sc.nextLine();
    	                        student.setId(newId);
    	                        System.out.println("Update success");
    	                        break;
    	                    case 2:
    	                        System.out.println("Enter new Name: ");
    	                        String newName = sc.nextLine();
    	                        student.setFullName(newName);
    	                        System.out.println("Update success");
    	                        break;
    	                    case 3:
    	                        System.out.println("Enter new Accountant: ");
    	                        double newAccScore = sc.nextDouble();
    	                        sc.nextLine();

    	                        if (student instanceof BitzStudent) {
    	                            bitzStudent = (BitzStudent) student;
    	                            bitzStudent.setAcc(newAccScore);
    	                            System.out.println("Update success");
    	                        } else {
    	                            System.out.println("This student is not an instance of BitzStudent");
    	                        }
    	                        break;
    	                    case 4:
    	                        System.out.println("Enter new Marketing: ");
    	                        double newMkt = sc.nextDouble();
    	                        sc.nextLine();

    	                        if (student instanceof BitzStudent) {
    	                            bitzStudent = (BitzStudent) student;
    	                            bitzStudent.setMkt(newMkt);
    	                            System.out.println("Update success");
    	                        } else {
    	                            System.out.println("This student is not an instance of BitzStudent");
    	                        }
    	                        break;
    	                    case 5:
    	                        System.out.println("Enter new Java: ");
    	                        double newJava = sc.nextDouble();
    	                        sc.nextLine();

    	                        if (student instanceof ITStudent) {
    	                            itStudent = (ITStudent) student;
    	                            itStudent.setJava(newJava);
    	                            System.out.println("Update success");
    	                        } else {
    	                            System.out.println("This student is not an instance of ITStudent");
    	                        }
    	                        break;
    	                    case 6:
    	                        System.out.println("Enter new CSS Score: ");
    	                        double newCss = sc.nextDouble();
    	                        sc.nextLine();

    	                        if (student instanceof ITStudent) {
    	                            itStudent = (ITStudent) student;
    	                            itStudent.setCss(newCss);
    	                            System.out.println("Update success");
    	                        } else {
    	                            System.out.println("This student is not ITStudent");
    	                        }
    	                        break;
    	                    case 7:
    	                        System.out.println("Enter new Country: ");
    	                        String newCountry = sc.nextLine();
    	                        student.getAddress().setCountry(newCountry);
    	                        System.out.println("Update success");
    	                        break;
    	                    case 8:
    	                        System.out.println("Enter new City: ");
    	                        String newCity = sc.nextLine();
    	                        student.getAddress().setCity(newCity);
    	                        System.out.println("Update success");
    	                        break;
    	                    case 9:
    	                        System.out.println("Enter new District: ");
    	                        String newDistrict = sc.nextLine();
    	                        student.getAddress().setDistrict(newDistrict);
    	                        System.out.println("Update success");
    	                        break;
    	                    case 10:
    	                        System.out.println("Enter new Street: ");
    	                        String newStreet = sc.nextLine();
    	                        student.getAddress().setStreet(newStreet);
    	                        System.out.println("Update success");
    	                        break;
    	                    case 11:
    	                        return;
    	                }
    	            } else if (choice.equals("D")) {
    	                studentList.remove(student);
    	                System.out.println("Remove success");
    	                return;
    	            }
    	        }
    	    }
    	}
    public void report(){
        Scanner sc = new Scanner(System.in);
        for (Student student:studentList){
            BitzStudent bitzStudent;
            ITStudent itStudent;
            if (student instanceof BitzStudent){
                bitzStudent = (BitzStudent) student;
               if (bitzStudent.calculateAverageScore() >=5){
                   System.out.println(bitzStudent);
                   System.out.println("GPA: "+ bitzStudent.calculateAverageScore());
               }
            }
            if (student instanceof ITStudent){
                itStudent = (ITStudent) student;
                if (itStudent.calculateAverageScore() >=5){
                    System.out.println(itStudent);
                    System.out.println("GPA: "+ itStudent.calculateAverageScore());
                }
            }
        }

    }
}
