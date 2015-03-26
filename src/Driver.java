/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import network.util.TwibblerMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author m_wozni
 */
public class Driver extends javax.swing.JFrame {

    /**
     * Creates new form TwibblerUI
     */
    public Driver() {
        initComponents();
        HomePanel.setVisible(true);
        LoginPanel.setVisible(false);
        RegisterPanel.setVisible(false);
        OptionPanel.setVisible(false);
        PostProfile.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        HomePanel = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameInput = new javax.swing.JFormattedTextField();
        LoginSubmitButton = new javax.swing.JButton();
        RegisterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OptionPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ShowPublisherButton = new javax.swing.JRadioButton();
        PostTwibbleButton = new javax.swing.JRadioButton();
        DeleteTwibbleButton = new javax.swing.JRadioButton();
        SubscribeButton = new javax.swing.JRadioButton();
        UnsubscribeButton = new javax.swing.JRadioButton();
        DeregisterButton = new javax.swing.JRadioButton();
        ExitButton = new javax.swing.JRadioButton();
        OptionSubmitButton = new javax.swing.JButton();
        UpdateProfileButton = new javax.swing.JRadioButton();
        PostProfileButton = new javax.swing.JRadioButton();
        OptionRequire = new javax.swing.JLabel();
        PostProfile = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LocationInput = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        interestInput = new javax.swing.JFormattedTextField();
        PostProfileSubmitButton = new javax.swing.JButton();
        ErrorPostProfile = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(640, 480));

        HomePanel.setPreferredSize(new java.awt.Dimension(640, 480));

        HomeLabel.setText("Welcome to Twibbler");

        LoginButton.setText("login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
                HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePanelLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(198, Short.MAX_VALUE))
                        .addGroup(HomePanelLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(HomeLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LoginButton, RegisterButton});

