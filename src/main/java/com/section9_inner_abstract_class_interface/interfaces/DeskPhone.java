package com.section9_inner_abstract_class_interface.interfaces;

public class DeskPhone implements ITelephone {

    private int myNUmber;
    private boolean isRinging;

    public DeskPhone(int myNUmber) {
        this.myNUmber = myNUmber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNUmber) {
            isRinging = true;
            System.out.println("Desk phone ringing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
