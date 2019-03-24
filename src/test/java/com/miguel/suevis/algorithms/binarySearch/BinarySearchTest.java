package com.miguel.suevis.algorithms.binarySearch;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test class to {@link BinarySearch}
 *
 * @author <a href="miguelangelsuevis@gmail.com">Miguel Angel Suevis Pacheco</a>
 * @since 1.0
 * @version 1.0
 */
@DisplayName("Test class to BinarySearch class")
public class BinarySearchTest {

    private BinarySearch binarySearch= new BinarySearch();

    @Test
    @DisplayName("Find element at the start")
    public void searchElementAtTheStart(){

        int[] numbers = {2, 3, 4, 10, 100, 150};

        assertThat(binarySearch.binarySearch(numbers,2))
                .isEqualTo(0);
    }

    @Test
    @DisplayName("Find element in the middle")
    public void searchElementInTheMiddle(){

        int[] numbers = {2, 3, 4, 10, 40};

        assertThat(binarySearch.binarySearch(numbers,4))
                .isEqualTo(2);
    }

    @Test
    @DisplayName("Find element at the end")
    public void searchElementAfterTheMiddle(){

        int[] numbers = {2, 3, 4, 10, 100, 150};

        assertThat(binarySearch.binarySearch(numbers,150))
                .isEqualTo(5);
    }

    @Test
    @DisplayName("Not found element")
    public void binarySearchNotFoundElement(){

        int[] numbers = {2, 3, 4, 10, 40};
        assertThat(binarySearch.binarySearch(numbers,50))
                .isEqualTo(-1);
    }

}
