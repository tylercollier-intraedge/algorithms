import java.util.Arrays;

public class IntArrListTest {
    public static void main(String[] args) {
        IntArrList ial = new IntArrList();
        ial.add(7);
        ial.add(9);
        System.out.println(ial.get(99));
        // ial.add(2);
        ial.print();
        // ial.remove(1);
        // ial.print();
    }
}

// class IntArrList {
//     int[] arr = new int[0];

//     public void add(int value) {
//         int[] newArr = new int[arr.length + 1];
//         for (int i = 0; i < arr.length; i++) {
//             newArr[i] = arr[i];
//         }
//         newArr[arr.length] = value;
//         arr = newArr;
//     }
    
//     public void remove(int position) {
//         int[] newArr = new int[arr.length - 1];
//         for (int i = 0; i < arr.length; i++) {
//             if (i > position) {
//                 newArr[i - 1] = arr[i];
//             } else if (i != position) {
//                 newArr[i] = arr[i];
//             }
//         }
//         arr = newArr;
//     }
    
//     public int get(int position) {
//         return arr[position];
//     }
    
//     public void print() {
//         System.out.println(Arrays.toString(arr));
//     }
// }

class IntArrList {
    int size = 0;
    int[] arr = new int[size];

    // If array size is length or greater, do nothing.
    // Otherwise, double the array size.
    private void ensureCapacity() {
        if (size <= arr.length) {
            int[] newArr = new int[arr.length * 2 + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void add(int value) {
        ensureCapacity();
        arr[size] = value;
        size++;
    }
    
    public void remove(int position) {
        
    }
    
    public int get(int position) {
        if (position >= size) {
            throw new Error("Invalid position: " + position);
        }
    }
    
    public int length() {
        return size;
    }
    
    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}