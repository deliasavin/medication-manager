import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Application that helps one to keep tack of their remaining mediction.
public class MedicationManager extends JFrame
{
    //Constructor
    public MedicationManager()
    {
        setTitle("Medication Manager");
        Container contents = getContentPane();
        // Use a grid layout with one column.
        contents.setLayout(new GridLayout(0, 1));

        JLabel existingMedsOrNot = new JLabel("No medication added yet.");
        contents.add(existingMedsOrNot);
        JButton addNewMedication = new JButton("Add new medication");
        contents.add(addNewMedication);

        // The action listener for the button needs to update the number of
        //medications, so we pass that referenec to its constructor.
        AddNewMedicationActionListener listener
        = new AddNewMedicationActionListener(existingMedsOrNot);
        addNewMedication.addActionListener(listener);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // MedicationManager

    //Create a MedicationManager and make it appear on screen
    public static void main(String[] args)
    {
        MedicationManager theMedicationManager = new MedicationManager();
        theMedicationManager.setVisible(true);
    } // main
} // class MedicationManager