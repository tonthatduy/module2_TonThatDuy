package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Room;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.IRoomRepository;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.RoomRepository;

public class RoomService implements IRoomService {
    private IRoomRepository roomRepository = new RoomRepository();

    @Override
    public void add(Room room) {
        roomRepository.add(room);

    }
}
