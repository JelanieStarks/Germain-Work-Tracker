import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {
  @Autowired
  private CarRepository carRepository; // Assuming you have a CarRepository class

  @GetMapping("/cars")
  public String showCars(Model model) {
    // Retrieve list of cars from the repository
    Iterable<Car> cars = carRepository.findAll();
    // Add cars to the model
    model.addAttribute("cars", cars);
    return "carView"; // Assuming you have a carView.jsp for displaying cars
  }

  @PostMapping("/cars/add")
  public String addCar(Car car) {
    // Save the car to the repository
    carRepository.save(car);
    // Redirect to the list of cars page
    return "redirect:/cars";
  }
  // You can add more methods for editing, deleting, etc.
}
