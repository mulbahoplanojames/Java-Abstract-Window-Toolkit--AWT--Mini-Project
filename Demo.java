
import java.awt.*;
import java.awt.event.*;

import javax.swing.UIDefaults.ActiveValue;

import org.w3c.dom.css.CSS2Properties;

public class Demo {

    public static void main(String[] args) {

        // FrameObject and it's methods
        Frame mainFrame = new Frame("JAVA MINI PROJECT USING SWT");
        mainFrame.setSize(1100, 700);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        mainFrame.setBackground(new Color(48, 56, 65));
        mainFrame.setForeground(Color.WHITE);

        // ! Title Label Objects and its method
        Label titleLabel = new Label(
                "Please Fill This Form To Calculate Students Marks Of Year 2 Software Engineering");
        titleLabel.setBounds(80, 60, 1000, 30);
        titleLabel.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        mainFrame.add(titleLabel);

        // ! First module Label and TextField
        Label moduleOneLabel = new Label("Advance English:");
        moduleOneLabel.setBounds(50, 130, 170, 30);
        moduleOneLabel.setBackground(Color.blue);
        moduleOneLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleOneLabel);

        TextField moduleOnTextField = new TextField();
        moduleOnTextField.setBounds(230, 130, 250, 30);
        mainFrame.add(moduleOnTextField);

