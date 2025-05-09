package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.Person;

import java.util.ArrayList;
import java.util.List;

public interface IPersonRepository {
    List<Person> findAll();
}
