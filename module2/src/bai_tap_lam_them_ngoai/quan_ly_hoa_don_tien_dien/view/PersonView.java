package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.view;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.Person;

import java.util.List;

public class PersonView {
    public static void displayPerson(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));

        }
    }
}
