package car;

public class Сonstructor {
    public static void main(String[] args) {
        Human human = new Human("Олег", 1);

    }
}
class Human {
   private String name;
   private int age;

   public Human(){
       System.out.println("первый конструктор");
       this.name = "имя по умолчанию";
       this.age = 0;
   }
   public Human(String name){
       System.out.println("второй конструткор");
        this.name = name;
   }
    public Human(String name, int age){
        System.out.println("третий конструткор");
        this.name = name;
        this.age = age;
    }
   public void setName(String name){this.name = name;}
   public  void setAge(int name){this.age = age;}
    }

