public class RaceCar implements Cloneable {
    int id;
    String color;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof RaceCar) {
            RaceCar obj1 = (RaceCar) obj;
            return this.id == obj1.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id % 99;
    }
}
