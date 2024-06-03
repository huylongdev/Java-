package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

import model.*;
import repository.*;
import service.*;
import utils.Validation;
import view.Menu;

public class FuramaController extends Menu<String> {

    private static final String MENU_TITLE = "FURAMA RESORT MANAGEMENT";
    private static final String[] MENU_OPTIONS = {"Employee Management", "Customer Management", "Facility Management",
            "Booking Management", "Promotion Management", "Exit"};
    private Menu<String> employeeManagementMenu;
    private Menu<String> customerManagementMenu;
    private Menu<String> facilityManagementMenu;
    private Menu<String> bookingManagementMenu;
    private Validation val;

    public FuramaController() {
        super(MENU_TITLE, MENU_OPTIONS);
        val = new Validation();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                runEmployeeManagementMenu();
                break;
            case 2:
                runCustomerManagementMenu();
                break;
            case 3:
                runFacilityManagementMenu();
                break;
            case 4:
                runBookingManagementMenu();
                break;
            case 5:
                // Call Promotion Management menu
                break;
            case 6:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
        }
    }

    private void runEmployeeManagementMenu() {
        String title = "EMPLOYEE MANAGEMENT";
        String[] options = {"Display employees list", "Add new employee", "Edit employee information",
                "Return main menu"};
        IEmployeeRepository employeeRepo = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeService(employeeRepo);

        employeeManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        String id;
                        do {
                            id = val.getAndValidEmpId("Enter new employee ID: ");
                            if (employeeService.findById(id) != null) {
                                System.out.println("Employee ID have been existed! Please enter a unique ID.");
                            }
                        } while (employeeService.findById(id) != null);

                        String name = val.getAndValidPersonName("Enter new employee's Name: ");
                        String gender = val.getAndValidValue("Enter employee's gender: ", "M|F",
                                "Invalid gender! Please input again!");
                        boolean genderEmployee = gender.equals("M") ? true : false;
                        LocalDate date = val.getAndValidDate("Enter employee's date of birth: ");
                        Date dateOfBirth = java.sql.Date.valueOf(date);
                        String identity = val.getAndValidIdentificationNum("Enter employee's identification number: ");
                        String phoneNumber = val.getAndValidPhone("Enter employee's phone number: ");
                        String email = val.getAndValidEmail("Enter employee's email: ");
                        String level = val.getString("Enter employee's level: ");
                        String position = val.getString("Enter employee's position: ");
                        Double salary = val.getAndValidSalary("Enter employee's salary: ");
                        Employee newEmp = new Employee(id, name, dateOfBirth, identity, genderEmployee, phoneNumber,
                                email,
                                level, position, salary);
                        employeeService.add(newEmp);
                        break;
                    case 3:
                        // Use findById() to know which person user want to edit then call update()
                        Employee e;
                        do {
                            String inputId = val.getAndValidEmpId("Enter employer ID: ");
                            e = employeeService.findById(inputId);
                        } while (e == null);
                        employeeService.update(e);
                        break;
                    case 4:
                        employeeService.save();
                        return;
                }
            }
        };

        employeeManagementMenu.run();
    }

    private void runCustomerManagementMenu() {
        String title = "CUSTOMER MANAGEMENT";
        String[] options = {"Display customers list", "Add new customer", "Edit customer information",
                "Return main menu"};
        ICustomerRepository customerRepo = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepo);

        customerManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        String id;
                        do {
                            id = val.getAndValidEmpId("Enter new customer ID: ");
                            if (customerService.findById(id) != null) {
                                System.out.println("Customer ID have been existed! Please enter a unique ID.");
                            }
                        } while (customerService.findById(id) != null);

                        String fullName = val.getAndValidPersonName("Enter customer's name: ");
                        LocalDate date = val.getAndValidDate("Enter date of birth: ");
                        Date dateOfBirth = java.sql.Date.valueOf(date);
                        String identity = val.getAndValidIdentificationNum("Enter Identification number: ");
                        String gen = val.getAndValidValue("Enter customer's gender (M/F): ", "[MF]",
                                "Gender must be Male or Female!");
                        boolean gender = gen.equals("M") ? true : false;
                        String phoneNumber = val.getAndValidPhone("Enter phone number: ");
                        String email = val.getAndValidEmail("Enter customer's email: ");
                        String level = val.getString("Enter Customer level: ");
                        String address = val.getAndValidValue("Enter Address: ", "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$",
                                "Address must be upper case first character of each word!");
                        Customer newCus = new Customer(id, fullName, dateOfBirth, identity, gender, phoneNumber, email,
                                level, address);
                        customerService.add(newCus);
                        break;
                    case 3:
                        Customer c;
                        do {
                            String inputId = val.getAndValidCusId("Enter customer ID: ");
                            c = customerService.findById(inputId);
                        } while (c == null);
                        customerService.update(c);
                        break;
                    case 4:
                        customerService.save();
                        break;
                }
            }
        };

        customerManagementMenu.run();
    }

    private void runFacilityManagementMenu() {
        String title = "Booking MANAGEMENT";
        String[] options = {"Add new facility", "Display facility list", "Display maintenance list", "Return main menu"};
        IFacilityRepository facilityRepo = new FacilityRepository();
        FacilityService facilityService = new FacilityService(facilityRepo);

        facilityManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        String idFacility;
                        do {
                            idFacility = val.getAndValidServiceCode("Enter new facility code (SVxx-yyyy; xx: VL(villa), HO(house), RO(room); y:0-9): ");
                            if (facilityService.findById(idFacility) != null) {
                                System.out.println("Facility ID have been existed! Please enter a unique ID.");
                            }
                        } while (facilityService.findById(idFacility) != null);
                        String nameFacility = val.getAndValidValue("Enter new facility name: ", "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$", "Invalid facility name. Please enter a valid name.");
                        double area = val.getAndValidDouble("Enter area: ");
                        double prices = val.getAndValidDouble("Enter rental cost: ");
                        int maxPeople = val.getAndValidInt("Enter max people: ");
                        String type = val.getString("Enter rental type (hour,day,month,year): ");

                        Facility facility = null;
                        if (idFacility.startsWith("SVVL")) {
                            String standRoom = val.getString("Enter room standroom: ");
                            double poolArea = val.getAndValidDouble("Enter pool area: ");
                            int floors = val.getAndValidInt("Enter number of floors: ");
                            facility = new Villa(idFacility, nameFacility, area, prices, maxPeople, type, standRoom, poolArea, floors);
                            facilityService.add(facility);
                        }
                        if (idFacility.startsWith("SVHO")) {
                            String standRoom = val.getString("Enter room standroom: ");
                            int floors = val.getAndValidInt("Enter number of floors: ");
                            facility = new House(idFacility, nameFacility, area, prices, maxPeople, type, standRoom, floors);
                            facilityService.add(facility);
                        }
                        if (idFacility.startsWith("SVRO")) {
                            String freeService = val.getString("Enter free service: ");
                            facility = new Room(idFacility, nameFacility, area, prices, maxPeople, type, freeService);
                            facilityService.add(facility);
                        }
                        break;
                    case 2:
                        facilityService.display();
                        break;
                    case 3:
                        facilityService.displayMaintenanceList();
                        break;
                    case 4:
                        facilityService.save();
                        break;
                }
            }
        };
        facilityManagementMenu.run();
    }

    private void runBookingManagementMenu() {
        String title = "Booking MANAGEMENT";
        String[] options = {"Add new booking", "Display booking list", "Create new contract", "Display contract list", "Edit contract information",
                "Return main menu"};
        IBookingRepository bookingRepo = new BookingRepository();
        BookingService bookingService = new BookingService(bookingRepo);
        ICustomerRepository customerRepo = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepo);
        IFacilityRepository facilityRepo = new FacilityRepository();
        FacilityService facilityService = new FacilityService(facilityRepo);

        bookingManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        String bookID = "BK" + (bookingRepo.readFile().size() + 1);
                        Date bookDate = java.sql.Date.valueOf(val.getAndValidDate("Enter book date: "));
                        Date startDate = java.sql.Date.valueOf(val.getAndValidDate("Enter start date: "));
                        Date endDate = java.sql.Date.valueOf(val.getAndValidDate("Enter end date: "));
                        String cusID;
                        do {
                            cusID = val.getAndValidCusId("Enter available customer ID: ");
                            if (customerService.findById(cusID) != null) {
                                break;
                            }
                        } while (customerService.findById(cusID) == null);
                        String serID;
                        Facility facility = null;
                        do {
                            serID = val.getAndValidServiceCode("Enter available service ID: ");
                            if (facilityService.findById(serID) != null) {
                                facility = facilityService.findById(serID);
                                break;
                            }
                        } while (facilityService.findById(serID) == null);

                        if (facilityService.getMap().containsKey(facility)) {
                            for (Booking b : bookingRepo.readFile()) {
                                if (b.getServiceID().equals(facility != null ? facility.getFacilityID() : null)) {
                                    if (Integer.parseInt(startDate.toString().split("-")[1]) > Integer.parseInt(new SimpleDateFormat("dd/MM/yyyy").format(b.getEndDate()).split("/")[1]) || startDate.toString().split("-")[1].equals("01") && new SimpleDateFormat("dd/MM/yyyy").format(b.getEndDate()).split("/")[1].equals("12")) {
                                        facility.setQuantityUsing(0);
                                        break;
                                    }
                                }
                            }
                            if (facilityService.getMap().get(facility) <= 5) {
                                facilityService.getMap().put(facility, facilityService.getMap().get(facility) + 1);
                            }
                        }
                        Booking newBooking = new Booking(bookID, bookDate, startDate, endDate, cusID, serID);
                        bookingService.add(newBooking);
                        facilityService.save();
                        System.out.println("Add new Booking successfully!");
                        break;
                    case 2:
                        bookingService.display();
                        break;
                    case 3:
                        bookingService.createNewContract();
                        break;
                    case 4:
                        bookingService.displayContractList();
                        break;
                    case 5:
                        bookingService.updateContract();
                        break;
                    case 6:
                        bookingService.save();
                        return;
                }
            }
        };
        bookingManagementMenu.run();
    }
}
