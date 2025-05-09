package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.Person;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository.IPersonRepository;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository.PersonRepository;

import java.util.List;

public class PersonService implements IPersonService{
    private IPersonRepository personRepository = new PersonRepository();

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
