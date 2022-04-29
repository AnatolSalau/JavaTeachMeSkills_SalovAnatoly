/*
       - статический метод, который принимает целое число N, и
       возвращает массив случайных векторов размером N.

       Предусмотреть метод для вывода информации о векторе.
               Каждый из классов должен иметь константу, содержащею описание
       вектора.
               Например, "Это вектор для двумерной системы координат".
               Эта константа так же должна выводиться в методе для вывода
       информации о векторе.
               Дополнительное задание
       2. Предыдущее задание обобщить и написать один класс Vector для
       произвольной размерности.
       Для этого в классе вектор для хранения координат следует использовать
       массив.*/
package HW_9_Static;

public class Main {
    public static void main(String[] args) {

    Vector vector = new Vector(1,2,3);
    Vector vector2 = new Vector(1,3,3);

        Vector vector3 = new Vector(3,3);
        Vector vector4 = new Vector(1,2);

        vector.printVectorLength();

        Vector.printScalarMultiply(vector, vector4, 10);

        Vector.printScalarDifference(vector3,vector4);

        Vector.printArrayVectors(10, SizeVector.THREE_SIZE_VECTOR);

        vector4.printToString();
    }
}
