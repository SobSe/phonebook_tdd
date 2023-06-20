import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    public static PhoneBook phoneBook;
    @BeforeAll
    public  static  void beforeAll() {

    }

    @BeforeEach
    public void beforeEach() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void TestAdd() {
        //arrange
        String name = "Ivanov Ivan";
        String number = "89099099999";
        int expected = 1;
        //act
        int actual = phoneBook.add(name, number);
        //assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestFindByNumber() {
        //arrange
        String name;
        String number;

        name = "Ivanov Ivan";
        number = "89099099999";
        phoneBook.add(name, number);

        name = "Petrov Ivan";
        number = "89099099900";
        phoneBook.add(name, number);

        String expected = "Petrov Ivan";
        //act
        String actual = phoneBook.findByNumber("89099099900");
        //assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestFindByName() {
        //arrange
        String name;
        String number;

        name = "Ivanov Ivan";
        number = "89099099999";
        phoneBook.add(name, number);

        name = "Petrov Ivan";
        number = "89099099900";
        phoneBook.add(name, number);

        String expected = "89099099900";
        //act
        String actual = phoneBook.findByName("Petrov Ivan");
        //assert
        Assertions.assertEquals(expected, actual);
    }
}
