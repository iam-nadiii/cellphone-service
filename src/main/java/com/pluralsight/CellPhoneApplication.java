package com.pluralsight;


import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        CellPhone cellPhone1 = getCellPhone();
        CellPhone cellPhone2 = getCellPhone();

        display(cellPhone1);

        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());

        cellPhone2.dial(cellPhone1.getPhoneNumber());


    }

    private static CellPhone getCellPhone() {
        Scanner input = new Scanner(System.in);

        CellPhone cellphone = new CellPhone();

        prompt("Enter serial number: ");
        cellphone.setSerialNumber(input.nextLong());
        input.nextLine();

        prompt("Enter the model of your phone: ");
        cellphone.setModel(input.nextLine());
//        input.nextLine();

        prompt("Enter your carrier: ");
        cellphone.setCarrier(input.next());
        input.nextLine();


        prompt("Enter your phone number: ");
        cellphone.setPhoneNumber(input.next());
        input.nextLine();

        prompt("Enter name of the owner of this number: ");
        cellphone.setOwner(input.next());
        input.nextLine();
        System.out.println();
        return cellphone;
    }

    private static void display(CellPhone cellphone) {
        System.out.println();
        System.out.print("Owner name: ");
        prompt(cellphone.getOwner());
        System.out.println();

        System.out.print("Phone number: ");
        prompt(cellphone.getPhoneNumber());
        System.out.println();

        System.out.print("Model: ");
        prompt(cellphone.getModel());
        System.out.println();

        System.out.print("Serial Number: ");
        prompt(Long.toString(cellphone.getSerialNumber()));
        System.out.println();

        System.out.print("Carrier: ");
        prompt(cellphone.getCarrier());
        System.out.println();


    }

    static void prompt(String label){
        System.out.print(label);
    }

}




