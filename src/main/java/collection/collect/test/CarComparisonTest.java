package collection.collect.test;

import collection.collect.Car;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class CarComparisonTest {

    Collection<Car> cars;
    Car subaru, tesla, honda;

    @BeforeEach
    public void setUp(TestInfo info) throws Exception{

        System.out.format("%nPerforming %s%n", info.getTestMethod().get().getName());
        this.cars = new ArrayList<>();
        this.subaru = new Car("Subaru", "Impreza", 5200);
        this.tesla = new Car("Tesla","Model S", 100);
        this.honda = new Car("Honda", "Civic", 700);

        this.cars.addAll(Arrays.asList(subaru,this.tesla,this.honda));
    }
    @AfterEach
    public void tearDown() throws Exception{
        System.out.format("%nResults%n");
        this.cars.stream()
                .map(c -> String.format("%s %s", c.getMake(),c.getModel(),c.getMileAge()))
                .forEach(System.out::println);
    }
    @Test
    public void removeTest(){
        this.cars.remove(honda);
        this.cars.remove(new Car("Subaru","Impreza",5200));
        assertEquals(1, this.cars.size());
    }

    @Test
    public void containsTest(){
        assertTrue(this.cars.contains(new Car("Tesla", "Model S", 100)));
        assertTrue(this.cars.contains(honda));
        assertTrue(this.cars.contains(subaru));
    }

}
