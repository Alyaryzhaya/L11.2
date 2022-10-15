public class Cond {
    // private int currentTemp;  здесь тек.темп будет 0, переносим ее после мин и макс темп.
    private int maxTemp = 30; // заменяем в коде значение 30 на maxTemp
    private int minTemp = 10;
    private int currentTemp = minTemp;


    // КОНСТРУКТОР
    public Cond(int minTemp, int maxTemp) {  // Java добавила этот метод. Название = названию класса. Создаем тест (test)
        // Далее параметризируем конструктор (вставляем параметры)
        //  System.out.println("Hello"); // при каждом создании кондиционера пишет это
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.currentTemp = minTemp;
    }

    // КОНСТРУКТОР 2
    public Cond(int size) {
        maxTemp = minTemp + size;

    }

    // ГЕТТЕР
    public int getCurrentTemp() {
        return currentTemp;

    }

    // ГЕТТЕРЫ
    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }


    public void setCurrentTemp(int newCurrentTemp) {
        if (newCurrentTemp < 10) {  // меняем 0 на 10
            return;
        }
        //if (newCurrentTemp > 30) {  выносим значение макс темп в поле
        if (newCurrentTemp > maxTemp) {
            return;
        }
        currentTemp = newCurrentTemp;
    }

    public void increaseTemp50p() {

        int target = currentTemp * 3 / 2;
        setCurrentTemp(target);
    }

    public void setMaxTemp() {

        currentTemp = maxTemp;
    }
}
