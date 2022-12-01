package Lab10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	void testPositive() {
		
		int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp = new SelectionSort();
        int[] selSortarr = new int[5];
        selSortarr = temp.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, selSortarr);
	}
	@Test
	void TestNegative() {
			int[] arr = new int[5];
	        arr[0] = -8;
	        arr[1] = -9;
	        arr[2] = -7;
	        arr[3] = -10;
	        arr[4] = -2;
	        
	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = -10;
	        Sortedarr[1] = -9;
	        Sortedarr[2] = -8;
	        Sortedarr[3] = -7;
	        Sortedarr[4] = -2;
	        
	        SelectionSort temp = new SelectionSort();
	        int[] selSortarr = new int[5];
	        selSortarr = temp.basicSelectionSort(arr);
	        
	        assertArrayEquals(Sortedarr, selSortarr);
	}
	
	@Test
	void TestMixed() {
		int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = 2;
        Sortedarr[4] = 7;
        
        SelectionSort temp = new SelectionSort();
        int[] selSortarr = new int[5];
        selSortarr = temp.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, selSortarr);
	}
	
	@Test
	void TestDuplicates() {
		int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -7;
        Sortedarr[3] = 2;
        Sortedarr[4] = 2;
        
        SelectionSort temp = new SelectionSort();
        int[] selSortarr = new int[5];
        selSortarr = temp.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, selSortarr);
	}
	

}
