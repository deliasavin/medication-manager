import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

// The ActionListener for MedicationManager's AddNewMedication JButton. Each
// time actionPerformed is called, we count the numver of medication, and update
// the given JLabel with that count.
public class AddNewMedicationActionListener implements ActionListener
{
  // The JLabel that need to be updated
  private final JLabel numberOfMedicationsJLabel;

  // We count the its number, so it is clear when we have a new one.
  private int noOfMeds = 0;

  // Constructor
  public AddNewMedicationActionListener (JLabel requiredAddNewMedicationJLabel)
  {
    numberOfMedicationsJLabel = requiredAddNewMedicationJLabel;
  } // AddNewMedicationActionListener

  // Action performed: update noOfMeds and numberOfMedicationsJLabel.
  public void actionPerformed(ActionEvent event)
  {
    noOfMeds++;
    numberOfMedicationsJLabel.setText("You have " + noOfMeds + " meds saved.");
  } // actionPerformed
} // class AddNewMedicationActionListener