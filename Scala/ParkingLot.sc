// Need more work. Check #21


abstract class VehicleStorage {
  name : String
  vehicles : Vector[Vehicle]
  def vehicleCount = vehicles.size
}


class ParkingLot (name : String, vehicles : Vector[Vehicle]) extends VehicleStorage (name, vehicles) {
  override def vehicleCount = vehicles.size
}
