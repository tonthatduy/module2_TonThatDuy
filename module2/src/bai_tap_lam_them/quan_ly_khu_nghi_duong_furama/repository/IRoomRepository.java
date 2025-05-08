package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Room;

import java.util.Map;

public interface IRoomRepository {
    Map<Room,Integer> findAll();
    void add(Room room);
}