        HomePanelLayout.setVerticalGroup(
                HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePanelLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(HomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RegisterButton))
                                .addContainerGap(229, Short.MAX_VALUE))
        );

        HomePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LoginButton, RegisterButton});

        LoginPanel.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel2.setLabelFor(LoginPanel);
        jLabel2.setText("Login");

        jLabel3.setText("Username");

        LoginSubmitButton.setText("Submit");
        LoginSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
                LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addContainerGap(195, Short.MAX_VALUE)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LoginSubmitButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UsernameInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(180, 180, 180))
        );
        LoginPanelLayout.setVerticalGroup(
                LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(LoginSubmitButton)
                                .addContainerGap(188, Short.MAX_VALUE))
        );

        RegisterPanel.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("Register");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
                RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegisterPanelLayout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(jLabel1)
                                .addContainerGap(325, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
                RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegisterPanelLayout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel1)
                                .addContainerGap(253, Short.MAX_VALUE))
        );

        OptionPanel.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel4.setText("Options");

        buttonGroup1.add(ShowPublisherButton);
        ShowPublisherButton.setText("Show Publisher");
        ShowPublisherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPublisherButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(PostTwibbleButton);
        PostTwibbleButton.setText("Post Twibble");
        PostTwibbleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostTwibbleButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(DeleteTwibbleButton);
        DeleteTwibbleButton.setText("Delete Twibble");
        DeleteTwibbleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTwibbleButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(SubscribeButton);
        SubscribeButton.setText("Subscribe");
        SubscribeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscribeButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(UnsubscribeButton);
        UnsubscribeButton.setText("Unsubscribe");
        UnsubscribeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnsubscribeButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(DeregisterButton);
        DeregisterButton.setText("Deregister");
        DeregisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeregisterButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(ExitButton);
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        OptionSubmitButton.setText("Submit");
        OptionSubmitButton.setEnabled(false);
        OptionSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionSubmitButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(UpdateProfileButton);
        UpdateProfileButton.setText("Update Profile");
        UpdateProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProfileButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(PostProfileButton);
        PostProfileButton.setText("Post Profile");
        PostProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostProfileButtonActionPerformed(evt);
            }
        });

        OptionRequire.setText("choose one option");

        javax.swing.GroupLayout OptionPanelLayout = new javax.swing.GroupLayout(OptionPanel);
        OptionPanel.setLayout(OptionPanelLayout);
        OptionPanelLayout.setHorizontalGroup(
                OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(jLabel4))
                                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ShowPublisherButton)
                                                        .addComponent(PostTwibbleButton)
                                                        .addComponent(DeleteTwibbleButton)
                                                        .addComponent(SubscribeButton)
                                                        .addComponent(UnsubscribeButton)
                                                        .addComponent(DeregisterButton)
                                                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                                                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                                                                .addComponent(ExitButton)
                                                                                .addGap(82, 82, 82))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionPanelLayout.createSequentialGroup()
                                                                                .addComponent(OptionRequire)
                                                                                .addGap(42, 42, 42)))
                                                                .addComponent(OptionSubmitButton))
                                                        .addComponent(UpdateProfileButton)
                                                        .addComponent(PostProfileButton))))
                                .addContainerGap(287, Short.MAX_VALUE))
        );
        OptionPanelLayout.setVerticalGroup(
                OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(PostProfileButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateProfileButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowPublisherButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PostTwibbleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteTwibbleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubscribeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UnsubscribeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeregisterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(OptionPanelLayout.createSequentialGroup()
                                                .addComponent(ExitButton)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionPanelLayout.createSequentialGroup()
                                                .addGap(0, 83, Short.MAX_VALUE)
                                                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(OptionSubmitButton)
                                                        .addComponent(OptionRequire))
                                                .addGap(85, 85, 85))))
        );

        jLabel5.setLabelFor(PostProfile);
        jLabel5.setText("Post Profile");

        jLabel6.setLabelFor(LocationInput);
        jLabel6.setText("Location :");

        jLabel7.setText("Interest :");

        PostProfileSubmitButton.setText("submit");
        PostProfileSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostProfileSubmitButtonActionPerformed(evt);
            }
        });

        ErrorPostProfile.setVisible(false);
        ErrorPostProfile.setBackground(new java.awt.Color(255, 0, 0));
        ErrorPostProfile.setForeground(new java.awt.Color(255, 0, 0));
        ErrorPostProfile.setText("ERROR : please fill both input before submitting");
        ErrorPostProfile.setEnabled(false);

        javax.swing.GroupLayout PostProfileLayout = new javax.swing.GroupLayout(PostProfile);
        PostProfile.setLayout(PostProfileLayout);
        PostProfileLayout.setHorizontalGroup(
                PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PostProfileLayout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addGroup(PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PostProfileSubmitButton)
                                        .addGroup(PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PostProfileLayout.createSequentialGroup()
                                                        .addGroup(PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel6))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(LocationInput)
                                                                .addComponent(interestInput)
                                                                .addComponent(ErrorPostProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(155, Short.MAX_VALUE))
        );
        PostProfileLayout.setVerticalGroup(
                PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PostProfileLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(ErrorPostProfile)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(interestInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PostProfileLayout.createSequentialGroup()
                                                .addGroup(PostProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(LocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(66, 66, 66)
                                                .addComponent(PostProfileSubmitButton))
                                        .addComponent(jLabel7))
                                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HomePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RegisterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OptionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PostProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OptionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PostProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(HomePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoginPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RegisterPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(OptionPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PostProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        HomePanel.setVisible(false);
        RegisterPanel.setVisible(false);
        LoginPanel.setVisible(true);
    }

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        HomePanel.setVisible(false);
        RegisterPanel.setVisible(true);
        LoginPanel.setVisible(false);
    }

    private void LoginSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //send user input to server 
        //ouputRequest.setUsername = UsernameInput.getText();
        //clientUsername = UsernameInput.getText();


        Object in = null;
        TwibblerMessage inputResponse;
        TwibblerMessage outputRequest;
        outputRequest = new TwibblerMessage();

        outputRequest.setType(TwibblerMessage.MessageType.LOGIN);

        outputRequest.setUsername(UsernameInput.getText());

        //Read request from client and send request to server

        try {
            toServer.writeObject(outputRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read response from server
        try {
            in = fromServer.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        inputResponse = (TwibblerMessage) in;



        if(inputResponse.getContent().equals("Successful login"))
        {
            clientUsername = UsernameInput.getText();
            HomePanel.setVisible(false);
            LoginPanel.setVisible(false);
            OptionPanel.setVisible(true);
        }


    }

    private void OptionSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if(PostProfileButton.isSelected())
        {
            OptionPanel.setVisible(false);
            PostProfile.setVisible(true);
        }
        if(UpdateProfileButton.isSelected())
        {

        }
        if(ShowPublisherButton.isSelected())
        {

        }
        if(PostTwibbleButton.isSelected())
        {

        }
        if(DeleteTwibbleButton.isSelected())
        {

        }
        if(SubscribeButton.isSelected())
        {

        }
        if(DeregisterButton.isSelected())
        {

        }
        if(ExitButton.isSelected())
        {

        }

    }

    private void PostProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void UpdateProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void ShowPublisherButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void PostTwibbleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void DeleteTwibbleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void SubscribeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void UnsubscribeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void DeregisterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OptionSubmitButton.setEnabled(true);
        OptionRequire.setVisible(false);
    }

    private void PostProfileSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
       //f(LocationInput.getText().isEmpty() || interestInput.getText().isEmpty())
        //
          ////error
           //rrorPostProfile.setVisible(true);
        //
       //lse
        {
            Object in = null;
            TwibblerMessage inputResponse;
            TwibblerMessage outputRequest;

            outputRequest = new TwibblerMessage();
            outputRequest.setType(TwibblerMessage.MessageType.POST_PROFILE);

            outputRequest.setUsername(clientUsername);
            outputRequest.setLocation(LocationInput.getText());
            outputRequest.setInterest(interestInput.getText());

            //Read request from client and send request to server

            try {
                toServer.writeObject(outputRequest);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Read response from server
            try {
                in = fromServer.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            inputResponse = (TwibblerMessage) in;
        }
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
        try {
            toServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fromServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {



        int serverPort = 9000;
        String serverAddress = "localhost";


        //ObjectOutputStream toServer;
        //ObjectInputStream fromServer;
        //BufferedReader userInput;

        try{
            InetAddress host = InetAddress.getByName(serverAddress);
            socket = new Socket(host, serverPort);

            toServer = new ObjectOutputStream(socket.getOutputStream());
            fromServer = new ObjectInputStream(socket.getInputStream());

            //Object in = null;
            //TwibblerMessage inputResponse;
            //TwibblerMessage outputRequest;



        /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Driver().setVisible(true);
                }
            });
        }catch (UnknownHostException e) {
            System.out.println("UnknownHostException:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException:" + e.getMessage());
        }
    }

    //
    private static ObjectOutputStream toServer;
    private static ObjectInputStream fromServer;
    private static BufferedReader userInput;
    private static Socket socket = null;
    private String clientUsername;

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton DeleteTwibbleButton;
    private javax.swing.JRadioButton DeregisterButton;
    private javax.swing.JLabel ErrorPostProfile;
    private javax.swing.JRadioButton ExitButton;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JFormattedTextField LocationInput;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton LoginSubmitButton;
    private javax.swing.JPanel OptionPanel;
    private javax.swing.JLabel OptionRequire;
    private javax.swing.JButton OptionSubmitButton;
    private javax.swing.JPanel PostProfile;
    private javax.swing.JRadioButton PostProfileButton;
    private javax.swing.JButton PostProfileSubmitButton;
    private javax.swing.JRadioButton PostTwibbleButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JRadioButton ShowPublisherButton;
    private javax.swing.JRadioButton SubscribeButton;
    private javax.swing.JRadioButton UnsubscribeButton;
    private javax.swing.JRadioButton UpdateProfileButton;
    private javax.swing.JFormattedTextField UsernameInput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField interestInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration                   
}
