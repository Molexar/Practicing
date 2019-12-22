package classes;

public class SolveEquations {


    public double func(double x){
        return (Math.pow(x, 5) + Math.pow(x, 4) - 345.3*x - 23);
    }

    public double solve(double start, double end){
        if ((end - start) <= 0.001){
            return start;
        }

        double x = (start + end)/2;
        //Таким подходом мы добьемся максимальной точности получения результата.
        if (x == end || x == start){
            return x;
        }
        if (func(start) * func(x) > 0){
            return solve(x, end);
        }
        else{
            return solve(start, x);
        }
    }
}
