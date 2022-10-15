import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CondTest {

    @Test
    public void test() {
        //Cond cond = new Cond(-5, 5);
        // теперь проверим, что все сработало (кондиционер взял свои настройки из параметров конструктора)

//        Assertions.assertEquals(-5, cond.getMinTemp());
//        Assertions.assertEquals(5, cond.getMaxTemp());
//        Assertions.assertEquals(-5, cond.getCurrentTemp()); // вручную указываем, иначе она берет значение из поля
//

        // К Конструктору 2
        Cond cond = new Cond(4);
        Assertions.assertEquals(10, cond.getMinTemp());
        Assertions.assertEquals(20, cond.getMaxTemp());
        Assertions.assertEquals(10, cond.getCurrentTemp());

    }
}
