package Week11.com.coderscampus.lesson5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelctionApplication {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        Person person = new Person();
        person.setAge(18);
        person.setName("Julie Smith");
        person.setEyeColor("Brown");

        Method[] methods = person.getClass().getMethods();

        for (Method method : methods){
            System.out.println(method.getName());
        }

        save(person, personRepository);
    }

    @SuppressWarnings("unchecked")
    public static <T, R> void save (T obj, R repo){
        Class<T> c = (Class<T>) obj.getClass();
        try {
           Method saveMethod = repo.getClass().getMethod("save", c);
            saveMethod.invoke(repo, obj);
        } catch ( NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.err.println("Oops there was an error getting the save method");
        }
    }

    // public void save (Person person){
    //     // get a Repository and call the same method on the repo
    //     PersonRepository personRepository = new PersonRepository();
    //     personRepository.save(person);
    // }
}
