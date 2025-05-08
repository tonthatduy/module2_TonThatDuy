package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Facility;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static IHouseRepository iHouseRepository = new HouseRepository();
    private static IVillaRepository iVillaRepository = new VillaRepository();
    private static IRoomRepository iRoomRepository = new RoomRepository();

    @Override
    public Map<Facility, Integer> findAll() {
        Map<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
        facilityIntegerLinkedHashMap.putAll(iHouseRepository.findAll());
        facilityIntegerLinkedHashMap.putAll(iVillaRepository.findAll());
        facilityIntegerLinkedHashMap.putAll(iRoomRepository.findAll());
        return facilityIntegerLinkedHashMap;
    }

}
