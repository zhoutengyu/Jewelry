package com.jewelry.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TestTime {
    public static void main(String[] args) {
        ActionListener actionListener=new TimePrinter();
        Timer t=new Timer(2000,actionListener);
        t.start();
    }
}
