package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Room;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.ReadAndWriteFileFurama;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private static final String ROOM_FILE = "src/bai_tap_lam_them/quan_ly_khu_nghi_duong_furama/data/room.csv";

    @Override
    public Map<Room, Integer> findAll() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFileFurama.readFile(ROOM_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            roomIntegerMap.put(new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                    Integer.parseInt(array[4]), array[5],
                    array[6]), Integer.parseInt(array[7]));

        }
        return roomIntegerMap;
    }

    @Override
    public void add(Room room) {
        List<String> stringList = new ArrayList<>();
        stringList.add(room.getInfotoFileRoom() + ",0");
        ReadAndWriteFileFurama.writeFile(ROOM_FILE, stringList, true);
    }
}
