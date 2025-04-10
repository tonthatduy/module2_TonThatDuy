package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_2.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    protected String getName() {
        return name;
    }

    protected String getClasses() {
        return classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
