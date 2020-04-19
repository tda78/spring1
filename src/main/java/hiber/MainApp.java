package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
      CarService carService = context.getBean(CarService.class);

      User user = userService.getUserByAuto("BeutyHorse",2);

      System.out.println(user.getFirstName());
   /*  User user1 = new User("Ivan", "durak", "123@hgj.ru",new Car("gorbunyok",1));
     User user2 = new User("Danila", "umnyy", "125@hgj.ru",new Car("BeutyHorse",1));
     User user3 = new User("Gavrila", "takISyak", "tytu3@hgj.ru",new Car("BeutyHorse",2));
     User user4 = new User("Ivan", "Vasil'evich", "tzar@mail.ru",new Car("Time-Car",1));
     userService.add(user1);
     userService.add(user2);
     userService.add(user3);
     userService.add(user4);
      carService.add(new Car("toyota",25));
      carService.add(new Car("mazda",15));
      carService.add(new Car("audi",5));
       List<User> users = userService.listUsers();

      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
//          System.out.println("Car = "+user.getCar());
//         System.out.println("car = " +user.getCar().getName() + " " + user.getCar().getSeries());
         System.out.println();
      }*/

      context.close();
   }
}
