package org.example.strings;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");

    }
}
