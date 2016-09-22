
public class Animal implements Pet{



    /**
     * Имя
     */
    private final String name;

    @Override
    public String getName() {
        return name;
    }

    /**
     * Конструктор
     * @param name Имя животного
     */
    public Animal(final String name){
        this.name = name;
    }

    /**
     *Подать голос
     */
    @Override
    public void makeSound(){
        System.out.println(String.format("%s say : %s", this.name, "beep"));
    }

    /**
     * Определяет голодный или нет
     * @return если голодный true
     */
    private boolean isHungry(){
        return true;
    }

}
