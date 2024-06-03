package Model;

public class THONGBAO {
	protected byte ID_THONGBAO;
	protected byte  ID_NGUOITB;
	protected byte ID_NGUOIDUOCTB;
	public THONGBAO(byte  ID_THONGBAO,byte ID_NGUOITB,byte ID_NGUOIDUOCTB) {
		this.ID_THONGBAO = ID_THONGBAO;
		this.ID_NGUOITB = ID_NGUOITB;
		this.ID_NGUOIDUOCTB = ID_NGUOIDUOCTB;
	}
	public byte getID_THONGBAO() {
		return ID_THONGBAO;
	}
	public void setID_THONGBAO(byte ID_THONGBAO) {
		this.ID_THONGBAO = ID_THONGBAO;
	}
	public byte getID_NGUOITB() {
		return ID_NGUOITB;
	}
	public void setID_NGUOITB(byte ID_NGUOITB) {
		this.ID_NGUOITB = ID_NGUOITB;
	}
	public byte getID_NGUOIDUOCTB() {
		return ID_NGUOIDUOCTB;
	}
	public void setID_NGUOIDUOCTB(byte ID_NGUOIDUOCTB) {
		this.ID_NGUOIDUOCTB = ID_NGUOIDUOCTB;
	}
	
	
}
