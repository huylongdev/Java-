package Model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class PHEP extends NHANSU {
	 protected byte ID_PHEP;	
	 protected String NOI_DUNG;
	 protected String ID_DANGKI;
	 protected Date NGAY_DANGKI;
	 protected Date START_NGAYPHEP;
	 protected Date STOP_NGAYPHEP;
	 protected String BOUND;
	 protected String NOI_NGHI; 
	
	public PHEP() {
		
	}
	public PHEP(byte ID_PHEP, String NOI_DUNG, String ID_DANGKI, Date NGAY_DANGKI,Date START_NGAYPHEP, Date STOP_NGAYPHEP, String BOUND, String NOI_NGHI ) {
        this.ID_PHEP = ID_PHEP;
        this.NOI_DUNG =  NOI_DUNG;
        this.ID_DANGKI = ID_DANGKI;
        this.NGAY_DANGKI = NGAY_DANGKI;
        this.START_NGAYPHEP = START_NGAYPHEP;
        this.STOP_NGAYPHEP = STOP_NGAYPHEP;
        this.BOUND = BOUND;
        this.NOI_NGHI = NOI_NGHI;    
    }

	public byte getID_PHEP() {
		return ID_PHEP;
	}

	public void setID_PHEP(byte ID_PHEP) {
		this.ID_PHEP = ID_PHEP;
	}

	public String getNOI_DUNG() {
		return NOI_DUNG;
	}

	public void setNOI_DUNG(String NOI_DUNG) {
		this.NOI_DUNG = NOI_DUNG;
	}

	public String getID_DANGKI() {
		return ID_DANGKI;
	}

	public void setID_DANGKI(String ID_DANGKI) {
		this.ID_DANGKI = ID_DANGKI;
	}

	public Date getNGAY_DANGKI() {
		return NGAY_DANGKI;
	}

	public void setNGAY_DANGKI(Date NGAY_DANGKI) {
		this.NGAY_DANGKI = NGAY_DANGKI;
	}

	public Date getSTART_NGAYPHEP() {
		return START_NGAYPHEP;
	}

	public void setSTART_NGAYPHEP(Date START_NGAYPHEP) {
		this.START_NGAYPHEP = START_NGAYPHEP;
	}

	public Date getSTOP_NGAYPHEP() {
		return STOP_NGAYPHEP;
	}

	public void setSTOP_NGAYPHEP(Date STOP_NGAYPHEP) {
		this.STOP_NGAYPHEP = STOP_NGAYPHEP;
	}

	public String getBOUND() {
		return BOUND;
	}

	public void setBOUND(String BOUND) {
		this.BOUND = BOUND;
	}

	public String getNOI_NGHI() {
		return NOI_NGHI;
	}

	public void setNOI_NGHI(String NOI_NGHI) {
		this.NOI_NGHI = NOI_NGHI;
	}
	

    
    public NHANSU addition() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mã nhân sự: ");
        super.ID_NHANSU = scanner.nextByte();
        scanner.nextLine(); 

        System.out.print("Mã phép: ");
        this.ID_PHEP = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Nội dung: ");
        this.NOI_DUNG = scanner.nextLine();

        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
        boolean ngayDangKiHopLe = false;
        while (!ngayDangKiHopLe) {
            System.out.print("Ngày đăng ký (yyyy-MM-dd): ");
            String ngayDangKiString = scanner.nextLine();
            try {
                this.NGAY_DANGKI = dinhDangNgay.parse(ngayDangKiString);
                ngayDangKiHopLe = true;
                System.out.println("Ngày đăng ký đã được lưu.");
            } catch (ParseException e) {
                System.out.println("Định dạng ngày tháng không hợp lệ. Vui lòng nhập lại theo định dạng yyyy-MM-dd.");
            }
        }

        boolean ngayPhepBatDauHopLe = false;
        while (!ngayPhepBatDauHopLe) {
            System.out.print("Ngày bắt đầu nghỉ phép (yyyy-MM-dd): ");
            String ngayPhepBatDauString = scanner.nextLine();
            try {
                this.START_NGAYPHEP = dinhDangNgay.parse(ngayPhepBatDauString);
                ngayPhepBatDauHopLe = true;
                System.out.println("Ngày bắt đầu nghỉ phép đã được lưu.");
            } catch (ParseException e) {
                System.out.println("Định dạng ngày tháng không hợp lệ. Vui lòng nhập lại theo định dạng yyyy-MM-dd.");
            }
        }

        boolean ngayPhepDungLaiHopLe = false;
        while (!ngayPhepDungLaiHopLe) {
            System.out.print("Ngày kết thúc nghỉ phép (yyyy-MM-dd): ");
            String ngayPhepDungLaiString = scanner.nextLine();
            try {
                this.STOP_NGAYPHEP = dinhDangNgay.parse(ngayPhepDungLaiString);
                ngayPhepDungLaiHopLe = true;
                System.out.println("Ngày kết thúc nghỉ phép đã được lưu.");
            } catch (ParseException e) {
                System.out.println("Định dạng ngày tháng không hợp lệ. Vui lòng nhập lại theo định dạng yyyy-MM-dd.");
            }
        }

        System.out.print("Phạm vi: ");
        this.BOUND = scanner.nextLine();

        System.out.print("Nơi nghỉ: ");
        this.NOI_NGHI = scanner.nextLine();

        return this;
    }

}
