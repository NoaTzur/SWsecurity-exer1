//Noa Tzur(206793267) and Dor Baraam(205818487) 
public class exec1 {


    public static int login_to_moodle(String username, String password){

        //username length must be between 8-12 and with uppercase first letter
        //password length must be between 6-10 and contains just numbers

        if(username.length() < 8 || username.length() > 12 || !first_letter_cap(username)){
            System.out.println("invalid username length");
            return -1;
        }
        if (password.length() < 6 || password.length() > 10){
            System.out.println("invalid password length");
            return -1;
        }
        System.out.println("You have connected successfully");

        return 1;

}

    public static int is_primes(int[] arr){

        for (int i=0; i<arr.length; i++){
            if (!prime(arr[i])){
                System.out.println("This is a boring array");
                return -1;
            }
        }
        System.out.println("Interesting array !!! ");
        return 1;

    }

    private static boolean prime(int n) {
        if(n<=1){
            return false;
        }
        for (int i=2; i<n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;

    }


    private static boolean first_letter_cap(String username) {
        return username.charAt(0) >= 65 && username.charAt(0) <= 90;
    }


    public static void main(String[] args) {
        //login_to_moodle(null, "122343");
       // is_primes(null);
    }

}
