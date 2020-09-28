package be.abis.exb06.test;

import be.abis.exb06.model.Address;

public class ExB06 {

    public static void main(String[] args) {

        Address address = new Address("street","123","zip","town","Belgium","BE");

        System.out.println(address);
    }
}
