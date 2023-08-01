class Solution {
    public int subtractProductAndSum(int n) {
        int rem, product = 1, sum = 0;
        while (n!=0) {
            rem = n % 10;
            product = rem * product;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Product is: " + product);
        System.out.println("Sum is: " + sum);
        return product - sum;
    }
}