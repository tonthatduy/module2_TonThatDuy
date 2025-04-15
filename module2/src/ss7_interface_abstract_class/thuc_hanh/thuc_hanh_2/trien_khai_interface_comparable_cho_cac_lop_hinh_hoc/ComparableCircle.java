package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_2.trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua_da_hinh.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle  extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }

}
