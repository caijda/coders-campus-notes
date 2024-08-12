package Week11.com.coderscampus.lesson1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
    // Test-Driven Devlopment Methodology
    // Step 1 - write a failing test
    // Step 2 - Write the buisness logic to make the test pass
    // Step 3 - Refactor your code

    @Test
    public void should_add_one_item_to_list() {
        // Three A's
        // Arrange, Act, Assert

        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        
        // Act
        sut.add(10);
        Integer expectedResult = sut.get(0);
        Integer expectedSize = sut.getSize();
        
        // Assert
        // What would we expect to happen?
        // I expect there to be an Inter with a value of 10 stored in the first index in my customList
        assertEquals(10, expectedResult);
        assertEquals(1, expectedSize);
    }
    
    @Test
    public void should_add_eleven_items_to_list (){
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();

        // Act
        sut.add(1);sut.add(2);sut.add(3);sut.add(4);
        sut.add(5);sut.add(6);sut.add(7);sut.add(8);
        sut.add(9);sut.add(10);sut.add(11);

        //Assert
        for(int i = 0; i < 11; i++){
        assertEquals(i+1, sut.get(i));
        }
        assertEquals(11, sut.getSize());

    }

    
}