package com.jewelry.timer;

import com.jewelry.utils.DateTimeUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("当前时间是"+ DateTimeUtils.formatDate(new Date(),DateTimeUtils.PATTERN_DATETIME));
        Toolkit.getDefaultToolkit().beep();
    }


}
