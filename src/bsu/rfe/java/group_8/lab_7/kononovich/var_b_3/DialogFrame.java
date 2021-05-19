package bsu.rfe.java.group_8.lab_7.kononovich.var_b_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class DialogFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int INCOMING_AREA_DEFAULT_ROWS = 10;
    private static final int OUTGOING_AREA_DEFAULT_ROWS = 5;


    private static final int MEDIUM_GAP = 10;

    private static final int WIDTH = 300;
    private static final int HEIGHT = 400;

    private String date;
    private MainFrame frame;


    private final JTextArea textAreaIn;
    private final JTextArea textAreaOut;
}