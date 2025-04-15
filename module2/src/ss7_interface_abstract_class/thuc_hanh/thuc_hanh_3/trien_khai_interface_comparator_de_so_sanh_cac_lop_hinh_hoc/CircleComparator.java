package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_3.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import ss6_ke_thua_da_hinh.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
