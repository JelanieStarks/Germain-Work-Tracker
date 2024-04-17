// Car.java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

  private String make;
  private String model;
  private int year;
  private int ro;
  private String stock;
  private String tech;
  private String inspection;
  private String dateIn;
  private String dateOut;
  private int daysInService;
  

  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public int getRo() {
    return ro;
  }
  public void setRo(int ro) {
    this.ro = ro;
  }
  public String getStock() {
    return stock;
  }
  public void setStock(String stock) {
    this.stock = stock;
  }
  public String getTech() {
    return tech;
  }
  public void setTech(String tech) {
    this.tech = tech;
  }
  public String getInspection() {
    return inspection;
  }
  public void setInspection(String inspection) {
    this.inspection = inspection;
  }
  public String getDateIn() {
    return dateIn;
  }
  public void setDateIn(String dateIn) {
    this.dateIn = dateIn;
  }
  public String getDateOut() {
    return dateOut;
  }
  public void setDateOut(String dateOut) {
    this.dateOut = dateOut;
  }
  public int getDaysInService() {
    return daysInService;
  }
  public void setDaysInService(int daysInService) {
    this.daysInService = daysInService;
  }
  
}