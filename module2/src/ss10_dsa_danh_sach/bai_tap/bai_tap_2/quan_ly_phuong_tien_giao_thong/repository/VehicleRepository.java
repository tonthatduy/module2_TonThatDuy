package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Car;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Truck;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Vehicle;

import java.util.ArrayList;

public class VehicleRepository implements IVehicleRepository {
    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static final ICarRepository carRepository = new CarRepository();
    private static final ITruckRepository truckRepository = new TruckRepository();
    private static final IMotorBikeRepository motorBikeRepository = new MotorBikeRepository();

    @Override
    public ArrayList<Vehicle> findAll() {
        vehicles.addAll(carRepository.findAll());
        vehicles.addAll(truckRepository.findAll());
        vehicles.addAll(motorBikeRepository.findAll());
        return vehicles;
    }

    @Override
    public Vehicle findByControlPlate(String controlPlate) {
        ArrayList<Vehicle> vehicles1 = findAll();
        for (int i = 0; i < vehicles1.size(); i++) {
            if (vehicles1.get(i).getControlPlate().equalsIgnoreCase(controlPlate)) {
                return vehicles1.get(i);
            }

        }
        return null;
    }

    @Override
    public void delete(Vehicle vehicle) {
        if (vehicle instanceof Car){
           carRepository.delete((Car)vehicle);
        } else if (vehicle instanceof Truck){
            truckRepository.delete((Truck)vehicle);
        } else if (vehicle instanceof MotorBike){
            motorBikeRepository.delete((MotorBike)vehicle);
        }
    }
}
