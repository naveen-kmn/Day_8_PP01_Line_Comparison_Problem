package com.blp.line_comparison_problem;

public class LineComparisonProblem
{
    static double x1 = 8;
    static double x2 = 10;
    static double y1 = 12;
    static double y2 = 8;
    static double x3 = 4;
    static double x4 = 8;
    static double y3 = 10;
    static double y4 = 12;
    String lengthOfLine2 = " ";
    String lengthOfLine1 = " ";

    public static void main(String[] args)
    {
        LineComparisonProblem method = new LineComparisonProblem();
        method.lengthCalculation();
        method.useEqualsMethod();
        method.useCompareToMethod();
    }
    private void lengthCalculation()
    {
        lengthOfLine1 = String.valueOf(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        lengthOfLine2 = String.valueOf(Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2)));
        System.out.println("Length Of Line1 = " + lengthOfLine1);
        System.out.println("Length Of Line2 = " + lengthOfLine2);
    }
    private void useEqualsMethod()
    {
        if (lengthOfLine1.equals(lengthOfLine2))
        {
            System.out.println("Length of two lines are equal");
        }
        else
        {
            System.out.println("Length of two lines are different");
        }
    }
    private void useCompareToMethod()
    {
        double diff = (lengthOfLine1.compareTo(lengthOfLine2));
        System.out.println("Differance between two lines = " + diff);
    }
}