package com.section9_inner_abstract_class_interface.interfaces;

public class MobilePhone implements ITelephone {

    private int myNUmber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNUmber) {
        this.myNUmber = myNUmber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is swithed off");
        }

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNUmber && isOn) {
            isRinging = true;
            System.out.println("Mobile phone ringing");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is not on or different number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}