public class Power {
    public double power(double x, int n) {
	if (n == 0)
		return 1;
	double v = power(x, n / 2);	
    return n%2 == 0 ? v * v :  v * v * x;  // x^n = x^(n/2) * x^(n/2) * x^(n%2) ---- O(logn)
}
 
public double pow(double x, int n) {
	if (n < 0) {
		return 1 / power(x, -n);
	} else {
		return power(x, n);
	}
}
}