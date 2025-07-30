package String;

public class Ex_57 {

        public static String extractDomainUsingSplit(String email) {

            String[] parts = email.split("@");

            if (parts.length == 2) {
                return parts[1];
            } else {
                return "Invalid email";
            }
        }

        public static void main(String[] args) {
            String email = "john@example.com";
            String domain = extractDomainUsingSplit(email);
            System.out.println("Domain: " + domain);
        }


}
