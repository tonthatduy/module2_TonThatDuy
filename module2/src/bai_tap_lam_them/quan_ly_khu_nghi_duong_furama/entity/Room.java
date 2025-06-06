package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String maDichVu, String nameDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        super(maDichVu, nameDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
    }

    public Room(String maDichVu, String nameDichVu, double dienTichSuDung, double chiPhiThue,
                int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichVu, nameDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room | " +
                super.toString() +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                '|';
    }

    public String getInfotoFileRoom() {
        return super.getInfoToFileFacility() + "," + this.dichVuMienPhiDiKem;
    }
}
