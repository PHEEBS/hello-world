package packagerday6;

/**
 * Created by sahoos on 7/25/2017.
 */
public class Car implements Comparable<Car> {

    int id;
    int price;
    String brand;

    public Car(int id, int price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    //default natural sorting
    public int compareTo(Car car){
        if(this.id == car.id)
            return 0;
        else if(this.id > car.id){
            return 1;
        }
        return -1;
    }

    public boolean equals(Object object){
        if(object instanceof Car){
            Car c = (Car)object;
            if(this.id == c.id && this.brand.equals(c.brand) && this.price == c.price ){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
