package Model;

import java.util.Date;

public class HOP {
	protected String ID_HOP;
	protected String NOI_DUNG;
	protected Date NGAY_DANGKI;
	protected Date GIO_DANGKI;
	protected byte ID_DANGKI;
	protected Date NGAY_HOP;
	protected Date START_GIOHOP;
	protected Date STOP_GIOHOP;
	protected byte ID_DIADIEM;
	
	public HOP(String ID_HOP,String NOI_DUNG,Date NGAY_DANGKI, Date GIO_DANGKI,byte ID_DANGKI,Date NGAY_HOP,Date START_GIOHOP,Date STOP_GIOHOP,byte ID_DIADIEM) {
		this.ID_HOP = ID_HOP;
		this.NOI_DUNG = NOI_DUNG;
		this.NGAY_DANGKI = NGAY_DANGKI;
		this.GIO_DANGKI = GIO_DANGKI;
		this.ID_DANGKI = ID_DANGKI;
		this.NGAY_HOP = NGAY_HOP;
		this.START_GIOHOP = START_GIOHOP;
		this.STOP_GIOHOP = STOP_GIOHOP;
		this.ID_DIADIEM = ID_DIADIEM;
		
	}

	public String getID_HOP() {
		return ID_HOP;
	}

	public void setID_HOP(String ID_HOP) {
		this.ID_HOP = ID_HOP;
	}

	public String getNOI_DUNG() {
		return NOI_DUNG;
	}

	public void setNOI_DUNG(String NOI_DUNG) {
		this.NOI_DUNG = NOI_DUNG;
	}

	public Date getNGAY_DANGKI() {
		return NGAY_DANGKI;
	}

	public void setNGAY_DANGKI(Date NGAY_DANGKI) {
		this.NGAY_DANGKI = NGAY_DANGKI;
	}

	public Date getGIO_DANGKI() {
		return GIO_DANGKI;
	}

	public void setGIO_DANGKI(Date GIO_DANGKI) {
		this.GIO_DANGKI = GIO_DANGKI;
	}

	public byte getID_DANGKI() {
		return ID_DANGKI;
	}

	public void setID_DANGKI(byte ID_DANGKI) {
		this.ID_DANGKI = ID_DANGKI;
	}

	public Date getNGAY_HOP() {
		return NGAY_HOP;
	}

	public void setNGAY_HOP(Date NGAY_HOP) {
		this.NGAY_HOP = NGAY_HOP;
	}

	public Date getSTART_GIOHOP() {
		return START_GIOHOP;
	}

	public void setSTART_GIOHOP(Date START_GIOHOP) {
		this.START_GIOHOP = START_GIOHOP;
	}

	public Date getSTOP_GIOHOP() {
		return STOP_GIOHOP;
	}

	public void setSTOP_GIOHOP(Date STOP_GIOHOP) {
		this.STOP_GIOHOP = STOP_GIOHOP;
	}

	public byte getID_DIADIEM() {
		return ID_DIADIEM;
	}
	public void setID_DIADIEM(byte ID_DIADIEM) {
		this.ID_DIADIEM = ID_DIADIEM;
	}


}
