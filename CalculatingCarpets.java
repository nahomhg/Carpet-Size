import java.util.*;
public class CalculatingCarpets {

    public static void main(String[]args)
    {
        System.out.println("Length of room (in m to 1dp)?: ");
        userLengthInput();//calling method userLengthInput
        System.out.println("Width of room (in m to 1dp)?: ");
        userWidthInput();
        System.out.println("your room area is: "+roomAreaCal());
        System.out.println("The extra you need for wastage is: "+wasteCalculation());
    }
    public static float userLengthInput()
    {
        Scanner scn = new Scanner(System.in); //Creating variable 'scn' of type Scanner 
        float length = scn.nextFloat(); //creating a float variable and equalling it to the next input from the user.
        return length; //returning the variable because in the method we're asking for a 'float' return type.

    }
    public static float userWidthInput()
    {
        Scanner scn = new Scanner(System.in);
        float width = scn.nextFloat();
        scn.close(); //Closing the scanner.
        return width;

    }

    public static float roomAreaCal() {
        float roomAreaResult = userLengthInput() * userWidthInput(); /*calling the return types of the two methods, 
        multiplying them, then equaling the value to a float variable*/
        return roomAreaResult;
    }
    public static float wasteCalculation()
    {
        float wasteRoom = (roomAreaCal() * 5) / 100; /*initialising the value of 'wasteRoom' to what 'roomareacal' * 5 
        and dividing the result by 100 */

        return wasteRoom;
    }
    public static float totalCalcu()
    {
        float areaCalcu = wasteCalculation() * 10; /*multiplying the value of 'wasteCalculation' by 10 and initialising it 
        to the variable 'areaCalcu'*/

        float totalArea = Math.round(areaCalcu / 10);/*rounding down the value by getting the value of 
        'areaCalcu' dividing it by 10 and the result of that would be what it's rounded to*/
        return totalArea;
    }


}
