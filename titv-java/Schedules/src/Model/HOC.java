package Model;

import java.util.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class HOC extends NHANSU{
	protected byte ID_HOC;
	protected byte ID_NHANSU;
	protected String NOI_DUNG;
	protected Date START_NGAYHOC;
	protected Date STOP_NGAYHOC;
	protected Date START_GIOHOC;
	protected String NOI_HOC;
	protected byte ID_DANGKI;
	protected Date NGAY_DANGKI;
	protected Date STOP_GIOHOC;
	
	public HOC() {
		
	}
	public HOC(byte ID_HOC,byte ID_NHANSU,String NOI_DUNG,Date START_NGAYHOC,Date STOP_NGAYHOC,Date START_GIOHOC,String NOI_HOC,
			byte ID_DANGKI,Date NGAY_DANGKI, Date STOP_GIOHOC) {
		this.ID_HOC = ID_HOC;
		this.ID_NHANSU = ID_NHANSU;
		this.NOI_DUNG = NOI_DUNG;
		this.START_NGAYHOC = START_NGAYHOC;
		this.STOP_NGAYHOC = STOP_NGAYHOC;
		this.START_GIOHOC = START_GIOHOC;
		this.NOI_HOC = NOI_HOC;
		this.ID_DANGKI = ID_DANGKI;
		this.NGAY_DANGKI = NGAY_DANGKI;
		this.STOP_GIOHOC = STOP_GIOHOC;
	}
	public byte getID_HOC() {
		return ID_HOC;
	}
	public void setID_HOC(byte ID_HOC) {
		this.ID_HOC = ID_HOC;
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
	public Date getSTART_NGAYHOC() {
		return START_NGAYHOC;
	}
	public void setSTART_NGAYHOC(Date START_NGAYHOC) {
		this.START_NGAYHOC = START_NGAYHOC;
	}
	public Date getSTOP_NGAYHOC() {
		return STOP_NGAYHOC;
	}
	public void setSTOP_NGAYHOC(Date STOP_NGAYHOC) {
		this.STOP_NGAYHOC = STOP_NGAYHOC;
	}
	public Date getSTART_GIOHOC() {
		return START_GIOHOC;
	}
	public void setSTART_GIOHOC(Time START_GIOHOC) {
		this.START_GIOHOC = START_GIOHOC;
	}
	public String getNOI_HOC() {
		return NOI_HOC;
	}
	public void setNOI_HOC(String NOI_HOC) {
		this.NOI_HOC = NOI_HOC;
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
	public Date getSTOP_GIOHOC() {
		return STOP_GIOHOC;
	}
	public void setSTOP_GIOHOC(Time STOP_GIOHOC) {
		this.STOP_GIOHOC = STOP_GIOHOC;
	}
	
	public NHANSU addition() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter ID_Hoc: ");
	    this.ID_HOC = scanner.nextByte();
	    scanner.nextLine(); 

	    System.out.println("Enter ID_NhanSu: ");
	    super.ID_NHANSU = scanner.nextByte();
	    scanner.nextLine();

	    System.out.println("Enter noi dung: ");
	    this.NOI_DUNG = scanner.nextLine();

	    nhapVaXuLyNgay("Enter ngay hoc bat dau:", this.START_NGAYHOC);

	    do {
	        nhapVaXuLyNgay("Enter ngay hoc ket thuc:", this.START_NGAYHOC);
	    } while (this.START_NGAYHOC.equals(this.START_NGAYHOC)); // Kiểm tra trùng ngày

	    nhapVaXuLyNgay("Enter gio hoc bat dau:", this.START_GIOHOC);

	    System.out.println("Enter noi hoc:");
	    this.NOI_HOC = scanner.nextLine();

	    System.out.println("Enter ID dang ki:");
	    this.ID_DANGKI = scanner.nextByte();
	    scanner.nextLine();

	    nhapVaXuLyNgay("Enter ngay dang ki:", this.NGAY_DANGKI);

	    nhapVaXuLyNgay("Enter gio hoc ket thuc:", this.STOP_GIOHOC);

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
