public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n+1];
            primes[0] = primes[1] = false;
        for ( int i = 2; i < n; i++){
            primes[i] = true;
        }
        int prime = 2;
        for (; prime < Math.sqrt(n); prime++){
            if(primes[prime] == false);
            else{
                int counter = prime;
                while (counter < n - 1) {
                    counter = counter + prime;
                    primes[counter] = false;         
                }

                }
            }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < n; i++){
            if(primes[i] == true) System.out.println(i);
        }

        }

    }
    

