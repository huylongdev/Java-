package Model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HOC extends NHANSU {
    protected byte ID_hoc;
    protected byte ID_nhanSu;
    protected String noi_dung;
    protected Date start_ngayHoc;
    protected Date stop_ngayHoc;
    protected Date start_gioHoc;
    protected String noi_hoc;
    protected byte ID_dangKi;
    protected Date ngay_dangKi;
    protected Date stop_gioHoc;

    public HOC(byte ID_NhanSu, byte ID_hoc, byte ID_nhanSu, String noi_dung, Date start_ngayHoc, Date stop_ngayHoc, Date start_gioHoc, String noi_hoc, byte ID_dangKi, Date ngay_dangKi, Date stop_gioHoc) {
        super(ID_NhanSu);
        this.ID_hoc = ID_hoc;
        this.ID_nhanSu = ID_nhanSu;
        this.noi_dung = noi_dung;
        this.start_ngayHoc = start_ngayHoc;
        this.stop_ngayHoc = stop_ngayHoc;
        this.start_gioHoc = start_gioHoc;
        this.noi_hoc = noi_hoc;
        this.ID_dangKi = ID_dangKi;
        this.ngay_dangKi = ngay_dangKi;
        this.stop_gioHoc = stop_gioHoc;
    }

    public byte getID_hoc() {
        return ID_hoc;
    }

    public void setID_hoc(byte ID_hoc) {
        this.ID_hoc = ID_hoc;
    }

    public byte getID_nhanSu() {
        return ID_nhanSu;
    }

    public void setID_nhanSu(byte ID_nhanSu) {
        this.ID_nhanSu = ID_nhanSu;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public Date getStart_ngayHoc() {
        return start_ngayHoc;
    }

    public void setStart_ngayHoc(Date start_ngayHoc) {
        this.start_ngayHoc = start_ngayHoc;
    }

    public Date getStop_ngayHoc() {
        return stop_ngayHoc;
    }

    public void setStop_ngayHoc(Date stop_ngayHoc) {
        this.stop_ngayHoc = stop_ngayHoc;
    }

    public Date getStart_gioHoc() {
        return start_gioHoc;
    }

    public void setStart_gioHoc(Time start_gioHoc) {
        this.start_gioHoc = start_gioHoc;
    }

    public String getNoi_hoc() {
        return noi_hoc;
    }

    public void setNoi_hoc(String noi_hoc) {
        this.noi_hoc = noi_hoc;
    }

    public byte getID_dangKi() {
        return ID_dangKi;
    }

    public void setID_dangKi(byte ID_dangKi) {
        this.ID_dangKi = ID_dangKi;
    }

    public Date getNgay_dangKi() {
        return ngay_dangKi;
    }

    public void setNgay_dangKi(Date ngay_dangKi) {
        this.ngay_dangKi = ngay_dangKi;
    }

    public Date getStop_gioHoc() {
        return stop_gioHoc;
    }

    public void setStop_gioHoc(Time stop_gioHoc) {
        this.stop_gioHoc = stop_gioHoc;
    }
    public NHANSU add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID_Hoc: ");
        this.ID_hoc=sc.nextByte();
        sc.nextLine();
        System.out.println("Enter ID_NhanSu: ");
        super.ID_NhanSu=sc.nextByte();
        sc.nextLine();
        System.out.println("Enter noi dung: ");
        this.noi_dung=sc.nextLine();
        System.out.println("Enter ngay hoc bat dau:");
        String dateString = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(dateString);
            this.start_ngayHoc = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }

        System.out.println("Enter ngay hoc ket thuc:");
        try {
            Date date = dateFormat.parse(dateString);
            this.start_ngayHoc = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }

        System.out.println("Enter gio hoc bat dau:");
        try {
            Date date = dateFormat.parse(dateString);
            this.start_gioHoc = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }

        System.out.println("Enter noi hoc:");
        this.noi_hoc=sc.nextLine();
        System.out.println("Enter ID dang ki:");
        this.ID_dangKi=sc.nextByte();
        sc.nextLine();

        System.out.println("Enter ngay dang ki:");
        try {
            Date date = dateFormat.parse(dateString);
            this.ngay_dangKi = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }

        System.out.println("Enter gio hoc ket thuc:");
        try {
            Date date = dateFormat.parse(dateString);
            this.stop_gioHoc = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }

        return this;
    }

    public HOC() {

    }
}
