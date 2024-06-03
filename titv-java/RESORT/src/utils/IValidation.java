package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface IValidation {

    // Define regex for employee ID format: EMP-YYYY (YYYY is digit from 0-9)
    static final String EMPID_REGEX = "^EMP-[0-9]{4}$";
    // Define regex for customer ID format: CUS-YYYY (YYYY is digit from 0-9)
    static final String CUSID_REGEX = "^CUS-[0-9]{4}$";
    // Define regex for person name that uppercase first character of each word 
    static final String NAME_REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    // Define regex for citizen identification number have 12 digits
    static final String IDENTIFICATION_REGEX = "^\\d{9}(\\d{3})?$";
    // Define regex for phone number have 10 digits and start with 0
    static final String PHONE_REGEX = "^0\\d{9}$";

    static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    // Define date format for DATE
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //use try catch to format date. Ex: LocalDate validDate = LocalDate.parse(DateStr, formatter)

    static final String SERVICECODE_REGEX = "^SV(VL|HO|RO)-\\d{4}$";
    // Define regex for service code format: SV(VL/HO/RO)-YYYY (YYYY is digit from 0-9)

    public String getString(String msg);

    public String getAndValidEmpId(String msg);

    public String getAndValidCusId(String msg);

    public String getAndValidPersonName(String msg);

    public String getAndValidIdentificationNum(String msg);

    public double getAndValidSalary(String msg);

    public String getAndValidPhone(String msg);

    public LocalDate getAndValidDate(String msg);

    public String getAndValidEmail(String msg);

    //new function - RM-23
    public String getAndValidServiceCode(String msg);

}
