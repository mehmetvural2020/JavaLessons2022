package Day2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*Arithmetic operators are used to perform common mathematical operations.

        Operator	Name	        Description	                            Example
            +	    Addition	    Adds together two values	            x + y
            -	    Subtraction	    Subtracts one value from another	    x - y
            *	    Multiplication	Multiplies two values	                x * y
            /	    Division	    Divides one value by another	        x / y
            %	    Modulus/Reminder Returns the division remainder	        x % y
            ++	    Increment	    Increases the value of a variable by 1	++x
            --	    Decrement	    Decreases the value of a variable by 1	--x
*/

        /*Java Assignment Operators:
        Assignment operators are used to assign values to variables.

        In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:*/

        /*A list of all assignment operators:

        Operator	Example	    Same As
            =	    x = 5	    x = 5
            +=	    x += 3	    x = x + 3
            -=	    x -= 3	    x = x - 3
            *=	    x *= 3	    x = x * 3
            /=	    x /= 3	    x = x / 3
            %=	    x %= 3	    x = x % 3
            &=	    x &= 3	    x = x & 3
            |=	    x |= 3	    x = x | 3
            ^=	    x ^= 3	    x = x ^ 3
            >>=	    x >>= 3	    x = x >> 3
            <<=	    x <<= 3	    x = x << 3*/

        /*Java Relational/Comparison Operators:
        Comparison operators are used to compare two values.
        This is important in programming, because it helps us to find answers and make decisions.
        The return value of a comparison is either true or false.
        These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.
        In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:*/

        int x = 5;
        int y = 3;
        System.out.println(x > y); // returns true, because 5 is higher than 3

        /*Operator	Name	                    Example
            ==	    Equal to	                x == y
            !=	    Not equal	                x != y
            >	    Greater than	            x > y
            <	    Less than	                x < y
            >=	    Greater than or equal to	x >= y
            <=	    Less than or equal to	    x <= y*/


        /*Java Logical Operators
        You can also test for true or false values with logical operators.

        Logical operators are used to determine the logic between variables or values:

        Operator	Name	    Description	                                            Example
        && 	        Logical and	Returns true if both statements are true	            x < 5 &&  x < 10
        || 	        Logical or	Returns true if one of the statements is true	        x < 5 || x < 4
        !	        Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)*/
        x = 5;
        System.out.println(x > 3 && x < 10);
        // returns true because 5 is greater than 3 AND 5 is less than 10

        x = 5;
        System.out.println(x > 3 || x < 4);
        // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)

        x = 5;
        System.out.println(!(x > 3 && x < 10));
        // returns false because ! (not) is used to reverse the result

    }
}
