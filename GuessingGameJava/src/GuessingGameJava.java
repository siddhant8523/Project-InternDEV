//importing necessary packages
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessingGameJava implements ActionListener, KeyListener {

	UIManager UI=new UIManager();
	JFrame frame;
	JLabel textLabel3;
	JLabel textLabel4;
	JLabel textLabel5;
	JTextField guessTextField;
	JButton guessButton;
	JButton giveUpButton;
	JButton newGameButton;
	JLabel attemptsLabel;
	JLabel timeTakenLabel;
	JTextField attemptsField;
	JTextField timeTakenField;
	Timer timer;
	Random random=new Random();
	int randomNumber=random.nextInt(100)+1;
	int attemptCount =0;
	int scoreCount=0;
	int elapsedTime=0;
	int minutes=0;
	int seconds=0;
	int temp=0;
	String second_string=String.format("%02d",seconds);
	String minute_string=String.format("%02d",minutes);

	GuessingGameJava(){

		UI.put("OptionPane.background",new Color(160,160,160));
		UI.put("Panel.background", new Color(160,160,160));

		UI.put("OptionPane.messageForeground", Color.black );
		UI.put("OptionPane.messageFont",new Font("Arial",Font.BOLD,13));
		frame =new JFrame();
		frame.setTitle("Number Guessing Game");
		frame.getContentPane().setLayout(null);

		textLabel3 =new JLabel();
		textLabel3.setText("Guess The Number");
		textLabel3.setFont(new Font("Arial", Font.BOLD, 30));
		textLabel3.setForeground(new Color(0,0,0));
		textLabel3.setBounds(30,0,300,50);

		textLabel4 =new JLabel();
		textLabel4.setText("Enter the Number b/w(0 to 100)");
		textLabel4.setFont(new Font("Arial", Font.ITALIC, 20));
		textLabel4.setForeground(Color.black);
		textLabel4.setBounds(20,40,400,50);

		guessTextField =new JTextField();
		guessTextField.setDocument(new JTextFieldCharLimit(2));
		guessTextField.setHorizontalAlignment(SwingConstants.LEFT);
		guessTextField.setBounds(20,90,145,30);
		guessTextField.setFont(new Font("Arial",Font.BOLD,20));
		guessTextField.setBorder(BorderFactory.createBevelBorder(1));

		guessButton = new JButton();
		guessButton.setText("Guess");
		guessButton.setFont(new Font("Arial",Font.BOLD,20));
		guessButton.setBounds(180,87,125,35);
		guessButton.setFocusable(false);
		guessButton.setForeground(Color.black);

		textLabel5 =new JLabel();
		textLabel5.setText("");
		textLabel5.setFont(new Font("Arial", Font.BOLD, 18));
		textLabel5.setForeground(Color.black);
		textLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		textLabel5.setBounds(5,120,150,100);

		giveUpButton = new JButton();
		giveUpButton.setText("Give UP");
		giveUpButton.setFont(new Font("Arial",Font.BOLD,17));
		giveUpButton.setBounds(180,140,125,35);
		giveUpButton.setFocusable(false);
		giveUpButton.setForeground(Color.black);

		newGameButton = new JButton();
		newGameButton.setText("New Game");
		newGameButton.setFont(new Font("Arial",Font.BOLD,17));
		newGameButton.setBounds(180,190,125,35);
		newGameButton.setFocusable(false);
		newGameButton.setForeground(Color.black);

		attemptsLabel=new JLabel();
		attemptsLabel.setText("Attempts Made");
		attemptsLabel.setFont(new Font("Arial",Font.BOLD,15));
		attemptsLabel.setBounds(10,5,125,35);
		attemptsLabel.setForeground(Color.black);

		attemptsField=new JTextField();
		attemptsField.setEditable(false);
		attemptsField.setBounds(230,14,70,15);
		attemptsField.setHorizontalAlignment(SwingConstants.CENTER);
		attemptsField.setFont(new Font("Arial",Font.BOLD,13));
		attemptsField.setBorder(BorderFactory.createBevelBorder(1));

		guessButton.addActionListener(this);
		giveUpButton.addActionListener(this);
		newGameButton.addActionListener(this);

		guessTextField.addKeyListener(this);
		frame.add(textLabel3);
		frame.add(textLabel4);
		frame.add(textLabel5);
		frame.add(guessTextField);
		frame.add(guessButton);
		frame.add(giveUpButton);
		frame.add(newGameButton);
		frame.getContentPane().setBackground(Color.lightGray);
		frame.setSize(350,280);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		countDownTimer();
		timer.start();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		char c=e.getKeyChar();

		if(!Character.isDigit(c)||Character.isWhitespace(c)){
			if(!(e.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
				Toolkit.getDefaultToolkit().beep();
			}
			e.consume();
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==guessButton) {
			if (guessTextField.getText().equals("")) {
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
			} else {
				attemptCount++;
				attemptsField.setText(Integer.toString(attemptCount));
				int number = Integer.parseInt(guessTextField.getText());
				if (randomNumber == number) {
					timer.stop();
					guessTextField.setEditable(false);
					guessTextField.getCaret().setVisible(false);
					textLabel5.setText("");
					guessTextField.setText("");
					temp++;
					JOptionPane.showMessageDialog(null,"YOU WIN! Correct Guess was "+randomNumber+"\nClick on New Game to Play Again","Victory",JOptionPane.INFORMATION_MESSAGE);
				} else if (randomNumber > number) {
					textLabel5.setText(number + " is Low.");
				} else if (randomNumber < number) {
					textLabel5.setText(number + " is High Try.");
				}
			}
		}
		if(e.getSource()==giveUpButton){
			timer.stop();
			textLabel5.setText("");
			guessTextField.setText("");
			guessTextField.setEnabled(false);
			JOptionPane.showMessageDialog(null,+randomNumber+" is the right guess");
		}
		if(e.getSource()==newGameButton){
			elapsedTime=0;
			seconds=0;
			minutes=0;
			timer.start();
			attemptCount =0;
			textLabel5.setText("");
			timeTakenField.setText("");
			attemptsField.setText("");
			guessTextField.setText("");
			guessTextField.setEnabled(true);
			guessTextField.setEditable(true);
			guessTextField.getCaret().setVisible(true);
			guessTextField.requestFocus();
			randomNumber=random.nextInt(100)+1;
		}
	}
	public void countDownTimer(){


		timer=new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				elapsedTime=elapsedTime+1000;
				minutes=(elapsedTime/60000)%60;
				seconds=(elapsedTime/1000)%60;
				second_string=String.format("%02d",seconds);
				minute_string=String.format("%02d",minutes);
				timeTakenField.setText(minute_string+":"+second_string);
			}
		});
	}
	public static void main(String[] args) {
		GuessingGameJava guessingGameJava=new GuessingGameJava();
	}
}

class JTextFieldCharLimit extends PlainDocument
{
	int limit;
	public JTextFieldCharLimit(int limitation){
		this.limit=limitation;
	}
	public void insertString(int offset, String str, AttributeSet set)throws BadLocationException {
		if(str==null){
			return;
		}else if(getLength() + str.length() <=limit){
			super.insertString(offset, str, set);
		}
		else if(getLength() + str.length() >limit){
			Toolkit.getDefaultToolkit().beep();
		}
	}
}
