
public class RoomCarpet {

	private RoomDimension room;
	private double costPerFoot;

	public RoomCarpet(RoomDimension r, double c) {
		room = new RoomDimension(r);
		costPerFoot = c;
	}
	public RoomCarpet(RoomDimension r) {
		this(r, 100);
	}
	public RoomCarpet(RoomCarpet c) {
		room = c.room;
		costPerFoot = c.costPerFoot;
	}

	public double getCost() {
		return costPerFoot * room.getArea();
	}

	public String toString() {
		return String.format("Pricing\n=============\nCost Per Foot: KES %,.2f\nTotal Cost: KES %,.2f", costPerFoot, this.getCost());
	}
}