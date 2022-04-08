package HW_3_EscapeSequencesLoops;

public class AdditionalTasks {
    public static void main(String[] args) {
        fibonacciSequence();
    }
    public static void fibonacciSequence() {
/*        1. Выведите на экран первые 11 членов последовательности Фибоначчи.*/
        int first_number = 0, second_number = 1, third_number, i, number =11;
        for(i = 0; i < number; i++) //loop will starts from 2 because we have printed 0 and 1 before
        {
            if (i <= 1)
                third_number = i;
            else
            {
            third_number = first_number + second_number;
            System.out.printf(" %d", third_number);
            first_number = second_number;
            second_number = third_number;
        }
        }
    }
}
/*
    Программа для генерации ряда Фибоначчи с использованием цикла For:

        #include
        #include
        int main()
        (
        int first_number = 0, second_number = 1, third_number, i, number;
        printf("Enter the number for fibonacci series:");
        scanf("%d", &number);
        printf("Fibonacci Series for a given number:");
        printf("\n%d %d", first_number, second_number); //To print 0 and 1
        for(i = 0; i < number; i++) //loop will starts from 2 because we have printed 0 and 1 before
        (
        if(i <= 1)
        third_number = i;
        else
        (
        third_number = first_number + second_number;
        printf(" %d", third_number);
        first_number = second_number;
        second_number = third_number;
        )
        )
        return 0;
        )*/
