    package Model;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Scanner;

    public class PHEP extends NHANSU {
        protected byte ID_Phep;
        protected String noiDung;
       protected Date ngay_dangKi;
       protected Date start_ngayPhep;
       protected Date end_ngayPhep;
        protected String bound;
        protected String noi_nghi;

        public PHEP(byte ID_NhanSu, byte ID_Phep, String noiDung, Date ngay_dangKi, Date start_ngayPhep, Date end_ngayPhep, String bound, String noi_nghi) {
            super(ID_NhanSu);
            this.ID_Phep = ID_Phep;
            this.noiDung = noiDung;
            this.ngay_dangKi = ngay_dangKi;
            this.start_ngayPhep = start_ngayPhep;
            this.end_ngayPhep = end_ngayPhep;
            this.bound = bound;
            this.noi_nghi = noi_nghi;
        }

        public byte getID_Phep() {
            return ID_Phep;
        }

        public void setID_Phep(byte ID_Phep) {
            this.ID_Phep = ID_Phep;
        }

        public byte getID_NhanSu() {
            return ID_NhanSu;
        }

        public void setID_NhanSu(byte ID_NhanSu) {
            this.ID_NhanSu = ID_NhanSu;
        }

        public String getNoiDung() {
            return noiDung;
        }

        public void setNoiDung(String noiDung) {
            this.noiDung = noiDung;
        }

        public Date getNgay_dangKi() {
            return ngay_dangKi;
        }

        public void setNgay_dangKi(Date ngay_dangKi) {
            this.ngay_dangKi = ngay_dangKi;
        }

        public Date getStart_ngayPhep() {
            return start_ngayPhep;
        }

        public void setStart_ngayPhep(Date start_ngayPhep) {
            this.start_ngayPhep = start_ngayPhep;
        }

        public Date getEnd_ngayPhep() {
            return end_ngayPhep;
        }

        public void setEnd_ngayPhep(Date end_ngayPhep) {
            this.end_ngayPhep = end_ngayPhep;
        }

        public String getBound() {
            return bound;
        }

        public void setBound(String bound) {
            this.bound = bound;
        }

        public String getNoi_nghi() {
            return noi_nghi;
        }

        public void setNoi_nghi(String noi_nghi) {
            this.noi_nghi = noi_nghi;
        }

        public NHANSU add(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID_NhanSu: ");
            super.ID_NhanSu=sc.nextByte();
            sc.nextLine();
            System.out.println("Enter ID_phep: ");
            this.ID_Phep=sc.nextByte();
            sc.nextLine();
            System.out.println("Enter noi dung: ");
            this.noiDung=sc.nextLine();
            System.out.println("Enter ngay dang ki:");
            String dateString = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = dateFormat.parse(dateString);
                this.ngay_dangKi = date;
                System.out.println("Parsed Date: " + date);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            }

            System.out.println("Enter ngay dang phep bat dau:");
            try {
                Date date = dateFormat.parse(dateString);
                this.start_ngayPhep = date;
                System.out.println("Parsed Date: " + date);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            }

            System.out.println("Enter ngay dang phep dung lai:");
            try {
                Date date = dateFormat.parse(dateString);
                this.end_ngayPhep = date;
                System.out.println("Parsed Date: " + date);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            }
            System.out.println("Enter Bound:");
            this.bound=sc.nextLine();
            System.out.println("Enter noi nghi:");
            this.noi_nghi=sc.nextLine();
            return this;
        }

        public PHEP() {
        }
    }
