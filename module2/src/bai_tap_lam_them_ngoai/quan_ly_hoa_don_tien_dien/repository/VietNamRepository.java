package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.VietNam;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.util.ReadAndWriteFileElectricityBill;

import java.util.ArrayList;
import java.util.List;

public class VietNamRepository implements IVietNamRepository {
    private static final String VIETNAM_FILE = "src/bai_tap_lam_them_ngoai/quan_ly_hoa_don_tien_dien/data/khachHangVietNam.csv";

    @Override
    public List<VietNam> findAll() {
        List<VietNam> vietNams = new ArrayList<>();
        List<String> stringList = ReadAndWriteFileElectricityBill.readFile(VIETNAM_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            VietNam vietNam = new VietNam(array[0], array[1], array[2], Double.parseDouble(array[3]));
            vietNams.add(vietNam);

        }
        return vietNams;
    }
}
