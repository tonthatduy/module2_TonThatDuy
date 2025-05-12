package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.common.ReadAndWriteFile;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHang;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHangNoiDia;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHangQuocTe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KhachHangRepository implements IKhachHangRepository {
    private static final String PATH = "src/bai_tap_lam_them/quan_ly_hoa_don_tien_nuoc/data/khachhang.csv";

    @Override
    public void add(KhachHang khachHang) {
        List<String> stringList = new ArrayList<>();
        if (khachHang instanceof KhachHangNoiDia) {
            stringList.add(((KhachHangNoiDia) khachHang).toFileCSV());
        } else if (khachHang instanceof KhachHangQuocTe) {
            stringList.add(((KhachHangQuocTe) khachHang).toFileCSV());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public List<KhachHang> findAll() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        List<KhachHang> khachHangs = new ArrayList<>();
        for (String s : stringList) {
            String[] array = s.split("\\s*,\\s*");
            if (array[0].contains("KHVN")) {
                khachHangs.add(new KhachHangNoiDia(array[0], array[1], array[2], array[3], Double.parseDouble(array[4])));
            } else if (array[0].contains("KHNN")) {
                khachHangs.add(new KhachHangQuocTe(array[0], array[1], array[5]));

            }
        }
        return khachHangs;
    }

    @Override
    public List<KhachHang> findByName(String name) {
        List<KhachHang> khachHangs = new ArrayList<>();
        for (KhachHang khachHang : findAll()) {
            if (khachHang.getName().contains(name)) {
                khachHangs.add(khachHang);
            }
        }
        return khachHangs;
    }

    @Override
    public void delete(KhachHang khachHang) {
        List<KhachHang> khachHangs = findAll();
        khachHangs.remove(khachHang);
        List<String> stringList = new ArrayList<>();
        for (KhachHang khachHang1 : khachHangs) {
            if (khachHang1 instanceof KhachHangNoiDia) {
                stringList.add(((KhachHangNoiDia) khachHang1).toFileCSV());
            } else if (khachHang1 instanceof KhachHangQuocTe) {
                stringList.add(((KhachHangQuocTe) khachHang1).toFileCSV());

            }
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }

    @Override
    public KhachHang findByIDKhachHang(String idKhachHang) {
        List<KhachHang> khachHangs = findAll();
        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getId().contains(idKhachHang)) {
                return khachHang;
            }
        }
        return null;
    }

    @Override
    public void update(KhachHang khachHang) {
        List<KhachHang> khachHangs = findAll();
        for (int i = 0; i < khachHangs.size(); i++) {
            if (khachHangs.get(i).getId().equalsIgnoreCase(khachHang.getId())) {
                khachHangs.set(i, khachHang);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (KhachHang khachHang1 : khachHangs) {
            stringList.add(khachHang1.toFileCSV());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);

    }

    public List<KhachHang> findAllSortByName() {
        List<KhachHang> khachHangs = findAll();
        Collections.sort(khachHangs);
//        Collections.sort(khachHangs, new Comparator<KhachHang>() {
//            @Override
//            public int compare(KhachHang o1, KhachHang o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        return khachHangs;
    }


}
