package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToOne(optional = false, mappedBy = "car")
    private Long idCar;

    private String name;

    private int series;

    public Car() {
    }

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Long getId() {
        return idCar;
    }

    public void setId(Long id) {
        this.idCar = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
