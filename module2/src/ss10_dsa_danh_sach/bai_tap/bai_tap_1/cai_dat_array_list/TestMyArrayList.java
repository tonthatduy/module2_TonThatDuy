package ss10_dsa_danh_sach.bai_tap.bai_tap_1.cai_dat_array_list;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student() {

        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Huy");
        Student student1 = new Student(2, "Chiến");
        Student student2 = new Student(3, "Vương");
        Student student3 = new Student(4, "Duy");
//        Student student4 = new Student(5, "Vĩnh");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> studentMyArrayList1 = new MyArrayList<>();
        studentMyArrayList.add(student);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
//        studentMyArrayList.add(student4, 2);
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());

//        System.out.println(studentMyArrayList.indexOF(student1));
        studentMyArrayList1 = studentMyArrayList.clone();
        for (int i = 0; i < studentMyArrayList1.size(); i++) {
            System.out.println(studentMyArrayList1.get(i).getName());

        }
    }
}
