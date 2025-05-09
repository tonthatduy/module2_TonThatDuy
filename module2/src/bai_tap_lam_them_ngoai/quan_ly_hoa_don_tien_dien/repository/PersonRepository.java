package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository {
    private IVietNamRepository vietNamRepository = new VietNamRepository();
    private IForeignerRepository foreignerRepository = new ForeignerRepository();

    @Override
    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        persons.addAll(vietNamRepository.findAll());
        persons.addAll(foreignerRepository.findAll());
        return persons;
    }
}
