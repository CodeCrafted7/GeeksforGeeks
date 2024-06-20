

class Solution {

    double maxVolume(double perimeter, double area) {
        // Calculate the adjusted perimeter using the given formula
        double adjustedPerimeter = perimeter - Math.sqrt(Math.pow(perimeter, 2) - (24 * area));
        
        // Calculate the squared adjusted perimeter divided by 12
        double squaredAdjustedPerimeter = Math.pow((adjustedPerimeter / 12), 2);
        
        // Calculate the adjusted height
        double adjustedHeight = (perimeter / 4) - (2 * (adjustedPerimeter / 12));
        
        // Calculate the maximum volume using the obtained values
        double maximumVolume = squaredAdjustedPerimeter * adjustedHeight;
        
        // Return the result rounded to 2 decimal places
        return Math.round(maximumVolume * 100.0) / 100.0;
    }
}
