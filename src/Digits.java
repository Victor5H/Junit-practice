import java.util.LinkedList;
import java.util.List;

public class Digits {
     public void aboutIt() {
        System.out.println("This is a public class with  methods to perform some operation on digits");
        System.out.println("Methods are: ");
        System.out.println("");
    }

     public int numberOfDigits(long num) {
        int count = 0;
        if (num == 0) return 1;
        while (num > 0) {
            num = num / 10;  // removing the last digit
            count++;  // increasing count
        }
        return count;
    }

    public  long sumOfDigitsUnit(long num) {  // calculate sum of digits till results into unit digit
        long temp, sum = 0;
        while (num > 0) {
            temp = num % 10; // getting the last digits
            sum += temp;  // adding them
            num = num / 10;  // removing last digit
        }
        if (sum > 9)
            return sumOfDigitsUnit(sum); // calling it again if sum is bigger than 9
        else
            return sum;
    }

     public long factorial(long num) {
        if (num == 1) return 1;
        else {
            return factorial(num - 1) * num;
        }
    }

     public void fibonacciTo(long num) {
        long sum = 0L, a, b = 1L;
        while (num > 0) {
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
            num--;
        }
    }

     public boolean isArmstrong(long num) {
        long deg = numberOfDigits(num), temp = num, sum = 0, dig;
        while (num > 0) {
            dig = num % 10;
            sum += Math.pow(dig, deg);
            num = num / 10;
        }
        if (temp == sum) return true;
        else return false;
    }

     public long sumOfDigits(long num) {
        long sum = 0, dig;
        while (num > 0) {
            dig = num % 10;
            sum += dig;
            num /= 10;
        }
        return sum;
    }

     public boolean isEven(long num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

     public boolean isOdd(long num) {
        if (num % 2 != 0)
            return true;
        else
            return false;
    }

     public boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

     public boolean isComposite(long num) {
        if (num <= 1) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i != 0) {
                return true;
            }
        }
        return false;
    }

    public  boolean isTwinPrime(long n1, long n2) {
        long diff;
        if (isPrime(n1) && isPrime(n2)) {
            diff = n1 - n2;
            System.out.println(diff);
            if (diff == 2 || diff == -2) return true;
            else return false;
        } else return false;
    }

    public  boolean isPerfectNum(long num) {  // sum of factors = number itself
        long sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {  // getting factors
                sum += i;
            }
        }
        if (sum == num) return true;
        else return false;
    }

    public  long HCF(long n1, long n2) {
        long hcf = 0;
        for (long i = 1; i < n1 || i < n2; i++) { // selecting which is the bigger one
            if (n1 % i == 0 && n2 % i == 0) {  // checking if both numbers are divisible by i

                hcf = i;
            }
        }
        return hcf;
    }

    public  long euclidHCF(long n1, long n2) {
        long r = 0;
        while (n2 % n1 != 0) {
            r = n2 % n1;
            n2 = n1;
            n1 = r;
        }
        return n1;
    }

    public  int[] DecToBin(long num) {
        int rem = 0;
        int[] bin = new int[64];
        int index = 0;
        while (num > 0) {
            bin[index++] = (int) num % 2; // calculating remainder and will be placed according to bit
            num = num / 2;
        }
        int[] nbin = new int[index];  // new array with size of index
        for (int i = 0; i < index; i++) {
            nbin[i] = bin[i];
        }
        return nbin;
    }

    public  List<Integer> PrimeFromTO(int from, int to) {
        List<Integer> l = new LinkedList<Integer>();
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) l.add(i);
        }
        return l;
    }

    public  void main(String[] args) {
        // tests
        //fibonacciTo(10000);
        int arr[]=DecToBin(13);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(isPrime(9));

//        List<Integer> l = PrimeFromTO(1, 100);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//        }
//        System.out.println(isComposite(9));

        System.out.println(HCF(36, 48));
        System.out.println(euclidHCF(36, 48));
    }


}
