package ss5_access_modifier_static_method_static_property.bai_tap.bai_tap_2.xay_dung_lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Duy");
        student.setClasses("C0225G1-JV101");
        System.out.println("Name: " + student.getName() + " Class: " + student.getClasses());
    }

}