        // ! Module Two Label and TextField
        Label moduleTwoLabel = new Label("C# Programming:");
        moduleTwoLabel.setBounds(590, 130, 180, 30);
        moduleTwoLabel.setBackground(Color.blue);
        moduleTwoLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleTwoLabel);

        TextField moduleTwoTextField = new TextField();
        moduleTwoTextField.setBounds(780, 130, 250, 30);
        mainFrame.add(moduleTwoTextField);

        // ! Module Three Label and TextField
        Label moduleThreeLabel = new Label("Java Programming:");
        moduleThreeLabel.setBounds(50, 200, 200, 30);
        moduleThreeLabel.setBackground(new Color(28, 61, 91));
        moduleThreeLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleThreeLabel);

        TextField moduleThreeTextField = new TextField();
        moduleThreeTextField.setBounds(260, 200, 220, 30);
        mainFrame.add(moduleThreeTextField);

        // ! Module Four Label and TextField
        Label moduleFOurLabel = new Label("System Analysis and Design:");
        moduleFOurLabel.setBounds(590, 200, 285, 30);
        moduleFOurLabel.setBackground(new Color(28, 61, 91));
        moduleFOurLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleFOurLabel);

        TextField moduleFourTextField = new TextField();
        moduleFourTextField.setBounds(885, 200, 150, 30);
        mainFrame.add(moduleFourTextField);

        // ! Module Five Label and TextField
        Label moduleFiveLabel = new Label("System Administration (Linux):");
        moduleFiveLabel.setBounds(50, 270, 310, 30);
        moduleFiveLabel.setBackground(Color.blue);
        moduleFiveLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleFiveLabel);

        TextField moduleFiveTextField = new TextField();
        moduleFiveTextField.setBounds(370, 270, 120, 30);
        mainFrame.add(moduleFiveTextField);

        // ! Module Six Label and TextField
        Label moduleSixLabel = new Label("Mobile Application Development:");
        moduleSixLabel.setBounds(590, 270, 325, 30);
        moduleSixLabel.setBackground(Color.blue);
        moduleSixLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleSixLabel);

        TextField moduleSixTextField = new TextField();
        moduleSixTextField.setBounds(925, 270, 110, 30);
        mainFrame.add(moduleSixTextField);

        // ! Module Seven Label and TextField
        Label moduleSevenLabel = new Label("Human Computer Interaction:");
        moduleSevenLabel.setBounds(50, 330, 310, 30);
        moduleSevenLabel.setBackground(new Color(28, 61, 91));
        moduleSevenLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleSevenLabel);

        TextField moduleSevenTextField = new TextField();
        moduleSevenTextField.setBounds(370, 330, 120, 30);
        mainFrame.add(moduleSevenTextField);

        // ! Module Eight Label and TextField
        Label moduleEightLabel = new Label("ASP.NET:");
        moduleEightLabel.setBounds(590, 330, 110, 30);
        moduleEightLabel.setBackground(new Color(28, 61, 91));
        moduleEightLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(moduleEightLabel);

        TextField moduleEightTextField = new TextField();
        moduleEightTextField.setBounds(710, 330, 320, 30);
        mainFrame.add(moduleEightTextField);

        // ! Module Seven Label and TextField
        Label outOfMarksLabel = new Label("Out Of Marks:");
        outOfMarksLabel.setBounds(50, 420, 150, 30);
        outOfMarksLabel.setBackground(new Color(28, 61, 91));
        outOfMarksLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(outOfMarksLabel);

        TextField outOfMarksTextField = new TextField();
        outOfMarksTextField.setBounds(220, 420, 400, 30);
        mainFrame.add(outOfMarksTextField);

        // ! Precentage Button
        Button percentageButton = new Button("PERCENTAGE");
        percentageButton.setBounds(120, 480, 180, 40);
        percentageButton.setFont(new Font("TimesRoman", Font.BOLD, 17));
        percentageButton.setBackground(Color.black);
        mainFrame.add(percentageButton);

        // ! Total Button
        Button totalButton = new Button("TOTAL");
        totalButton.setBounds(380, 480, 150, 40);
        totalButton.setFont(new Font("TimesRoman", Font.BOLD, 17));
        totalButton.setBackground(Color.black);
        mainFrame.add(totalButton);

        // ! Average Button
        Button averageButton = new Button("AVERAGE");
        averageButton.setBounds(610, 480, 150, 40);
        averageButton.setFont(new Font("TimesRoman", Font.BOLD, 17));
        averageButton.setBackground(Color.black);
        mainFrame.add(averageButton);

        // ! Clear Button
        Button clearButton = new Button("CLEAR");
        clearButton.setBounds(830, 480, 150, 40);
        clearButton.setFont(new Font("TimesRoman", Font.BOLD, 17));
        clearButton.setBackground(Color.red);
        mainFrame.add(clearButton);

        // ? Result or Answers Display
        Label answerOutPutLabel = new Label("Display of all answers here:");
        answerOutPutLabel.setBounds(50, 550, 280, 30);
        answerOutPutLabel.setBackground(new Color(28, 61, 91));
        answerOutPutLabel.setFont(new Font("TimesRoman", Font.PLAIN, 19));
        mainFrame.add(answerOutPutLabel);

        TextField answerOutPutTextField = new TextField();
        answerOutPutTextField.setBounds(340, 550, 400, 30);
        mainFrame.add(answerOutPutTextField);

        // ! Grade Button
        Button gradeButton = new Button("Click To Check Grade");
        gradeButton.setBounds(50, 630, 240, 40);
        gradeButton.setFont(new Font("TimesRoman", Font.BOLD, 17));
        gradeButton.setBackground(Color.black);
        mainFrame.add(gradeButton);

        TextField gradeTextField = new TextField();
        gradeTextField.setBounds(310, 630, 400, 40);
        mainFrame.add(gradeTextField);

        // Todo: Adding ActionListener to The Total, Avarege, and Percentage Buttons

        // Percentage Button
        percentageButton.addActionListener(e -> {
            double AdvanceEnglish = Integer.parseInt(moduleOnTextField.getText());
            double CShartPrograming = Integer.parseInt(moduleTwoTextField.getText());
            double JavaProgramming = Integer.parseInt(moduleThreeTextField.getText());
            double SystemAnalysisAndDesign = Integer.parseInt(moduleFourTextField.getText());
            double SyetemAdministrationLinux = Integer.parseInt(moduleFiveTextField.getText());
            double MobileAppDevelopment = Integer.parseInt(moduleSixTextField.getText());
            double HumanComputerInteraction = Integer.parseInt(moduleSevenTextField.getText());
            double ASPNET = Integer.parseInt(moduleEightTextField.getText());

            if (AdvanceEnglish > 100 || AdvanceEnglish < 0 || CShartPrograming > 100 || CShartPrograming < 0
                    || JavaProgramming > 100 || JavaProgramming < 0 || SystemAnalysisAndDesign > 100
                    || SystemAnalysisAndDesign < 0 || SyetemAdministrationLinux > 100 || SyetemAdministrationLinux < 0
                    || HumanComputerInteraction > 100 || HumanComputerInteraction < 0 || ASPNET > 100 || ASPNET < 0) {
                answerOutPutTextField.setText("Please Enter a valid number");
                outOfMarksTextField.setText("Please enter a valid numbe");
            } else {

                double sum = AdvanceEnglish + CShartPrograming + JavaProgramming + SystemAnalysisAndDesign
                        + SyetemAdministrationLinux + MobileAppDevelopment + HumanComputerInteraction + ASPNET;

                double percentage = (sum / 800) * 100;

                answerOutPutTextField.setText(String.valueOf(percentage));
            }

            if (AdvanceEnglish > 100 || AdvanceEnglish < 0) {
                moduleOnTextField.setBackground(Color.red);
            } else {
                moduleOnTextField.setBackground(Color.WHITE);
            }

            if (CShartPrograming > 100 || CShartPrograming < 0) {
                moduleTwoTextField.setBackground(Color.red);
            } else {
                moduleTwoTextField.setBackground(Color.WHITE);
            }

            if (JavaProgramming > 100 || JavaProgramming < 0) {
                moduleThreeTextField.setBackground(Color.red);
            } else {
                moduleThreeTextField.setBackground(Color.WHITE);
            }

            if (SystemAnalysisAndDesign > 100 || SystemAnalysisAndDesign < 0) {
                moduleFourTextField.setBackground(Color.red);
            } else {
                moduleFourTextField.setBackground(Color.WHITE);
            }

            if (SyetemAdministrationLinux > 100 || SyetemAdministrationLinux < 0) {
                moduleFiveTextField.setBackground(Color.red);
            } else {
                moduleFiveTextField.setBackground(Color.WHITE);
            }

            if (MobileAppDevelopment > 100 || MobileAppDevelopment < 0) {
                moduleSixTextField.setBackground(Color.red);
            } else {
                moduleSixTextField.setBackground(Color.WHITE);
            }

            if (HumanComputerInteraction > 100 || HumanComputerInteraction < 0) {
                moduleSevenTextField.setBackground(Color.red);
            } else {
                moduleSevenTextField.setBackground(Color.WHITE);
            }

            if (ASPNET > 100 || ASPNET < 0) {
                moduleEightTextField.setBackground(Color.red);
            } else {
                moduleEightTextField.setBackground(Color.WHITE);
            }
        });

        // Total Button
        totalButton.addActionListener(e -> {
            double AdvanceEnglish = Integer.parseInt(moduleOnTextField.getText());
            double CShartPrograming = Integer.parseInt(moduleTwoTextField.getText());
            double JavaProgramming = Integer.parseInt(moduleThreeTextField.getText());
            double SystemAnalysisAndDesign = Integer.parseInt(moduleFourTextField.getText());
            double SyetemAdministrationLinux = Integer.parseInt(moduleFiveTextField.getText());
            double MobileAppDevelopment = Integer.parseInt(moduleSixTextField.getText());
            double HumanComputerInteraction = Integer.parseInt(moduleSevenTextField.getText());
            double ASPNET = Integer.parseInt(moduleEightTextField.getText());

            if (AdvanceEnglish > 100 || AdvanceEnglish < 0 || CShartPrograming > 100 || CShartPrograming < 0
                    || JavaProgramming > 100 || JavaProgramming < 0 || SystemAnalysisAndDesign > 100
                    || SystemAnalysisAndDesign < 0 || SyetemAdministrationLinux > 100 || SyetemAdministrationLinux < 0
                    || HumanComputerInteraction > 100 || HumanComputerInteraction < 0 || ASPNET > 100 || ASPNET < 0) {
                answerOutPutTextField.setText("Please Enter a valid number");
                outOfMarksTextField.setText("Please enter a valid numbe");
            } else {

                double sum = AdvanceEnglish + CShartPrograming + JavaProgramming + SystemAnalysisAndDesign
                        + SyetemAdministrationLinux + MobileAppDevelopment + HumanComputerInteraction + ASPNET;

                answerOutPutTextField.setText(String.valueOf(sum));
                outOfMarksTextField.setText(sum + "Out of 800");
            }

            if (AdvanceEnglish > 100 || AdvanceEnglish < 0) {
                moduleOnTextField.setBackground(Color.red);
            } else {
                moduleOnTextField.setBackground(Color.WHITE);
            }

            if (CShartPrograming > 100 || CShartPrograming < 0) {
                moduleTwoTextField.setBackground(Color.red);
            } else {
                moduleTwoTextField.setBackground(Color.WHITE);
            }

            if (JavaProgramming > 100 || JavaProgramming < 0) {
                moduleThreeTextField.setBackground(Color.red);
            } else {
                moduleThreeTextField.setBackground(Color.WHITE);
            }

            if (SystemAnalysisAndDesign > 100 || SystemAnalysisAndDesign < 0) {
                moduleFourTextField.setBackground(Color.red);
            } else {
                moduleFourTextField.setBackground(Color.WHITE);
            }

            if (SyetemAdministrationLinux > 100 || SyetemAdministrationLinux < 0) {
                moduleFiveTextField.setBackground(Color.red);
            } else {
                moduleFiveTextField.setBackground(Color.WHITE);
            }

            if (MobileAppDevelopment > 100 || MobileAppDevelopment < 0) {
                moduleSixTextField.setBackground(Color.red);
            } else {
                moduleSixTextField.setBackground(Color.WHITE);
            }

            if (HumanComputerInteraction > 100 || HumanComputerInteraction < 0) {
                moduleSevenTextField.setBackground(Color.red);
            } else {
                moduleSevenTextField.setBackground(Color.WHITE);
            }

            if (ASPNET > 100 || ASPNET < 0) {
                moduleEightTextField.setBackground(Color.red);
            } else {
                moduleEightTextField.setBackground(Color.WHITE);
            }
        });

        clearButton.addActionListener(e -> {
            moduleOnTextField.setText("");
            moduleTwoTextField.setText("");
            moduleThreeTextField.setText("");
            moduleFourTextField.setText("");
            moduleFiveTextField.setText("");
            moduleSixTextField.setText("");
            moduleSevenTextField.setText("");
            moduleEightTextField.setText("");
        });

    }

}
