package car;

import java.time.LocalDate;

public class InterfaceRunnableTester implements Runner  {
    public void run(){
        System.out.println("выполняю эту хуйню");
    }
    public class Data implements Runner{
        public void run(){
            var date = LocalDate.now();
            System.out.println("Сегодня " + date.getDayOfWeek());
        }
    }

}
