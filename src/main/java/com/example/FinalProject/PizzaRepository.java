
package com.example.FinalProject;
import com.example.FinalProject.model.Pizza;
import com.example.FinalProject.model.Topping;
import com.example.FinalProject.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PizzaRepository {
    private static List<Pizza> pizzaList = new ArrayList<>();

    public void Initial() {

        Pizza pizza1 = new Pizza();
        pizza1.setId(1L);
        pizza1.setName("pizza");
        pizza1.setPrice(50d);

        Pizza pizza2 = new Pizza();
        pizza2.setId(2L);
        pizza2.setName("new");
        pizza2.setPrice(60d);

        Pizza pizza3 = new Pizza();
        pizza3.setId(3L);
        pizza3.setName("classica");
        pizza3.setPrice(70d);

        Base baza = new Base(1L);
        baza.setName("Test");
        pizza1.setBase(baza);

        List<Topping> tplist = new ArrayList<>();
        Topping topping1 = new Topping(1l);
        tplist.add(topping1);
        pizza1.setToppings(tplist);

        pizzaList.add(pizza1);
        pizzaList.add(pizza2);
        pizzaList.add(pizza3);
    }
    public List<Pizza> findAll() {

        return pizzaList;
    }
     public Pizza save(Pizza pizza){
        pizzaList.add(pizza);
        return pizza;

     }

}



