package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Truck;

public class TruckRepository implements ITruckRepository,IVehicleRepository {
    private static Truck[] trucks = new Truck[10];
    static {
        trucks[0] = new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3);
        trucks[1] = new Truck("43C-47.678"," Dongfeng",2020 , "Nguyễn Văn B",9);
        trucks[2] = new Truck("43C-45.235","Hino",2021,"Nguyễn Văn C",12);
    }

    @Override
    public Truck[] findAll() {
        return trucks;
    }

    @Override
    public boolean deleteByControlPlate(String controlPlate) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] == null) {
                break;
            }
            if (trucks[i].getControlPlate().equalsIgnoreCase(controlPlate)) {
                for (int j = i; j < trucks.length; j++) {
                    trucks[j] = trucks[j + 1];
                    if (trucks[j] == null) {
                        break;
                    }

                }
                trucks[trucks.length - 1] = null;
                return true;
            }

        }
        return false;
    }

    @Override
    public void add(Truck truck) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i]==null){
                trucks[i] = truck;
                break;
            }

        }
    }
}
