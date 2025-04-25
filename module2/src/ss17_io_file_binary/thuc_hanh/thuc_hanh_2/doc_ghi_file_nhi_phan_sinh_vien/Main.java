package ss17_io_file_binary.thuc_hanh.thuc_hanh_2.doc_ghi_file_nhi_phan_sinh_vien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String STUDENT_FILE = "src/ss17_io_file_binary/thuc_hanh/thuc_hanh_2/doc_ghi_file_nhi_phan_sinh_vien/student.txt";
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        studentList.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        studentList.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        studentList.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        studentList.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile(STUDENT_FILE, studentList);
        List<Student> studentDataFromFile = readDataToFile(STUDENT_FILE);
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeDataToFile(String pathFile, List<Student> studentList) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(studentList);

        } catch (FileNotFoundException e) {
            System.out.println("Không thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Student> readDataToFile(String pathFile) {
        List<Student> studentList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(pathFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            studentList = (List<Student>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
