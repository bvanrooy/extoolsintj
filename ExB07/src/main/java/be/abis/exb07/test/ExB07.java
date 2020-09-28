package be.abis.exb07.test;

import be.abis.exb07.model.Address;

public class ExB07 {
    public static void main(String[] args) {

        Address address = new Address("street","123","zip","town","Belgium","BE");

        System.out.println(address);
    }
}
