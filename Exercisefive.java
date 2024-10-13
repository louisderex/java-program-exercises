public class Exercisefive {
    public static<E> void printArray(E[] inputArray) {
        for(E element : inputArray) {
            System.out.print(element + "");

        }
        System.out.println();
    }
    public static void main(String[] args){

        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H','U','R','R','Y'};

        System.out.println("array integerArray contains:");
        printArray(intArray); //pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); 

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);
    }
}