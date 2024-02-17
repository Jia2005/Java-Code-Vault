//Registration form with Name, Email and Password as fields
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame {
    private TextField nameTextField;
    private TextField emailTextField;
    private TextField passwordTextField;

    public RegistrationForm() {
        
        setTitle("Registration Form");
        setSize(300, 280);
        setLayout(new FlowLayout());

        
        Label nameLabel = new Label("Name*:");
        Label emailLabel = new Label("Email*:");
        Label passwordLabel = new Label("Password*:");

      
        nameTextField = new TextField(30);
        emailTextField = new TextField(30);
        passwordTextField = new TextField(30);
        passwordTextField.setEchoChar('*'); 

        
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");

        
        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(passwordLabel);
        add(passwordTextField);
        add(submitButton);
        add(cancelButton);

        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String password = passwordTextField.getText();
                // checks if all the fields are filled  
                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    showMessage("Please fill in all required fields.");
                } else {
                    showMessage("Registration successful:\nName: " + name + "\nEmail: " + email);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText("");
                emailTextField.setText("");
                passwordTextField.setText("");
                showMessage("Registration canceled.");
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private void showMessage(String message) {
        
        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.setVisible(true);
    }
}
