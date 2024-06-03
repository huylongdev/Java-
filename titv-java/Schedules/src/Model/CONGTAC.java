package Model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CONGTAC extends NHANSU {
    protected byte ID_;
	protected byte ID_NHANSU;
	protected String NOI_DUNG;
	protected Date START_NGAYCONGTAC;
	protected Date STOP_NGAYCONGTAC;
	protected String NOI_CONGTAC;
	protected String PHUONG_TIEN;
	protected byte ID_DANGKI;
	protected Date NGAY_DANGKI;
	

	public CONGTAC() {
		
	}
	public CONGTAC(byte ID_,byte ID_NHANSU, String NOI_DUNG,Date START_NGAYCONGTAC,Date STOP_NGAYCONGTAC,
String NOI_CONGTAC,String PHUONG_TIEN,byte ID_DANGKI,	Date NGAY_DANGKI) {
		this.ID_NHANSU = ID_NHANSU;
		this.NOI_DUNG = NOI_DUNG;
		this.START_NGAYCONGTAC = START_NGAYCONGTAC;
		this.STOP_NGAYCONGTAC = STOP_NGAYCONGTAC;
		this.NOI_CONGTAC = NOI_CONGTAC;
		this.PHUONG_TIEN = PHUONG_TIEN;
		this.ID_DANGKI = ID_DANGKI;
		this.NGAY_DANGKI = NGAY_DANGKI;
	}



	public byte getID_() {
		return ID_;
	}



	public void setID_(byte ID_) {
		this.ID_ = ID_;
	}



	public byte getID_NHANSU() {
		return ID_NHANSU;
	}



	public void setID_NHANSU(byte ID_NHANSU) {
		this.ID_NHANSU = ID_NHANSU;
	}



	public String getNOI_DUNG() {
		return NOI_DUNG;
	}



	public void setNOI_DUNG(String NOI_DUNG) {
		this.NOI_DUNG = NOI_DUNG;
	}



	public Date getSTART_NGAYCONGTAC() {
		return START_NGAYCONGTAC;
	}



	public void setSTART_NGAYCONGTAC(Date START_NGAYCONGTAC) {
		this.START_NGAYCONGTAC = START_NGAYCONGTAC;
	}



	public Date getSTOP_NGAYCONGTAC() {
		return STOP_NGAYCONGTAC;
	}



	public void setSTOP_NGAYCONGTAC(Date STOP_NGAYCONGTAC) {
		this.STOP_NGAYCONGTAC = STOP_NGAYCONGTAC;
	}



	public String getNOI_CONGTAC() {
		return NOI_CONGTAC;
	}



	public void setNOI_CONGTAC(String NOI_CONGTAC) {
		this.NOI_CONGTAC = NOI_CONGTAC;
	}



	public String getPHUONG_TIEN() {
		return PHUONG_TIEN;
	}



	public void setPHUONG_TIEN(String PHUONG_TIEN) {
		this.PHUONG_TIEN = PHUONG_TIEN;
	}



	public byte getID_DANGKI() {
		return ID_DANGKI;
	}



	public void setID_DANGKI(byte ID_DANGKI) {
		this.ID_DANGKI = ID_DANGKI;
	}



	public Date getNGAY_DANGKI() {
		return NGAY_DANGKI;
	}



	public void setNGAY_DANGKI(Date NGAY_DANGKI) {
		this.NGAY_DANGKI = NGAY_DANGKI;
	}


	@Override
	public String toString() {
		return "CONGTAC [ID_=" + ID_ + ", ID_NHANSU=" + ID_NHANSU + ", NOI_DUNG=" + NOI_DUNG + ", START_NGAYCONGTAC="
				+ START_NGAYCONGTAC + ", STOP_NGAYCONGTAC=" + STOP_NGAYCONGTAC + ", NOI_CONGTAC=" + NOI_CONGTAC
				+ ", PHUONG_TIEN=" + PHUONG_TIEN + ", ID_DANGKI=" + ID_DANGKI + ", NGAY_DANGKI=" + NGAY_DANGKI + "]";
	}
	

public NHANSU addition() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter ID: ");
    this.ID_ = scanner.nextByte();
    scanner.nextLine(); 

    System.out.println("Enter ID_NhanSu: ");
    super.ID_NHANSU = scanner.nextByte();
    scanner.nextLine();

    System.out.println("Enter noi dung: ");
    this.NOI_DUNG = scanner.nextLine();

    nhapVaXuLyNgay("Enter ngay dang cong tac bat dau:", this.START_NGAYCONGTAC);

    // Input and validate "ngay dang cong tac ket thuc" 
    do {
        nhapVaXuLyNgay("Enter ngay dang cong tac ket thuc:", this.STOP_NGAYCONGTAC);
    } while (this.START_NGAYCONGTAC.compareTo(this.STOP_NGAYCONGTAC) >= 0); 

    System.out.println("Enter noi cong tac: ");
    this.NOI_CONGTAC = scanner.nextLine();  

    System.out.println("Enter ID_DangKi: "); 
    this.ID_DANGKI = scanner.nextByte();
    scanner.nextLine();

    nhapVaXuLyNgay("Enter ngay dang ki: ", this.NGAY_DANGKI);

    return this;
}

private void nhapVaXuLyNgay(String message, Date field) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Scanner scanner = new Scanner(System.in);

    boolean hopLe = false;
    while (!hopLe) {
        System.out.println(message);
        String dateString = scanner.nextLine();
        try {
            Date date = dateFormat.parse(dateString);
            field = date;
            hopLe = true;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }
    }
}

}
