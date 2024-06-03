package Model;

public class DIA_DIEM {
    protected byte id_diaDiem;
    protected String dia_Diem;

    public DIA_DIEM(byte id_diaDiem, String dia_Diem) {
        this.id_diaDiem = id_diaDiem;
        this.dia_Diem = dia_Diem;
    }

    public byte getId_diaDiem() {
        return id_diaDiem;
    }

    public void setId_diaDiem(byte id_diaDiem) {
        this.id_diaDiem = id_diaDiem;
    }

    public String getDia_Diem() {
        return dia_Diem;
    }

    public void setDia_Diem(String dia_Diem) {
        this.dia_Diem = dia_Diem;
    }
}
